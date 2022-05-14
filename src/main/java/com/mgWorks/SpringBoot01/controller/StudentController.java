package com.mgWorks.SpringBoot01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgWorks.SpringBoot01.entity.Student;
import com.mgWorks.SpringBoot01.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);

	}
}
