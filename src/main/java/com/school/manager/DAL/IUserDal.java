/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school.manager.DAL;

import com.school.manager.Entities.User;
import java.util.List;

/**
 *
 * @author talme
 */
public interface IUserDal {
        List<User> getAll();
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
}
