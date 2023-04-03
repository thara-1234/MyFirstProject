package com.example.MyFirstProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginApplicant {
    @Id
    @Column(name = "email_id")
    String emailId;

    String password;
    LoginApplicant(){

    }

    public LoginApplicant(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

//    @Override
//    public String toString() {
//        return "LoginApplicant{" +
//                "emailId='" + emailId + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
