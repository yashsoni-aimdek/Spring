package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public int create(Student student) {
		return studentDAO.insert(student);
	}
	
	public int update(Student student) {
		return studentDAO.update(student);
	}
	
	public void delete(int stuId) {
		Student student = getOne(stuId);
		studentDAO.delete(student);
	}
	
	public List<Student> getAll(){
		return studentDAO.getAll();
	}
	
	public Student getOne(int stuId) {
		return studentDAO.getOne(stuId);
	}
}