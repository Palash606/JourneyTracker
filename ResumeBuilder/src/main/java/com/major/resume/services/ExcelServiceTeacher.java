package com.major.resume.services;

import com.major.resume.entities.student.StudentBasicDetails;
import com.major.resume.entities.teacher.Teacher;
import com.major.resume.helper.ExcelHelperTeacher;
import com.major.resume.repository.teacher.TeacherRepository;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ExcelServiceTeacher {
    @Autowired
    private TeacherRepository teacherRepository;

    public void save(MultipartFile file) {
        try {
            List<Teacher> teacherList = ExcelHelperTeacher.convertExcelToListOfTeachers(file.getInputStream());
            this.teacherRepository.saveAll(teacherList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Teacher> getAllTeachers() {
        return this.teacherRepository.findAll();
    }
}
