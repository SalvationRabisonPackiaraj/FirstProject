package com.prodian.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.task.exception.EmptyDatabaseException;
import com.prodian.task.model.Student;
import com.prodian.task.service.StudentService;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saving")
	private ResponseEntity<Student> savingStudent(@RequestBody Student student){
	
		return new ResponseEntity<Student>(studentService.savingStudent(student),HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	private ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
		
		studentService.deleteStudent(id);
		String flag = "Removed from Database";
		return new ResponseEntity<String>(flag,HttpStatus.OK);
	}
	
	@GetMapping("/show")
	private List<Student> getAllStudents() throws EmptyDatabaseException{
		
		return studentService.getAllStudents();
	
	}
	
}
