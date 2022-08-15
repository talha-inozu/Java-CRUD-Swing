/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school.manager.DAL;

import com.school.manager.Entities.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author talme
 */
public class HibernateStudentDal implements IStudentDal{
    
    private SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
    
    private Session session = factory.getCurrentSession();
    
    @Override
    public List<Student> getAll() {
        session.beginTransaction();
        List<Student> students = session.createQuery("from Peoples").getResultList();
        return students;
    }

    @Override
    public void add(Student student) {
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit(); 
    }

    @Override
    public void update(Student student) {
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit(); 
    }

    @Override
    public void delete(Student student) {
        session.beginTransaction();
        Student studenttoDelete = session.get(Student.class,student.getId());
        session.delete(studenttoDelete);
        session.getTransaction().commit();
    }

    @Override
    public Student getById(int id) {
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        return student;
    }
    
}
