package com.major.resume.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.major.resume.entities.student.StudentBasicDetails;

public class ExcelHelperStudents {
    public static boolean checkExcelFormat(MultipartFile file) {
        String contentType = file.getContentType();
        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return true;
        }
    }

    public static List<StudentBasicDetails> convertExcelToListOfStudents(InputStream is) {
        List<StudentBasicDetails> studentList = new ArrayList<>();
        try {

            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheetAt(0);

            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {
                Row row = iterator.next();
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();
                int cid = 0;
                StudentBasicDetails student = new StudentBasicDetails();
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    switch (cid) {
                        case 1:
                            student.setStudentName(cell.getStringCellValue());
                            break;
                        case 2:
                            student.setStudentScholar(cell.getStringCellValue());
                            break;
                        case 3:
                            student.setStudentPassword(cell.getStringCellValue());
                            break;
                        default:
                            break;
                    }
                    cid++;
                }
                studentList.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
