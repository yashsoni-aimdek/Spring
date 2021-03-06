package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;

@SpringBootApplication
public class JDBCTemplate implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JDBCTemplate.class, args);
	}

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
