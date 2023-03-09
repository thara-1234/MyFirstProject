package com.example.MyFirstProject.Repository;

import com.example.MyFirstProject.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface  ApplicantRepository extends JpaRepository<Applicant,Integer> {

    @Query(value = " select id,address,age,dob,gender,name,phone_no,zipcode,password,email_id from applicant where email_id=?1 and password=?2",nativeQuery = true)
    Applicant login(String emailId,String password);
    int countByEmailId(String emailId);
}





