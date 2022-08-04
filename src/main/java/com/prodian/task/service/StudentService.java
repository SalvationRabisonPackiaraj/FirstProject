package com.prodian.task.service;

 
import java.util.List;

import com.prodian.task.exception.EmptyDatabaseException;
import com.prodian.task.model.Student;

public interface StudentService {

	 

	void deleteStudent(long id);

	List<Student> getAllStudents() throws EmptyDatabaseException;

	Student savingStudent(Student student);

}
