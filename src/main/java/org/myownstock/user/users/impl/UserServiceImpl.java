package org.myownstock.user.users.impl;

import org.myownstock.user.users.IUser;
import org.myownstock.user.users.User;
import org.myownstock.user.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private IUser repository;
    @Override
    public User add(User user) {
        return repository.save(user);
    }
}
