package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentController {

	final private StudentService studentService;
	
	@GetMapping("/")
	public List<Student> showAll(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/save")
	public Student insertStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
}
