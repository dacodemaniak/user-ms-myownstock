package org.myownstock.user.users.impl;

import org.myownstock.user.users.IRole;
import org.myownstock.user.users.IUser;
import org.myownstock.user.users.User;
import org.myownstock.user.users.UserService;
import org.myownstock.user.users.dto.UserAddRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private IUser repository;

    @Autowired
    private IRole roleRepository;
    @Override
    public User add(User user) {
        user = repository.save(user);
        return user;
    }
    @Override
    public User addFromDto(UserAddRequestDto user) throws Exception {
        // Get Role from DTO
        var oRole = roleRepository.findById(user.getRole());
        if (oRole.isPresent()) {
            var newUser = new User();
            newUser.setLastname(user.getLastname());
            newUser.setFirstname(user.getFirstname());
            newUser.setBirthdate(user.getBirthdate());
            newUser.setRole(oRole.get());

            newUser = repository.save(newUser);

            return newUser;
        }

        throw new Exception("Role with : " + user.getRole() + " was not found");
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
