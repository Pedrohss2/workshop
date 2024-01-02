package com.educandoweb.curso.config;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.entities.enums.OrderStatus;
import com.educandoweb.curso.repository.OrderRepository;
import com.educandoweb.curso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(null, "Maria", "Maria@gmail.com", "999999", "dontknow");

        User user1 = new User(null, "Pedro", "Pedro@gmail.com", "4454563", "####");

        Order order = new Order(null, Instant.parse("2023-12-31T11:13:07Z"), user, OrderStatus.PAD);
        Order order1 = new Order(null, Instant.parse("2025-12-31T11:13:07Z"), user1, OrderStatus.WAITING_PAYMENT);

        userRepository.saveAll(Arrays.asList(user, user1));
        orderRepository.saveAll(Arrays.asList(order,order1));
    }
}
