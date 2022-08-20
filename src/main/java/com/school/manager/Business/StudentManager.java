/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school.manager.Business;

import com.school.manager.DAL.IStudentDal;
import com.school.manager.Entities.Student;
import java.util.List;

/**
 *
 * @author talme
 */
public class StudentManager implements IStudentService{
    
    private IStudentDal studentDal;

    public StudentManager(IStudentDal studentDal) {
        this.studentDal = studentDal;
    }
    
    
    
    
    @Override
    public List<Student> getAll() {
        return this.studentDal.getAll();
    }

    @Override
    public void add(Student student) {
        this.studentDal.add(student);
    }

    @Override
    public void update(Student student) {
        this.studentDal.update(student);
    }

    @Override
    public void delete(Student student) {
        this.studentDal.delete(student);
    }

    @Override
    public Student getById(int id) {
        return this.studentDal.getById(id);
    }

    @Override
    public List<Student> searchBySchoolNo(int schoolNo) {
        return this.studentDal.searchBySchoolNo(schoolNo);
    }
    
}
