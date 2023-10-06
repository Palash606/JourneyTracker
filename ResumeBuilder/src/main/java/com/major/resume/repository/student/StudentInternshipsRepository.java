package com.major.resume.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.student.StudentInternships;

public interface StudentInternshipsRepository extends JpaRepository<StudentInternships, Integer> {

}
