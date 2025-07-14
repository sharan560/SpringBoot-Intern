package com.example.springbootfirst.repository;

import com.example.springbootfirst.services.Studentseivice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studnetrepo extends JpaRepository<Studentseivice,Integer> {
}
