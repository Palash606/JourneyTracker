package com.major.resume.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.student.StudentAcademicDetails;

public interface StudentAcademicDetailsRepository extends JpaRepository<StudentAcademicDetails, Integer> {

}
