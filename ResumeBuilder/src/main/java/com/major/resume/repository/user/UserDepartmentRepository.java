package com.major.resume.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.user.UserDepartment;

public interface UserDepartmentRepository extends JpaRepository<UserDepartment, Integer> {

}
