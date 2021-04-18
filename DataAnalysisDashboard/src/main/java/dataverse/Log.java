package dataverse;

public class Log {
    
    private Integer logID;
    private String logDateTime;
    private Boolean logReason;
    private Integer userID;
    
    public Log(Integer logID, String logDateTime, Boolean logReason, Integer userID) {
        
        this.logID = logID;
        this.logDateTime = logDateTime;
        this.logReason = logReason;
        this.userID = userID;
        
    }
    
    public Integer getLogID() {
        return logID;
    }
    
    public String getLogDateTime() {
        return logDateTime;
    }
    
    public Boolean getLogReason() {
        return logReason;
    }
    
    public Integer getUserID() {
        return userID;
    }
}
