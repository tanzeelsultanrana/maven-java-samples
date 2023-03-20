package com.interloop.test.impl;

import com.interloop.test.api.*;
import com.interloop.test.repository.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interloop.test.model.Student;

@Service
public class StudentDataServiceImpl implements StudentDataService {

    @Autowired                                      // this is autowiring for data service
    private StudentRepository studentRepository;     //dependency injection within a project
                                                         // Four - 4th
    @Override         //these two functions are automatically override from data service
    public List<Student> fetchAllStudents(){
        return studentRepository.findAll(); // this is define by us
    }


    @Override
    public void saveNew(Student student){
        studentRepository.save(student); // this is define by us
    }
}
