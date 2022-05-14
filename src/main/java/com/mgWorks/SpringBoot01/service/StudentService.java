package com.mgWorks.SpringBoot01.service;

import java.util.List;

import com.mgWorks.SpringBoot01.entity.Student;
import com.mgWorks.SpringBoot01.error.StudentNotFoundException;



public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> fetchStudent();
	public Student getStudentByID(int sid) throws StudentNotFoundException;
	public void deleteStudentByID(int sid);
	public Student updateStudentByID(int sid, Student student);
	public Student getByName(String sname);

}
