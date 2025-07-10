package com.example.Springbootfirstproject.Repository;

import com.example.Springbootfirstproject.Models.RegDetails;
import com.example.Springbootfirstproject.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegRepo extends JpaRepository<RegDetails,Integer> {

}
