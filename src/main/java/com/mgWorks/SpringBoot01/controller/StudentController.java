package com.mgWorks.SpringBoot01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/studentlist")
	public List<Student> fetchStudentlist(){
		return studentService.fetchStudent();
		
	}
	@GetMapping("/student/{id}")
	public Student getStudentByID(@PathVariable("id") int sid) {
		return studentService.getStudentByID(sid);
		
	}
	@DeleteMapping("/student/{id}")
	public String deleteStudentByID(@PathVariable("id") int sid) {
		studentService.deleteStudentByID(sid);
		return "Student details deleted successfully";
		
	}
	@PutMapping("student/{id}")
	public Student updateMappingByID(@PathVariable("id") int sid,@RequestBody Student student) {
		return studentService.updateStudentByID(sid,student);
		
	}
	@GetMapping("/student/name/{name}")
	public Student getByName(@PathVariable("name") String sname) {
		return studentService.getByName(sname);
		
	}
}
