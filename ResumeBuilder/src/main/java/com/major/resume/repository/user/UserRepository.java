package com.major.resume.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
