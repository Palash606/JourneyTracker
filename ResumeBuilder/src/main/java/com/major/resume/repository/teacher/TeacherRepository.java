package com.major.resume.repository.teacher;

import com.major.resume.entities.teacher.Teacher;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
