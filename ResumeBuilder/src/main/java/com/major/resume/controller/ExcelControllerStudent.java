package com.major.resume.controller;

import com.major.resume.entities.student.StudentBasicDetails;
import com.major.resume.helper.ExcelHelperStudents;
import com.major.resume.services.ExcelServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class ExcelControllerStudent {
    @Autowired
    private ExcelServiceStudent excelServiceStudent;

    @PostMapping("/admin/uploadStudentExcel")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (ExcelHelperStudents.checkExcelFormat(file)) {
            this.excelServiceStudent.save(file);
            return ResponseEntity.ok(Map.of("message", "file uploaded successfully"));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file only");
    }

    @GetMapping("/list/students")
    public List<StudentBasicDetails> getAllStudent() {
        return this.excelServiceStudent.getAllStudents();
    }
}
