package com.example.Gestion_etudiants.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Student")
public class StudentController {


    @Autowired //injection de service
    StudentService studentService; //instance

    @GetMapping
    public List<Student> getStudents() {

        return studentService.getStudent();

    }

    @PostMapping
    public void newStudent(@RequestBody Student s) {
        studentService.addStudent(s);
    }

@DeleteMapping(path ="/{StudentID}")
    public void deleteStudent(@PathVariable Student id){
        studentService.deleteStudent(id);
}
}
