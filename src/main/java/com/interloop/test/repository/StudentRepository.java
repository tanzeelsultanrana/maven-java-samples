package com.interloop.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interloop.test.model.Student; //library import               Two-2

@Repository //this is annotation for repo
public interface StudentRepository extends JpaRepository<Student,Integer> { 
    // define the repo for main model class, here we should mention class name with it data types
}
