package com.example.demo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class JenkinsDemoApplication implements CommandLineRunner{

	private final StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		studentRepository.save(new Student("John","Doe","john@email.com"));
		studentRepository.save(new Student("Mary", "Public","mary@email.com"));
	}

}
