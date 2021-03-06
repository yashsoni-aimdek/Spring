package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setFname(rs.getString("fname"));
		student.setLname(rs.getString("lname"));
		student.setEmail(rs.getString("email"));
		student.setAge(rs.getInt("age"));
		
		return student;
	}

}
