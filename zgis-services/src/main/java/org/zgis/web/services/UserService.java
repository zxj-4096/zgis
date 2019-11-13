package org.zgis.web.services;

import org.zgis.web.bean.User;

public interface UserService {
    public User longin(User user);
    public void register(User user);
}