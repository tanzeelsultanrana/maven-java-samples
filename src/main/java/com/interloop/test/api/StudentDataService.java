package com.interloop.test.api;

import java.util.List;
import com.interloop.test.model.Student;                 // Three-3

public interface StudentDataService {     //one data service should be define for each class like teacher,student 
    List<Student> fetchAllStudents();

    void saveNew(Student student);
}
