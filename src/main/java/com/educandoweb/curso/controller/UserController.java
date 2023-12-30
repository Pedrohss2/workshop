package com.educandoweb.curso.controller;

import com.educandoweb.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Pedro", "pedro@gmial.com", "43920005946", "BH23GSA/*-");
        return ResponseEntity.ok().body(user);
    }
}
