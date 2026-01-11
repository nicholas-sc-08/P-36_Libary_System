package br.com.lbs.libary_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lbs.libary_system.model.User;
import br.com.lbs.libary_system.repo.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    public User getByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public User createNewUser(User user) {
        return userRepo.save(user);
    }
}
