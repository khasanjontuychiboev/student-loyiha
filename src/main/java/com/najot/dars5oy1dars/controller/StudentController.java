package com.najot.dars5oy1dars.controller;

import com.najot.dars5oy1dars.dto.requestDTO.StudentRequestDTO;
import com.najot.dars5oy1dars.dto.responseDTO.StudentDTO;
import com.najot.dars5oy1dars.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentDTO> getAllStudent(){
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudent(@PathVariable("id") Integer id){

        return service.getStudentById(id);
    }

    @PostMapping
    public StudentDTO createStudent(@RequestBody StudentRequestDTO studentRequestDTO){
        return  service.createStudent(studentRequestDTO);
    }


    @PutMapping("/{id}")
    public StudentDTO createStudent(@PathVariable("id") Integer id, @RequestBody StudentRequestDTO studentRequestDTO){
        return  service.updateStudent(id, studentRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        service.deleteStudent(id);
    }
}
