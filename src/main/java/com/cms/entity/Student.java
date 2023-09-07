package com.cms.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 
 {
	"rollNo" :  1,
	"name" : "Rakesh",
	"gender" : "Male",
	"age" : 22
	
}
  
 */


@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private int rollNo;
	private String name;
	private String gender;
	private int age;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "college_id", referencedColumnName = "collegeId")
	private College college;

	public Student() {
		super();
	}

	public Student(int studentId, int rollNo, String name, String gender, int age, College college) {
		super();
		this.studentId = studentId;
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.college = college;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
	

}
