package com.mgWorks.SpringBoot01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mgWorks.SpringBoot01.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Student findBySname(String sname);
	
	public Student findBySnameIgnoreCase(String sname);
}
