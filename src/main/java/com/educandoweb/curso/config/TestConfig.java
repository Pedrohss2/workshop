package com.educandoweb.curso.config;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user = new User(null, "Maria", "Maria@gmial.com", "999999", "123");

        User user1 = new User(null, "Pedro", "Pedro@gmial.com", "4454563", "46");

        userRepository.saveAll(Arrays.asList(user1, user));
    }
}
