package com.example.MyFirstProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.time.LocalDate;
import java.util.Date;

@Entity
public  class Applicant {


   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    LocalDate dob;
    String gender;
    String phone_no;
    String email_id;
    int age;
    String address;
    String zipcode;
    String password;
    public Applicant(){

    }

    public Applicant(String name, LocalDate dob, String gender, String phone_no, String email_id, String address, String zipcode,String password) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone_no = phone_no;
        this.email_id = email_id;
        this.address = address;
        this.zipcode = zipcode;
        this.password=password;
    }

    public Applicant(int id, int age) {
        this.id = id;
        this.age = age;
    }

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

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
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
