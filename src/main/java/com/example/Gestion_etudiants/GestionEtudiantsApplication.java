package com.example.Gestion_etudiants;

import com.example.Gestion_etudiants.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class GestionEtudiantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudiantsApplication.class, args);
	}

@GetMapping("/Student")
	public List<Student> getStudent() {
          return List.of(
              new Student(1, "Takwa", 25, "taki@gmail.com"),
            new Student(2, "Amal", 12, "mayla@gmail.com"),
				  new Student(3, "Fadwa", 29, "fou@gmail.com"));

}
}
