package com.najot.dars5oy1dars.service;

import com.najot.dars5oy1dars.dto.requestDTO.StudentRequestDTO;
import com.najot.dars5oy1dars.dto.responseDTO.StudentDTO;
import com.najot.dars5oy1dars.entities.Student;
import com.najot.dars5oy1dars.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public StudentDTO getStudentById(Integer id) {
        return studentRepository
                .getReferenceById(id)
                .toDTO();
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository
                .findAll()
                .stream()
                .map(Student::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO createStudent(StudentRequestDTO studentRequestDTO) {
        return studentRepository
                .save(studentRequestDTO.toStudent())
                .toDTO();
    }

    @Override
    public StudentDTO updateStudent(Integer id, StudentRequestDTO studentRequestDTO) {
        Student student = studentRepository.getReferenceById(id);
        student.setFirstName(studentRequestDTO.getFirstName());
        student.setLastName(studentRequestDTO.getLastName());

        return studentRepository
                .save(student)
                .toDTO();
    }

    @Override
    public void deleteStudent(Integer id) {
            studentRepository.deleteById(id);
    }
}
