package com.mgWorks.SpringBoot01.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgWorks.SpringBoot01.entity.Student;
import com.mgWorks.SpringBoot01.error.StudentNotFoundException;
import com.mgWorks.SpringBoot01.service.StudentService;

@RestController
public class StudentController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	@PostMapping("/student")
	public Student saveStudent(@Valid @RequestBody Student student) {
		LOGGER.info("saveStudent method invoked");
		return studentService.saveStudent(student);

	}
	@GetMapping("/studentlist")
	public List<Student> fetchStudentlist(){
		LOGGER.info("fetchStudent method invoked");
		return studentService.fetchStudent();
		
	}
	@GetMapping("/student/{id}")
	public Student getStudentByID(@PathVariable("id") int sid) throws StudentNotFoundException  {
		LOGGER.info("getStudentByID method invoked");
		return studentService.getStudentByID(sid);
		
	}
	@DeleteMapping("/student/{id}")
	public String deleteStudentByID(@PathVariable("id") int sid) {
		LOGGER.info("deleteStudentByID method invoked");
		studentService.deleteStudentByID(sid);
		return "Student details deleted successfully";
		
	}
	@PutMapping("student/{id}")
	public Student updateMappingByID(@PathVariable("id") int sid,@RequestBody Student student) {
		LOGGER.info("updateMappingByID method invoked");
		return studentService.updateStudentByID(sid,student);
		
	}
	@GetMapping("/student/name/{name}")
	public Student getByName(@PathVariable("name") String sname) {
		LOGGER.info("getByName method invoked");
		return studentService.getByName(sname);
		
	}
}
