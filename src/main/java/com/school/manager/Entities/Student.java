/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school.manager.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author talme
 */
@Entity(name = "Peoples")
@Table(name="peoples")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    int id;
    @Column(name= "schoolno")
    int schoolNo;
    @Column(name= "ovreallGrade")
    double overallGrade;
    
    @Column(name= "name")
    String name;
    @Column(name= "department")
    String department;
    @Column(name= "country")
    String coutry;

    public Student(int schoolNo, double overallGrade, String name, String department, String coutry) {
        this.schoolNo = schoolNo;
        this.overallGrade = overallGrade;
        this.name = name;
        this.department = department;
        this.coutry = coutry;
    }

    public Student() {
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        this.schoolNo = schoolNo;
    }

    public double getOverallGrade() {
        return overallGrade;
    }

    public void setOverallGrade(double overallGrade) {
        this.overallGrade = overallGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }
    
    
    


    
}
