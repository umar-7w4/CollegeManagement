package com.cms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cms.dao.CollegeDao;
import com.cms.entity.College;

@Service("CollegeService")
public class CollegeServiceImpl implements  CollegeService{
	
	@Autowired
	CollegeDao collegeDao;

	@Override
	public College addCollege(College college) throws Exception {
		collegeDao.saveAndFlush(college);
		return college;
	}

	@Override
	public List<College> getCollegeByNameAsec() throws Exception {
		List<College> ans = new ArrayList<College>();
		try {
			ans = collegeDao.findAll(Sort.by(Sort.Direction.ASC, "name"));
		}
		catch(Exception e) {
			throw new Exception("College details not found!");
		}
		return ans;
	}

}
