package com.interloop.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Data; //define by us                        One-1
//import lombok.Getter; //define by us
//import lombok.Setter; //define by us

// @Setter     - setter old annotation
// @Getter     - getter old annotation
//@Data        - this is is latest annotation for both getter and setter
@Entity //ORM performace annotation
@Table(name = "student") //this shows the related table
public class Student {

    @Id // this shows the unique attributes in the model -Primary key coloumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oid; // this variables should be defined in db 

    // @Column(name = "student_first_name")
    private String studentName; // here, we replace student_name with studentName for all work

    public void Student() { //empty constructor
        
    }

    public void Student(Integer oid,String name) { // constructor with all variable as perimeter
        this.oid = oid;
        this.studentName = name;
    }

    public void setOid(Integer id) { // manual setter for ID
        this.oid = id;
    }

    public void setStudentName(String name) { // manual setter for student_name
        this.studentName = name;
    }

    public Integer getOid() { // manual getter for oid
        return this.oid;
    }

    public String getStudentName() {     // manual getter for student_name
        return this.studentName;
    }
}