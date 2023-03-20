package com.interloop.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;     //Five -5th
import org.springframework.web.bind.annotation.RestController;
import com.interloop.test.model.*;
import com.interloop.test.api.*;

@RestController                           //
@RequestMapping(value = "/student")
public class StudentController { //here we define whether we are going to use it as API,Front-End App, Or both

    @Autowired // this is autowiring for data service
    StudentDataService dataService;

    @GetMapping("/all")
    public List<Student> getText() {
        return dataService.fetchAllStudents();
    }

    @PostMapping(path = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveStudent(@RequestBody Student student) {
        dataService.saveNew(student);
    }
    
}
