/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duonglhh.dto;

/**
 *
 * @author ASUS
 */
public class User {
    String UserID;
    String fullname;
    String password;
    int status;

    public User() {
    }

    public User(String UserID, String fullname, String password, int status) {
        this.UserID = UserID;
        this.fullname = fullname;
        this.password = password;
        this.status = status;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "UserID=" + UserID + ", fullname=" + fullname + ", password=" + password + ", status=" + status + '}';
    }

    
}

