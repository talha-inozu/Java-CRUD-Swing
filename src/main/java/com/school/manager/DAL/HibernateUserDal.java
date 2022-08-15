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
public class HibernateUserDal implements IUserDal{
        private SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();
    
    private Session session = factory.getCurrentSession();
    @Override
    public List<User> getAll() {
        session.beginTransaction();
        List<User> users = session.createQuery("from Users").getResultList();
        return users;
    }

    @Override
    public void add(User user) {
                session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit(); 
    }

    @Override
    public void update(User user) {
                session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit(); 
    }

    @Override
    public void delete(User user) {
        session.beginTransaction();
        User userToDelete = session.get(User.class,user.getId());
        session.delete(userToDelete);
        session.getTransaction().commit();
    }

    @Override
    public User getById(int id) {
               session.beginTransaction();
        User user = session.get(User.class, id);
        return user;
    }
    
}
