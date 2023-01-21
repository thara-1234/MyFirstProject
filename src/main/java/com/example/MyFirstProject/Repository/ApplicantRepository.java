package com.example.MyFirstProject.Repository;

import com.example.MyFirstProject.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  ApplicantRepository extends JpaRepository<Applicant,Integer> {
    Applicant findByEmailIdAndPassword(String email, String passowrd);

}
//    @Query(value = "SELECT a FROM applicant a WHERE a.email=?1 and a.password=?2 ",countQuery = "SELECT count(*) FROM Users" ,nativeQuery = true)
//   public default int login(String email, String passowrd){
//        return (int) count();
//    }

   /* @Query(value = "SELECT email,name FROM applicant a WHERE a.email=?1 and a.password=?2 ",nativeQuery = true)
     Applicant login(String email, String passowrd) ;
    }*/

// 1) ethoru interface alle..ethil entina method define chyunne..only method declaration
// 2) @Query annotation ullil ntina 2 query okke...nmk oru query de avishym alle ollu...count vendan alle prnje
// 3) password name query and parameter same anele ath eduku..angne ntho und..epo njn mattitla...run chyt error anel mattnm
// 4)  return (int) count(); ee line kond ntha udheshiche...allel tanne return statement onm vnda...eni vnmnkil polm ath tetta



