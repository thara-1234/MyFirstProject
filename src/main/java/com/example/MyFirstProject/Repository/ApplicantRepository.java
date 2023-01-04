package com.example.MyFirstProject.Repository;

import com.example.MyFirstProject.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ApplicantRepository extends JpaRepository<Applicant,Integer> {
}
