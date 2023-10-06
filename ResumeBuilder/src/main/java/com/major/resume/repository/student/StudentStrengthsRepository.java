package com.major.resume.repository.student;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.student.StudentStrengths;

public interface StudentStrengthsRepository extends JpaRepository<StudentStrengths, Integer> {

}
