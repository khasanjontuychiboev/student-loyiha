package com.najot.dars5oy1dars.service;

import com.najot.dars5oy1dars.dto.requestDTO.StudentRequestDTO;
import com.najot.dars5oy1dars.dto.responseDTO.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO getStudentById(Integer id);
    List<StudentDTO> getAllStudents();

    StudentDTO createStudent(StudentRequestDTO studentRequestDTO);
    StudentDTO updateStudent(Integer id, StudentRequestDTO studentRequestDTO);

    void deleteStudent(Integer id);

}
