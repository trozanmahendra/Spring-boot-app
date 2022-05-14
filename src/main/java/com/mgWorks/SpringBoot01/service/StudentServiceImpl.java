package com.mgWorks.SpringBoot01.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgWorks.SpringBoot01.entity.Student;
import com.mgWorks.SpringBoot01.error.StudentNotFoundException;
import com.mgWorks.SpringBoot01.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
//	@Autowired
//	private Student student;
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetchStudent() {

		return studentRepository.findAll();
	}

	@Override
	public Student getStudentByID(int sid) throws StudentNotFoundException {

		Optional<Student> student = studentRepository.findById(sid);
		if (!student.isPresent()) {
			throw new StudentNotFoundException("Student details not found");
		}
		return studentRepository.findById(sid).get();

	}

	@Override
	public void deleteStudentByID(int sid) {

		studentRepository.deleteById(sid);
	}

	@Override
	public Student updateStudentByID(int sid, Student student) {

		Student stud = studentRepository.findById(sid).get();

		if (Objects.nonNull(student.getSaddr()) && !"".equalsIgnoreCase(student.getSaddr())) {
			stud.setSaddr(student.getSaddr());
		}
		if (Objects.nonNull(student.getSname()) && !"".equalsIgnoreCase(student.getSname())) {
			stud.setSname(student.getSname());
		}
		if (Objects.nonNull(student.getSfee()) && student.getSfee() != 0) {
			stud.setSfee(student.getSfee());
		}
		if (Objects.nonNull(student.getSmobile()) && student.getSmobile() != 0) {
			stud.setSmobile(student.getSmobile());
		}

		return studentRepository.save(stud);
	}

	@Override
	public Student getByName(String sname) {

		return studentRepository.findBySnameIgnoreCase(sname);
	}

}
