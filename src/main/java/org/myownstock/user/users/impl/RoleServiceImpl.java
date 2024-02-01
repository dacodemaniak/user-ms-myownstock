package org.myownstock.user.users.impl;

import org.myownstock.user.users.IRole;
import org.myownstock.user.users.Role;
import org.myownstock.user.users.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    IRole repository;
    @Override
    public Role add(Role role) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }
}
