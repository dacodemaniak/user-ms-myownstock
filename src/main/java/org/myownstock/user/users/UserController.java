package org.myownstock.user.users;

import org.apache.catalina.connector.Response;
import org.myownstock.user.users.dto.UserAddRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> add(@RequestBody UserAddRequestDto user) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.addFromDto(user));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }
}
