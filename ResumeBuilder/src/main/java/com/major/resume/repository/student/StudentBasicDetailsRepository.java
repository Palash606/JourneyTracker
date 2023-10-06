package com.major.resume.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.student.StudentBasicDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentBasicDetailsRepository extends JpaRepository<StudentBasicDetails, Integer> {
    StudentBasicDetails findStudentBasicDetailsByStudentScholar(String studentScholar);
}
