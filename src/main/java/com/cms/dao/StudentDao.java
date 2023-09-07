package com.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
