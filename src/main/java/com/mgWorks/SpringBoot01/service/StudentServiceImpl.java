package com.mgWorks.SpringBoot01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgWorks.SpringBoot01.entity.Student;
import com.mgWorks.SpringBoot01.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
//	@Autowired
//	private Student student;
	@Autowired
	private StudentRepository studentrepository;
	@Override
	public Student saveStudent(Student student) {
		
		return studentrepository.save(student);
	}
	

}
