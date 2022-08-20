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
public class HibernateStudentDal implements IStudentDal {

    private SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class)
            .buildSessionFactory();

    public HibernateStudentDal() {

    }

    @Override
    public List<Student> getAll() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from Peoples").getResultList();
        session.getTransaction().commit();
        return students;
    }

    @Override
    public void add(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit();

    }

    @Override
    public void update(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student studenttoDelete = session.get(Student.class, student.getId());
        session.delete(studenttoDelete);
        session.getTransaction().commit();
    }

    @Override
    public Student getById(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        return student;
    }

    @Override
    public List<Student> searchBySchoolNo(int schoolNo) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from Peoples people where people.schoolNo LIKE '%"+schoolNo+"%'").getResultList();
        session.getTransaction().commit();
        return students;
    }


}
