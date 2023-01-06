package com.example.MyFirstProject.Service;

import com.example.MyFirstProject.Entity.Applicant;
import com.example.MyFirstProject.Repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {
    @Autowired
    ApplicantRepository applicantRepository;
    public void createAnApplicant(Applicant applicant){
        applicantRepository.save(applicant);
        if(applicant.getPhone_no().length() != 10){
            applicantRepository.delete(applicant);
           }
       // if (applicant.getEmail_id().toString().endsWith(".com")){
           // applicantRepository.delete(applicant);
        }


    }}



