package com.major.resume.helper;

import com.major.resume.entities.student.StudentBasicDetails;
import com.major.resume.entities.teacher.Teacher;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHelperTeacher {
    public static boolean checkExcelFormat(MultipartFile file) {
        String contentType = file.getContentType();
        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return true;
        }
    }

    public static List<Teacher> convertExcelToListOfTeachers(InputStream is) {
        List<Teacher> teacherList = new ArrayList<>();
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
                Teacher teacher = new Teacher();
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    switch (cid) {
                        case 1:
                            teacher.setTeacherName(cell.getStringCellValue());
                            break;
                        case 2:
                            teacher.setTeacherUsername(cell.getStringCellValue());
                            break;
                        case 3:
                            teacher.setTeacherPassword(cell.getStringCellValue());
                            break;
                        default:
                            break;
                    }
                    cid++;
                }
                teacherList.add(teacher);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teacherList;
    }
}
