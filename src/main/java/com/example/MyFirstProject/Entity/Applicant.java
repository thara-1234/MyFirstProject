package com.example.MyFirstProject.Entity;

import jakarta.persistence.*;


import java.time.LocalDate;



@Entity
public  class Applicant {


   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    LocalDate dob;
    String gender;
    @Column(name = "phoneNo")
    String phoneNo;
    @Column(name = "email_id")
    String emailId;
    int age;
    String address;
    String zipcode;
    String password;

    public Applicant(){

    }
      public Applicant(String emailId){
        this.emailId=emailId;
      }

//    @Override
//    public String toString() {
//        return "Applicant{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dob=" + dob +
//                ", gender='" + gender + '\'' +
//                ", phoneNo='" + phoneNo + '\'' +
//                ", emailId='" + emailId + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                ", zipcode='" + zipcode + '\'' +
//                ", password='" + password + '\'' +
//                '}';
   // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
