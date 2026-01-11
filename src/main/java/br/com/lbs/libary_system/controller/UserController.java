package br.com.lbs.libary_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.lbs.libary_system.model.User;
import br.com.lbs.libary_system.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {        
        User user = userService.getByEmail(email);
        
        if(user != null) {
           return ResponseEntity.ok().body(user);
        }
        
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createNewUser(user);
    }
}
