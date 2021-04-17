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
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UserController {
    
    UserDatabase database = new UserDatabase();

    public int register(String username, String email, String password, Boolean adminFlag) {
        
        User user = database.getUserByUsername(username);
        
        try {
            if (user == null && (username.length() >= 3 && username.length() <= 32)) {
                              
                user = database.getUserByEmail(email);
                
                if (user == null && (email.length() >= 3 && email.length() <= 255)) {                   
                    
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
        }
        
    }
    
    public int login(String username, String password) {
        
        User user = database.getUserByUsername(username);
        
        //Checks next result in result set, which is the first result (starts at 0)
        //If it's false, means result set is empty.
        if(user == null) {

            System.out.println("User does not exist, please register.");
            return 0; //Return 0 when user doesn't exist

        } else {

                boolean passwordMatch = PasswordUtility.verifyUserPassword(
                        password,
                        user.getUserEncryptedPassword(),
                        user.getUserEncryptionSalt()
                );

                if (passwordMatch) {   


                    //Determine if user is admin                     
                    if (user.getUserAdminFlag()) {
                        return 1; //Return 1 when password matches and is admin
                    } else {
                        return 3; //Return 3 when password matches and is NOT admin
                    }
                } else {
                    return 2; //Return 2 when password doesnt match
                }        
            }              
    }
    
    public void createLog(Boolean logReason, User user) {
        
        //Getting current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println(formatter.format(now)); //Test
        
        //User user = database.getUserByUsername(username);  
        
        try {
            database.addLog(formatter.format(now), logReason, user.getUserID());
            System.out.println("Log successfully created and added to the database.");
        } catch (SQLException e) {
            System.out.println("Error adding log to database: " + e.getMessage());
        }
           
    }
    
    public Object[][] displayUserData() {
        
        ArrayList<User> userList = database.getAllUsers();
        
        //4 because only 4 of the user attributes are to be displayed
        Object[][] data = new Object[userList.size()][4];
        int counter = 0;

        for (User user : userList) {
            
            Object[] userData = {
                user.getUserID(), 
                user.getUserName(), 
                user.getUserEmail(), 
                user.getUserAdminFlag()
            };
            
            data[counter] = (userData);
            counter++;
            
        }
        
        return data;
        
    }
    
    public Object[][] displayLogData() {
        
        ArrayList<Log> logList = database.getAllLogs();
        
        //4 because only 4 of the user attributes are to be displayed
        Object[][] data = new Object[logList.size()][4];
        int counter = 0;
        String logReason = null;

        for (Log log : logList) {

            if (log.getLogReason()) {
               logReason = "Login";
            } else {
               logReason = "Logout";
            }
            
            Object[] logData = {
                log.getLogID(), 
                log.getLogDateTime(), 
                logReason, 
                log.getUserID()
            };
            
            data[counter] = (logData);
            counter++;
            
        }
        
        return data;
        
    }
    
    public int editUser(String username, String newUserName, String newUserEmail, String newUserPassword, Boolean changeUserAdminFlag) {
        
        User user = database.getUserByUsername(username);
        
        String updateUsername;
        String updateEmail;
        String updateEncryptedPassword;
        String updateEncryptionSalt;
        Boolean updateAdminFlag;
        
        //Checks for changes in attributes
        if (newUserName.equals("")) {
            updateUsername = user.getUserName();
        } else {
            updateUsername = newUserName;
        }
        
        if (newUserEmail.equals("")) {
            updateEmail = user.getUserEmail();
        } else {
            updateEmail = newUserEmail;
        }
        
        if (newUserPassword.equals("")) {
            updateEncryptedPassword = user.getUserEncryptedPassword();
            updateEncryptionSalt = user.getUserEncryptionSalt();
        } else if (newUserPassword.length() >= 8 && newUserPassword.length() <= 32) {
            updateEncryptionSalt = PasswordUtility.getSalt(30);
            updateEncryptedPassword = PasswordUtility.generateSecurePassword(newUserPassword, updateEncryptionSalt);
        } else {
            return 3; //Password invalid! 
        }
        
        if (changeUserAdminFlag == false) {
            updateAdminFlag = user.getUserAdminFlag();
        } else {
            updateAdminFlag = !user.getUserAdminFlag();
        }
        
        //Validation checks       
        User userCheck = null;
        
        //Checks if updated username is available
        if (!username.equals(updateUsername)) {
            userCheck = database.getUserByUsername(updateUsername);
        }
        
        try {
            
            if (userCheck == null && (updateUsername.length() >= 3 && updateUsername.length() <= 32)) {
                         
                userCheck = null;
                
                if (!user.getUserEmail().equals(updateEmail)) {
                    userCheck = database.getUserByUsername(updateEmail);
                }
                
                if (userCheck == null && (updateEmail.length() >= 3 && updateEmail.length() <= 255)) {                   
                    
                    database.updateUser(username, updateUsername, updateEmail, updateEncryptedPassword, updateEncryptionSalt, updateAdminFlag);

                    return 1; //Return 1 if account is updated successfully
      
                } else {
                    return 2; //Return 2 if email is aleady taken or invalid       
                }      
                
            } else {
                return 0; //Returns 0 if username already taken or username is invalid
            } 

        } catch (SQLException e) {
            System.out.println("Error updating user: " + e.getMessage());
            return 4; //Means error updating
        }

    }
    
    public void recreateDatabase() {
        
        database.createTables();
        
    }     
}

class UserDatabase {
        
    private void downloadDriver() {
        try {
            Driver driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("SQLite driver downloaded.");
        } catch (SQLException e) {
            System.out.println("Error downloading SQLite driver: " + e.getMessage());
        }
    }
    
    
    private Connection connect() {
        
        downloadDriver();
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:../user.db");
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
        
        return connection;
        
    }
    
    public void disconnect(Connection connection) {
        
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
        
        Connection connection = connect();
        
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

        disconnect(connection); 
        
    }
    
    public void addUser(String username, String email, String password, String salt, String adminFlag) throws SQLException {
        
        Connection connection = connect();
        
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
       
        disconnect(connection);
    }
    
    public void addLog(String logDateTime, Boolean logReason, Integer userID) throws SQLException {
        
        Connection connection = connect();
        
        String sqlString = "INSERT INTO Log"
                + "("
                    + "logDateTime,"
                    + "logReason,"
                    + "userID" 
                + ") VALUES ("
                    + "'" + logDateTime + "',"
                    + logReason + ","
                    + userID
                + ");";
        
        Statement sqlStatement = connection.createStatement();
        sqlStatement.executeUpdate(sqlString);      

        System.out.println("Log inserted into database.");
       
        disconnect(connection);
        
    }
    
    public User getUserById(int userId) {
    
        Connection connection = connect();
        
        String sqlString = "SELECT * FROM user "
                + "WHERE userID = " + userId  + ";";
        
        ResultSet result = null;
  
        User user = null;
        
        try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            
            if (result.next()) {
                System.out.println("Results retrieved from database.");

                user = new User(
                        result.getInt("userID"),
                        result.getString("userName"), 
                        result.getString("userEmail"), 
                        result.getString("userEncryptedPassword"), 
                        result.getString("userEncryptionSalt"), 
                        result.getBoolean("userAdminFlag")
                );
            } else {
                System.out.println("This user does not exist!");
            }

        } catch (SQLException e) {
            System.out.println("Problem retrieving user by id: " + e.getMessage());
        }

        disconnect(connection);
        
        return user;
        
    }
    
    public User getUserByUsername(String userName) {
        
        Connection connection = connect();
        
        String sqlString = "SELECT * FROM user "
                + "WHERE userName = '" + userName + "';";
  
        ResultSet result = null;
        
        User user = null;
        
       try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            
            if (result.next()) {
                System.out.println("Results retrieved from database.");

                user = new User(
                        result.getInt("userID"),
                        result.getString("userName"), 
                        result.getString("userEmail"), 
                        result.getString("userEncryptedPassword"), 
                        result.getString("userEncryptionSalt"), 
                        result.getBoolean("userAdminFlag")
                );
            } else {
                System.out.println("This user does not exist!");
            }
            
        } catch (SQLException e) {
            System.out.println("Problem retrieving user by username: " + e.getMessage());
        }
        
        disconnect(connection);
        
        return user;
        
    }
    
    public User getUserByEmail(String userEmail) {
        
        Connection connection = connect();
        
        String sqlString = "SELECT * FROM user "
                + "WHERE userEmail = '" + userEmail + "';";
  
        ResultSet result = null;
        
        User user = null;
        
        
        try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            
            if (result.next()) {
                System.out.println("Results retrieved from database.");

                user = new User(
                        result.getInt("userID"),
                        result.getString("userName"), 
                        result.getString("userEmail"), 
                        result.getString("userEncryptedPassword"), 
                        result.getString("userEncryptionSalt"), 
                        result.getBoolean("userAdminFlag")
                );
            } else {
                System.out.println("This user does not exist!");
            }
            
        } catch (SQLException e) {
            System.out.println("Problem retrieving user by username: " + e.getMessage());
        }
        
        disconnect(connection);

        return user;
        
    }
    
    public ArrayList getAllUsers() {
        
        Connection connection = connect();
        
        String sqlString = "SELECT * FROM user;";
  
        ResultSet result = null;
        
        ArrayList<User> userList = new ArrayList();
        
        User user = null;

        try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            
            while(result.next()) {
                
                user = new User(
                        result.getInt("userID"),
                        result.getString("userName"), 
                        result.getString("userEmail"), 
                        result.getString("userEncryptedPassword"), 
                        result.getString("userEncryptionSalt"), 
                        result.getBoolean("userAdminFlag")
                );
                
                userList.add(user);    
            }
              
        } catch (SQLException e) {
            System.out.println("Problem retrieving all users: " + e.getMessage());
        }
        
        disconnect(connection);

        return userList;
    }
    
    public ArrayList getAllLogs() {
        
        Connection connection = connect();
        
        String sqlString = "SELECT * FROM log;";
  
        ResultSet result = null;
        
        ArrayList<Log> logList = new ArrayList();
        
        Log log = null;

        try { 
            Statement sqlStatement = connection.createStatement(); 
            result = sqlStatement.executeQuery(sqlString);
            
            while(result.next()) {
                
                log = new Log(
                        result.getInt("logID"),
                        result.getString("logDateTime"), 
                        result.getBoolean("logReason"), 
                        result.getInt("userID")
                );
                
                logList.add(log);    
            }
              
        } catch (SQLException e) {
            System.out.println("Problem retrieving all logs: " + e.getMessage());
        }
        
        disconnect(connection);

        return logList;
        
    }
    
    public void updateUser(String username, String newUserName, String newEmail, String newEncryptedPassword, String newEncryptionSalt, Boolean newAdminFlag) throws SQLException {
        
        Connection connection = connect();
        
        String sqlString = "UPDATE user "
                + "SET "
                    + "userName = '" + newUserName + "',"
                    + "userEmail = '" + newEmail + "',"
                    + "userEncryptedPassword = '" + newEncryptedPassword + "',"
                    + "userEncryptionSalt = '" + newEncryptionSalt + "',"
                    + "userAdminFlag = " + newAdminFlag + " "
                + "WHERE userName = '" + username + "';";

        Statement sqlStatement = connection.createStatement();
        sqlStatement.executeUpdate(sqlString);      

        System.out.println("User updated!");
       
        disconnect(connection);
        
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

