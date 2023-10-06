package com.major.resume.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.user.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
}
