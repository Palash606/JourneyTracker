package com.major.resume.controller;

import com.major.resume.entities.student.StudentBasicDetails;
import com.major.resume.entities.teacher.Teacher;
import com.major.resume.helper.ExcelHelperStudents;
import com.major.resume.services.ExcelServiceStudent;
import com.major.resume.services.ExcelServiceTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class ExcelControllerTeacher {
    @Autowired
    private ExcelServiceTeacher excelServiceTeacher;

    @PostMapping("/admin/uploadTeacherExcel")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (ExcelHelperStudents.checkExcelFormat(file)) {
            this.excelServiceTeacher.save(file);
            return ResponseEntity.ok(Map.of("message", "file uploaded successfully"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file only");
    }

    @GetMapping("/list/teachers")
    public List<Teacher> getAllTeacher() {
        return this.excelServiceTeacher.getAllTeachers();
    }
}
