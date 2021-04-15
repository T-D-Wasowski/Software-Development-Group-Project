package dataverse;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;


public class UserController {
    
    UserDatabase database = new UserDatabase();

    public int register(String username, String email, String password, Boolean adminFlag) {
        
        ResultSet userNameResults = database.getUserByUsername(username);
        
        try {
            if (userNameResults.next() == false && (username.length() >= 3 && username.length() <= 32)) {
                              
                ResultSet userEmailResults = database.getUserByEmail(email);
                
                if (userEmailResults.next() == false && (email.length() >= 3 && email.length() <= 255)) {                   
                    
                    if (password.length() >= 8 && password.length() <= 32) {
                        
                        String salt = PasswordUtility.getSalt(30);
                        String securePassword = PasswordUtility.generateSecurePassword(password, salt);
                        
                        String isAdmin;
                        
                        if (adminFlag) {
                            isAdmin = "1";
                        } else {
                            isAdmin = "0";
                        }
                        
                        database.addUser(username, email, securePassword, salt, isAdmin);
                        
                        return 1; //Return 1 if account is created successfully
                        
                    } else {
                        return 3; //Returns 3 if password is invalid
                    }
                    
                } else {
                    return 2; //Return 2 if email is aleady taken or invalid       
                }      
                
            } else {
                return 0; //Returns 0 if username already taken or username is invalid
            }
            
        } catch (SQLException e) {            
            System.out.println("SQL Exception error: " + e.getMessage());
            return 4; //Return 4 when there is an SQL exception error
        } finally {
            database.disconnect();
        }
    }
    
    public int login(String username, String password) {
        
        ResultSet user = database.getUserByUsername(username);
        
        try {
            //Checks next result in result set, which is the first result (starts at 0)
            //If it's false, means result set is empty.
            if(user.next() == false) {
                
                System.out.println("User does not exist, please register.");
                return 0; //Return 0 when user doesn't exist
                
            } else {
                
                    boolean passwordMatch = PasswordUtility.verifyUserPassword(
                            password,
                            user.getString("userEncryptedPassword"),
                            user.getString("userEncryptionSalt")
                    );
                    
                    if (passwordMatch) {
                        return 1; //Return 1 when password matches
                    } else {
                        return 2; //Return 2 when password doesnt match
                    }        
                }
            
        } catch (SQLException e) {                           
            System.out.println("SQL Exception error: " + e.getMessage());
            return 3; //Return 3 when there is an SQL exception error               
        } finally {
            database.disconnect();
        }
        
        
    }
    
    public void recreateDatabase() {
        
        database.createTables();
        
    }     
}

class UserDatabase {
    
    Connection connection;
        
    private void downloadDriver() {
        try {
            Driver driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("SQLite driver downloaded.");
        } catch (SQLException e) {
            System.out.println("Error downloading SQLite driver: " + e.getMessage());
        }
    }
    
    
    private void connect() {
        
        downloadDriver();
        
        //Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:../user.db");
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
        
        //return connection;
        
    }
    
    public void disconnect(/*Connection connection*/) {
        
        try {
            if (!connection.isClosed()) {
                connection.close();
                System.out.println("Connection successfully closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
        
    }
    
    public void createTables() {
        
        /*Connection connection = */connect();
        
        String sqlDropLogString = "DROP TABLE IF EXISTS log;";
        String sqlDropUserString = "DROP TABLE IF EXISTS user;";
        
        String sqlCreateUserString = "CREATE TABLE user"
                + "("
                    + "userID INTEGER PRIMARY KEY,"
                    + "userName VARCHAR(255) UNIQUE NOT NULL,"
                    + "userEmail VARCHAR(255) UNIQUE NOT NULL,"
                    + "userEncryptedPassword VARCHAR(44) NOT NULL,"
                    + "userEncryptionSalt VARCHAR(30) NOT NULL," 
                    + "userAdminFlag BOOLEAN NOT NULL"
                + ");";
        
        String sqlCreateLogString = "CREATE TABLE log"
                + "("
                    + "logID INTEGER PRIMARY KEY,"
                    + "logDateTime DATETIME NOT NULL,"
                    + "logReason BOOLEAN NOT NULL,"
                    + "userID INTEGER NOT NULL,"
                
                    + "FOREIGN KEY (userID)"
                    + "REFERENCES user(userID)"
                + ");";
        
        try {
            Statement sqlStatement = connection.createStatement();
            
            sqlStatement.addBatch(sqlDropLogString);
            sqlStatement.addBatch(sqlDropUserString);
            sqlStatement.addBatch(sqlCreateUserString);
            sqlStatement.addBatch(sqlCreateLogString);
            
            //Database set to auto commit.
            sqlStatement.executeBatch();
 
            System.out.println("Database tables successfully created.");
        } catch (SQLException e) {
            System.out.println("Problem creating database tables: " + e.getMessage());       
        }

        disconnect(/*connection*/); 
        
    }
    
    public void addUser(String username, String email, String password, String salt, String adminFlag) throws SQLException {
        
        /*Connection connection = */connect();
        
        String sqlString = "INSERT INTO User"
                + "("
                    + "userName,"
                    + "userEmail,"
                    + "userEncryptedPassword,"
                    + "userEncryptionSalt,"
                    + "userAdminFlag"
                + ") VALUES ("
                    + "'" + username + "',"
                    + "'" + email + "',"
                    + "'" + password + "',"
                    + "'" + salt + "',"
                    + adminFlag
                + ");";

        Statement sqlStatement = connection.createStatement();
        sqlStatement.executeUpdate(sqlString);      

        System.out.println("User inserted into database.");
       
        disconnect(/*connection*/);
    }
    
    public ResultSet getUserById(int userId) {
    
        /*Connection connection = */connect();
        
        String sqlString = "SELECT * FROM user"
                + "WHERE userID = " + userId + ";";
        
        ResultSet result = null;
        
        try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            System.out.println("Results retrieved from database.");
        } catch (SQLException e) {
            System.out.println("Problem retrieving user by id: " + e.getMessage());
        }

        return result;
        
    }
    
    public ResultSet getUserByUsername(String userName) {
        
        /*Connection connection = */connect();
        
        String sqlString = "SELECT * FROM user "
                + "WHERE userName = '" + userName + "';";
  
        ResultSet result = null;
        
        try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            System.out.println("Results retrieved from database.");
            
        } catch (SQLException e) {
            System.out.println("Problem retrieving user by username: " + e.getMessage());
        }
        
        return result;
        
    }
    
    public ResultSet getUserByEmail(String userEmail) {
        
        /*Connection connection = */connect();
        
        String sqlString = "SELECT * FROM user "
                + "WHERE userEmail = '" + userEmail + "';";
  
        ResultSet result = null;
        
        try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            System.out.println("Results retrieved from database.");
        } catch (SQLException e) {
            System.out.println("Problem retrieving user by username: " + e.getMessage());
        }

        return result;
        
    }
    
    public void getAllUsers() {
        
    }
    
    public void editUser() {
        
    }
    
    public void deleteUser() {
        
    }
    
   
}

/* The class below has not been written by us. It has been sourced from the LW8 Lecture for the 
purpose of password security. It generates random salt values and encrypts passwords. */
class PasswordUtility {
    
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;
    
     public static String getSalt(int length) {
        StringBuilder returnValue = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(returnValue);
    }

    public static byte[] hash(char[] password, byte[] salt) {
        PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
        Arrays.fill(password, Character.MIN_VALUE);
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return skf.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
        } finally {
            spec.clearPassword();
        }
    }

    public static String generateSecurePassword(String password, String salt) {
        String returnValue = null;

        byte[] securePassword = hash(password.toCharArray(), salt.getBytes());
 
        returnValue = Base64.getEncoder().encodeToString(securePassword);
 
        return returnValue;
    }
    
    public static boolean verifyUserPassword(String providedPassword,
            String securedPassword, String salt)
    {
        boolean returnValue; //=false
        
        // Generate New secure password with the same salt
        String newSecurePassword = generateSecurePassword(providedPassword, salt);
        
        // Check if two passwords are equal
        returnValue = newSecurePassword.equalsIgnoreCase(securedPassword);
        
        return returnValue;
    }
}

