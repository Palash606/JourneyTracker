package com.major.resume.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.student.StudentBasicDetails;

public interface StudentBasicDetailsRepository extends JpaRepository<StudentBasicDetails, Integer> {

}
