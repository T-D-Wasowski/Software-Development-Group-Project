package dataverse;

public class User {
    
    Integer userID;
    String userName;
    String userEmail;
    String userEncryptedPassword;
    String userEncryptionSalt;
    Boolean userAdminFlag;
    
    public User() {
        
    }
    
    public User(
            Integer userID, 
            String userName, 
            String userEmail, 
            String userEncryptedPassword, 
            String userEncryptionSalt, 
            Boolean userAdminFlag) {
        
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userEncryptedPassword = userEncryptedPassword;
        this.userEncryptionSalt = userEncryptionSalt;
        this.userAdminFlag = userAdminFlag;
        
    }
    
    public Integer getUserID() {
        return userID;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String getUserEmail() {
        return userEmail;
    }
    
    public String getUserEncryptedPassword() {
        return userEncryptedPassword;
    }
    
    public String getUserEncryptionSalt() {
        return userEncryptionSalt;
    }
    
    public Boolean getUserAdminFlag() {
        return userAdminFlag;
    }
    
}
