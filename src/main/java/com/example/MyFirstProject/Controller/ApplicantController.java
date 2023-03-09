package com.example.MyFirstProject.Controller;

import com.example.MyFirstProject.Entity.Applicant;
import com.example.MyFirstProject.Entity.LoginApplicant;
import com.example.MyFirstProject.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Controller
@RestController
public class ApplicantController {
    @Autowired
    ApplicantService applicantService;
    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public void createApplicants(@RequestBody Applicant applicant) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        applicantService.createAnApplicant(applicant);
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login(@RequestBody LoginApplicant loginApplicant) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        applicantService.loginApplicant(loginApplicant);
    }}
