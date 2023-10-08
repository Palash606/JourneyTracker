package com.major.resume.services;

import com.major.resume.entities.student.StudentBasicDetails;
import com.major.resume.helper.ExcelHelperStudents;
import com.major.resume.repository.student.StudentBasicDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ExcelServiceStudent {
    @Autowired
    private StudentBasicDetailsRepository studentBasicDetailsRepository;

    public void save(MultipartFile file) {
        try {
            List<StudentBasicDetails> studentBasicDetailsList = ExcelHelperStudents.convertExcelToListOfStudents(file.getInputStream());
            this.studentBasicDetailsRepository.saveAll(studentBasicDetailsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<StudentBasicDetails> getAllStudents() {
        return this.studentBasicDetailsRepository.findAll();
    }
}
