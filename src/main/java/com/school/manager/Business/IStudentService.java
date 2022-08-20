/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.school.manager.Business;

import com.school.manager.Entities.Student;
import java.util.List;

/**
 *
 * @author talme
 */
public interface IStudentService {
        List<Student> getAll();
	void add(Student student);
	void update(Student student);
	void delete(Student student);
	Student getById(int id);
        List<Student> searchBySchoolNo(int schoolNo);
}
