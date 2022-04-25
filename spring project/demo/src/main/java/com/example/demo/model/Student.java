package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message="First Name is Mandatory")
	private String fname;
	@NotBlank(message="Last Name is Mandatory")
	private String lname;
	@NotBlank(message="Email is Mandatory")
	@Email(message="Email Syntax is Incorrect")
	private String email;
	
	@Min(value = 1, message = "Age is not valid")
	private int age;
	
	public Student() {
		
	}
	
	public Student(int id, String fname, String lname, String email, int age) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
