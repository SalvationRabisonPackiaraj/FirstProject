package com.prodian.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodian.task.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

	
	
}
