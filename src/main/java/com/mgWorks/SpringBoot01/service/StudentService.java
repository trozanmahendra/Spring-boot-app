package com.mgWorks.SpringBoot01.service;

import java.util.List;

import com.mgWorks.SpringBoot01.entity.Student;



public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> fetchStudent();
	public Student getStudentByID(int sid);
	public void deleteStudentByID(int sid);
	public Student updateStudentByID(int sid, Student student);
	public Student getByName(String sname);

}
