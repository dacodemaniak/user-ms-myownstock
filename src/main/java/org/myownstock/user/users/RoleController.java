package org.myownstock.user.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/roles")
public class RoleController {
    @Autowired
    RoleService service;
    @GetMapping
    public List<Role> findAll() {
        return service.findAll();
    }
}
