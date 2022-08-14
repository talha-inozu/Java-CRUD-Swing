/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.school.manager;
import com.school.manager.Entities.Student;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Manager {

	public List<Student> getStudents() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		
		try {
			session.beginTransaction();
			List<Student> students = session.createQuery("from Peoples").getResultList();
                        session.getTransaction().commit();

			return students;
			
			
                        
			

	}finally {}
	}


}
