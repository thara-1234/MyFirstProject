package com.example.MyFirstProject.Repository;

import com.example.MyFirstProject.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface  ApplicantRepository extends JpaRepository<Applicant,Integer> {


    @Query(value = "SELECT a FROM applicant a WHERE a.email=?1 and a.password=?2 ",countQuery = "SELECT count(*) FROM Users" ,nativeQuery = true)
   public default int login(String email, String passowrd){
        return 0;
    }

    }





