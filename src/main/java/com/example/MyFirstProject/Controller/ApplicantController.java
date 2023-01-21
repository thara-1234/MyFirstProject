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

@Controller
@RestController
public class ApplicantController {
    @Autowired
    ApplicantService applicantService;
    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public void createApplicants(@RequestBody Applicant applicant){
        applicantService.createAnApplicant(applicant);
    }

    }
