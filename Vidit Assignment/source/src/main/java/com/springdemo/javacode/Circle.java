package com.springdemo.javacode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanCircle")
public class Circle implements Shape{	//creating class Circle which implements shape
	
	@Value("${circle.radius}")
	private int r;

	public Circle() {}	//creating empty constructor
	
	public Circle(int r) {	//creating constructor with 1 parameter
		this.r = r;
	}
	
	public void setR(int r) {	//setter
		this.r = r;
	}
	
	public int getR() {		//getter
		return r;
	}
	
	public double area() {	//creating area method
		return Math.PI * r * r;
	}
}
