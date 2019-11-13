package org.zgis.web.services.impl;

import org.zgis.web.bean.User;
import org.zgis.web.dao.UserDao;
import org.zgis.web.services.UserService;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDao();
    @Override
    public User longin(User user) {
        return userDao.login(user);
    }

    @Override
    public void register(User user) {
       userDao.register(user); 
    }

}
