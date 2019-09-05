package pojo;

import java.util.Date;

/**
 * CREATE TABLE user (
 * userID int(11) PRIMARY KEY NOT NULL,
 * userNickName varchar(32) DEFAULT NULL,
 * userName varchar(32) NOT NULL,
 * userSex varchar(10) DEFAULT NULL,
 * passWord varchar(48) NOT NULL,
 * userBirthTime datetime,
 * userHand text,
 * userAddress varchar(160) DEFAULT NULL,
 * userPhone varchar(11) NOT NULL,
 * userQQ varchar(32) DEFAULT NULL,
 * userEmail varchar(32) DEFAULT NULL,
 * userCollection varchar(160) DEFAULT NULL
 * );
 */
public class User {
    private Integer userID;
    private String userNickName;
    private String userName;
    private String userSex;
    private String passWord;
    private Date userBirthTime;
    private String userHand;
    private String userAddress;
    private String userPhone;
    private String userQQ;
    private String userEmail;
    private String userCollection;

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userNickName='" + userNickName + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userBirthTime=" + userBirthTime +
                ", userHand='" + userHand + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userQQ='" + userQQ + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userCollection='" + userCollection + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer userID, String userNickName, String userName, 
                String userSex, String passWord, Date userBirthTime,
                String userHand, String userAddress, String userPhone,
                String userQQ, String userEmail, String userCollection) {
        this.userID = userID;
        this.userNickName = userNickName;
        this.userName = userName;
        this.userSex = userSex;
        this.passWord = passWord;
        this.userBirthTime = userBirthTime;
        this.userHand = userHand;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userQQ = userQQ;
        this.userEmail = userEmail;
        this.userCollection = userCollection;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getUserBirthTime() {
        return userBirthTime;
    }

    public void setUserBirthTime(Date userBirthTime) {
        this.userBirthTime = userBirthTime;
    }

    public String getUserHand() {
        return userHand;
    }

    public void setUserHand(String userHand) {
        this.userHand = userHand;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public String getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(String userCollection) {
        this.userCollection = userCollection;
    }
}
