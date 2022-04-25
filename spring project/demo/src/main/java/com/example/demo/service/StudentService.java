package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;
import com.example.demo.studentrepository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student create(Student student) {
		//return studentDAO.insert(student);
		return studentRepository.save(student);
	}
	
	public Student update(Student student) {
		//return studentDAO.update(student);
		return studentRepository.save(student);
	}
	
	public void delete(int stuId) {
		Student student = getOne(stuId);
		studentDAO.delete(student);
	}
	
	public void deleteBulk() {
		 studentDAO.deleteBulk();
	}
	
	public List<Student> getAll(){
		return studentDAO.getAll();
	}
	
	public Student getOne(int stuId) {
		return studentDAO.getOne(stuId);
	}
}