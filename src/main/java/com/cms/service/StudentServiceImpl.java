package com.cms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cms.dao.CollegeDao;
import com.cms.dao.StudentDao;
import com.cms.entity.College;
import com.cms.entity.Student;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	CollegeDao collegeDao;

	@Override
	public Student addStudent(Student student) throws Exception {
		studentDao.saveAndFlush(student);
		return student;
	}

	@Override
	public List<Student> getStudentsByAgeDesc() throws Exception {
		List<Student> ans = new ArrayList<Student>();
		try {
			ans = studentDao.findAll(Sort.by(Sort.Direction.DESC, "age"));
		}
		catch(Exception e) {
			throw new Exception("Student details not found!");
		}
		return ans;
	}

	

}
