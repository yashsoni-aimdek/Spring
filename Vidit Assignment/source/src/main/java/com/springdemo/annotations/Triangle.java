package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanTriangle")
public class Triangle implements Shape{	//creating triangle class which implements shape

	@Value("${triangle.height}")
	private int a;	

	@Value("${triangle.base}")
	private int b;
	
	public Triangle() {}	//creating empty constructor
	
	public Triangle(int a, int b) {	//creating constructor with 2 parameters
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return this.a;	//getter
	}
	
	public double area() { //creating area method
		return (a * b) / 2;
	}
}
