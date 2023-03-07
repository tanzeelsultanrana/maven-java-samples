package com.interloop.test.api;

import java.util.List;
import com.interloop.test.model.Student;

public interface StudentDataService {
    List<Student> fetchAllStudents();

    void saveNew(Student student);
}
