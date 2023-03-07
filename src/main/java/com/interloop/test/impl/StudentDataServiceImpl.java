package com.interloop.test.impl;

import com.interloop.test.api.*;
import com.interloop.test.repository.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interloop.test.model.Student;

@Service
public class StudentDataServiceImpl implements StudentDataService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> fetchAllStudents(){
        return studentRepository.findAll();
    }


    @Override
    public void saveNew(Student student){
        studentRepository.save(student);
    }
}
