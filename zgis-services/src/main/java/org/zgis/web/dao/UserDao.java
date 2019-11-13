package org.zgis.web.dao;

import org.zgis.web.bean.User;

public class UserDao {

    public User login(User user) {
        System.out.println("login success");
        return user;
        
    }
    public void register(User user) {
       System.out.println("reg sucess");
    }
}
