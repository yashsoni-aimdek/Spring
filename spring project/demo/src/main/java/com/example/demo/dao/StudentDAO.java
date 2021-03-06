package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;

@Component
public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		
		String query = "INSERT INTO student VALUES ("+student.getId()+",'"+student.getFname()+"','"+student.getLname()+"','"+student.getEmail()+"',"+student.getAge()+")";
		return jdbcTemplate.update(query);
	}
	
	public int update(Student student) {
		
		String query = "UPDATE student SET fname='"+student.getFname()+"',lname='"+student.getLname()+"','"+student.getEmail()+"',age = "+student.getAge()+" WHERE id = "+student.getId();
		return jdbcTemplate.update(query);
	}
	
	public int delete(Student student) {
		String query = "DELETE FROM STUDENT WHERE id= "+student.getId();
		return jdbcTemplate.update(query);
	}
	public int deleteBulk() {
		String query = "Delete from student";
		return jdbcTemplate.update(query);
	}
	
	public List<Student> getAll(){
		String query = "SELECT * FROM student";
		return jdbcTemplate.query(query, new StudentMapper());
	}
	
	public Student getOne(int stuId) {
		String query = "SELECT * FROM student WHERE id = "+ stuId;
		return jdbcTemplate.queryForObject(query, new StudentMapper());
	}
	
	
}
