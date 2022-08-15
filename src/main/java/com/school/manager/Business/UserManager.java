/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school.manager.Business;

import com.school.manager.DAL.IUserDal;
import com.school.manager.Entities.User;
import java.util.List;

/**
 *
 * @author talme
 */
public class UserManager implements IUserService{
    
    private IUserDal userDal;

    public UserManager(IUserDal userDal) {
        this.userDal = userDal;
    }
    
    @Override
    public List<User> getAll() {
        return userDal.getAll();
    }

    @Override
    public void add(User user) {
        userDal.add(user);
    }

    @Override
    public void update(User user) {
        userDal.update(user);
    }

    @Override
    public void delete(User user) {
        userDal.delete(user);
    }

    @Override
    public User getById(int id) {
        return userDal.getById(id);
    }
    
}
