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

import com.cms.entity.College;
import com.cms.service.CollegeService;


@RestController
@RequestMapping("/cms-college")
public class CollegeController {
	
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/addCollege")
	public College addCollege(@RequestBody College college) throws Exception{
		return collegeService.addCollege(college);
	}
	
	@GetMapping("/getCollegeByNameAsec")
	public List<College> getCollegeByNameAsec() throws Exception{
		return collegeService.getCollegeByNameAsec();
	}

}
