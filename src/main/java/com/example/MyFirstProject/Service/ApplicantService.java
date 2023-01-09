package com.example.MyFirstProject.Service;

import com.example.MyFirstProject.Entity.Applicant;
import com.example.MyFirstProject.Repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class ApplicantService {
    @Autowired
    ApplicantRepository applicantRepository;
    public static boolean checkPhNo(Applicant applicant){
        if(applicant.getPhone_no().length() == 10){
            return true;
        }
        return false;
    }
        public static boolean checkEmail(Applicant applicant){
        if(applicant.getEmail_id().endsWith(".com")) {
            return true;
        }
        return false;
    }
    public void createAnApplicant(Applicant applicant) {
        try{
        if(ApplicantService.checkPhNo(applicant)&& ApplicantService.checkEmail(applicant)){
            applicantRepository.save(applicant);
        }}
        catch (Exception e){
            e.printStackTrace();
        }
    }




























    /*public static int ageCal(Applicant applicant){
        LocalDate CurrDate = LocalDate.now();
        Long Year1= Long.valueOf(CurrDate.getYear());
        LocalDate dob=LocalDate.parse()
        Long Year2= Long.valueOf(dob.getYear());
        int age= (int) (Year1-Year2);
        return age;
    }*/






    }
























