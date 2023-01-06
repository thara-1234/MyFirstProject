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
    }

}
