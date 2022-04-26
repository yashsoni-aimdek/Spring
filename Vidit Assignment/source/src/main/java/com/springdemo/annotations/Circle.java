package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanCircle")
public class Circle implements Shape{	//created a annotation class circle which implements Shape
	
	@Value("${circle.radius}")
	private int r;	

	public Circle() {}	//created empty constructor
	
	public Circle(int r) {	//created constructor with 1 parameter
		this.r = r;
	}
	
	public void setR(int r) {	//setter
		this.r = r;
	}
	
	public int getR() {		//getter
		return r;
	}
	
	public double area() {		//created area method
		return Math.PI * r * r;
	}
}
