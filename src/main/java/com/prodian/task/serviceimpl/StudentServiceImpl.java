package com.prodian.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodian.task.exception.EmptyDatabaseException;
import com.prodian.task.exception.UserNotFoundException;
import com.prodian.task.model.Student;
import com.prodian.task.repository.StudentRepository;
import com.prodian.task.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void deleteStudent(long id) {
		 
		Student student = studentRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Student","id",id));
		studentRepository.delete(student);
		
	}

	@Override
	public List<Student> getAllStudents() throws EmptyDatabaseException {
		
		List<Student> datas = studentRepository.findAll();
		
		if(datas.isEmpty()) {
			throw new EmptyDatabaseException("Empty Database !!!");
		}
		
		return datas;
		 
	
	}

	@Override
	public Student savingStudent(Student student) {
		
		return studentRepository.save(student);
	
	}

	
	
}
