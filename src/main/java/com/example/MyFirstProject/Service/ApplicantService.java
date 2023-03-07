package com.example.MyFirstProject.Service;

import com.example.MyFirstProject.Entity.Applicant;
import com.example.MyFirstProject.Entity.LoginApplicant;
import com.example.MyFirstProject.Repository.ApplicantRepository;
import com.example.MyFirstProject.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Base64;
import java.util.List;

import static javax.crypto.KeyGenerator.getInstance;


@Service
public class ApplicantService {
    @Autowired
    ApplicantRepository applicantRepository;


    public void createAnApplicant(Applicant applicant) throws NoSuchAlgorithmException {

        if (applicant.getPhoneNo().length() != 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }

        if (!applicant.getEmailId().endsWith(".com")) {
            throw new IllegalArgumentException("Invalid Mail ID");
        }

        LocalDate CurrDate = LocalDate.now();
        LocalDate dateOfBirth = applicant.getDob();
        Period p = Period.between(dateOfBirth, CurrDate);
        applicant.setAge(p.getYears());

        if (p.getYears() < 18) {
            throw new IllegalArgumentException("Not Eligible");
        }
        if (applicant.getZipcode().length() != 6) {
            throw new IllegalArgumentException("Invalid Zipcode");
        }

        if (applicant.getId() == 0 || applicant.getPhoneNo() == null || applicant.getZipcode() == null || applicant.getAge() == 0
                || applicant.getEmailId() == null || applicant.getAddress() == null || applicant.getGender() == null ||
                applicant.getName() == null || applicant.getDob() == null) {
            throw new IllegalArgumentException("Values cannot be null");
        }
       if (applicant.getPassword().length()<=6 && applicant.getPassword().matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("Invalid Password");
      }
       else{
           KeyGenerator keyGen = getInstance("AES");
           keyGen.init(256);
           SecretKey secretKey = keyGen.generateKey();
           String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
            applicant.setPassword(encodedKey);
       }


        if(applicantRepository.countByEmailId(applicant.getEmailId())>0){
           throw new NotFoundException("Already registered emailId");
       }

        applicantRepository.save(applicant);
    }
public Applicant loginApplicant(LoginApplicant loginApplicant){

        Applicant a=applicantRepository.login(loginApplicant.getEmailId(),loginApplicant.getPassword());
        if(a==null){
            throw new NotFoundException("Entered Invalid details");
        }
        return  null;

    }}
























