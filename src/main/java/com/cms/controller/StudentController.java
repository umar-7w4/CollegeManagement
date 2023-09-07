package com.cms.controller;

import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entity.Student;
import com.cms.service.StudentService;


@RestController
@RequestMapping("/cms-student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) throws Exception{
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getStudentsByAgeDesc")
	public List<Student> getStudentsByAgeDesc() throws Exception{
		return studentService.getStudentsByAgeDesc();
	}

}
