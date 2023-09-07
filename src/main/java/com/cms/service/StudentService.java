package com.cms.service;

import java.util.List;

import com.cms.entity.College;
import com.cms.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student) throws Exception;
	public List<Student> getStudentsByAgeDesc() throws Exception;

}
