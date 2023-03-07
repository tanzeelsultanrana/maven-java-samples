package com.interloop.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oid;

    // @Column(name = "student_first_name")
    private String studentName;

    public void Student() {
        
    }

    public void Student(Integer oid,String name) {
        this.oid = oid;
        this.studentName = name;
    }

    public void setOid(Integer id) {
        this.oid = id;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public Integer getOid() {
        return this.oid;
    }

    public String getStudentName() {
        return this.studentName;
    }
}