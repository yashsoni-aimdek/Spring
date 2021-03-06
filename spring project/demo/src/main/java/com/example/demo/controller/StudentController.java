package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<Student> create(@Valid @RequestBody Student student) {
	//	 studentService.create(student);
	//	 return ResponseEntity.ok("Student Valid");
		Student savedStudent = studentService.create(student);
		return new ResponseEntity<Student>(savedStudent, HttpStatus.CREATED);
		
	}
/*	@PostMapping("/student")
	public ResponseEntity<String> create(@Valid @RequestBody Student student) {
	//	 studentService.create(student);
	//	 return ResponseEntity.ok("Student Valid");
		Student savedStudent = studentService.create(student);
		return new ResponseEntity<Student>(savedUser, HttpStatus.CREATED);
		
	}*/
	
	@PutMapping("/student")
	public ResponseEntity<Student> update(@Valid @RequestBody Student student) {
	//	return studentService.update(student);
		Student savedStudent = studentService.update(student);
		return new ResponseEntity<Student>(savedStudent, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/student/{stuId}")
	public void delete(@PathVariable int stuId) {
		studentService.delete(stuId);
	}
	
	@DeleteMapping("/student")
	public void deleteBulk() {
		 studentService.deleteBulk();
	}
	@GetMapping("/student")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	@GetMapping("/student/get-one")
	public Student getOne(@RequestParam int stuId) {
		return studentService.getOne(stuId);
	}
	
}
