package com.cms.service;

import java.util.List;

import com.cms.entity.College;


public interface CollegeService {
	
	public College addCollege(College college) throws Exception;
	public List<College> getCollegeByNameAsec() throws Exception;

}
