/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school.manager.DAL;

import com.school.manager.Entities.Student;
import com.school.manager.Entities.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author talme
 */
public class HibernateUserDal implements IUserDal {

    private SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(User.class)
            .buildSessionFactory();

    @Override
    public List<User> getAll() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<User> users = session.createQuery("from Users").getResultList();
        session.close();

        return users;
    }

    @Override
    public void add(User user) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void update(User user) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void delete(User user) {
        Session session = factory.getCurrentSession();

        session.beginTransaction();
        User userToDelete = session.get(User.class, user.getId());
        session.delete(userToDelete);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public User getById(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

}
