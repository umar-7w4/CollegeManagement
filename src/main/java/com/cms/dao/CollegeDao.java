package com.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.entity.College;

@Repository
public interface CollegeDao extends JpaRepository<College, Integer> {

}
