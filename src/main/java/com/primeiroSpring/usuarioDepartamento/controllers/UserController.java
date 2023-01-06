package com.primeiroSpring.usuarioDepartamento.controllers;

import com.primeiroSpring.usuarioDepartamento.entities.User;
import com.primeiroSpring.usuarioDepartamento.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<User> findAll(){
        List<User> result = userRepository.findAll();
        return  result;
    }

    @GetMapping(value = "/{id}")
    public User insert(@RequestBody User user){
        User result = userRepository.save(user);
        return  result;

        
    }
}

