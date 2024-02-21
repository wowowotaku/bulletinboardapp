package com.example.bulletinboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bulletinboard.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
