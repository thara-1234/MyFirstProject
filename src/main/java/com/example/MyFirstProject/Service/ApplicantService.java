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
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ApplicantService {
    @Autowired
    ApplicantRepository applicantRepository;
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

        if(applicant.getId()==0 || applicant.getPhone_no()==null||applicant.getZipcode()==null||applicant.getAge()==0
                ||applicant.getEmail_id()==null||applicant.getAddress()==null||applicant.getGender()==null||
        applicant.getName()==null||applicant.getDob()==null){
            throw new IllegalArgumentException("Values cannot be null");
           }
        if(applicant.getPassword().length()!=6 &&  applicant.getPassword().matches("[a-zA-Z0-9]+")){
            throw new IllegalArgumentException("Invalid Password");

        }



        applicantRepository.save(applicant);



    }



}
























