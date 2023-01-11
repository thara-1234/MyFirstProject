package com.example.MyFirstProject.Service;

import com.example.MyFirstProject.Entity.Applicant;
import com.example.MyFirstProject.Repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

import static java.time.LocalDate.parse;
import static java.util.Objects.*;

@Service
public class ApplicantService {
    @Autowired
    ApplicantRepository applicantRepository;
    private Applicant applicant;
    private Applicant applicant1;


    public void createAnApplicant(Applicant applicant) {

            if (applicant.getPhone_no().length() != 10) {
                throw new IllegalArgumentException("Invalid Phone Number");
            }

            if (!applicant.getEmail_id().endsWith(".com")) {
                throw new IllegalArgumentException("Invalid Mail ID");
        }

            LocalDate CurrDate = LocalDate.now();
            LocalDate dateOfBirth= applicant.getDob();
           Period p=Period.between(dateOfBirth, CurrDate);
           applicant.setAge(p.getYears());

           if(p.getYears()<18){
               throw new IllegalArgumentException("Not Eligible");
           }
           if(applicant.getZipcode().length()!=6){
               throw new IllegalArgumentException("Invalid Zipcode");
           }
        applicant1 = applicant;
        if(Objects.isNull(applicant1)){
            throw new IllegalArgumentException("Values cannot be null");
           }


    }



}
























