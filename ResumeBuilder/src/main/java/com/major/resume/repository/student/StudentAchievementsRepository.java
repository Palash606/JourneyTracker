package com.major.resume.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.major.resume.entities.student.StudentAchievements;

public interface StudentAchievementsRepository extends JpaRepository<StudentAchievements, Integer> {

}
