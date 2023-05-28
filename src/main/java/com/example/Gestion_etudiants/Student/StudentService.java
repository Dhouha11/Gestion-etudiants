package com.example.Gestion_etudiants.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudent(){
//        return List.of(
//                new Student(1, "Takwa", 25, "taki@gmail.com"),
//                new Student(2, "Amal", 12, "mayla@gmail.com"),
//                new Student(3, "Fadwa", 29, "fou@gmail.com")
//        );
        return studentRepository.findAll();
    }

    public void addStudent(Student s) {
        studentRepository.save(s);
    }
}
