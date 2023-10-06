package com.major.resume.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.student.StudentProjects;

public interface StudentProjectsRepository extends JpaRepository<StudentProjects, Integer> {

}
