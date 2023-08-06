package com.example.spring_crud_demo.repository;

import com.example.spring_crud_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
