package com.educandoweb.curso.repository;

import com.educandoweb.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
