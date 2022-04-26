package com.springdemo.javacode;

public class Triangle implements Shape{ //creating Triangle class which implements Shape

	private int a;
	private int b;
	
	public Triangle() {} 	//empty Constructor
	
	public Triangle(int a, int b) { //Creating Constructor with 2 parameters
		this.a = a;
		this.b = b;
	}
	
	public int getA() {	//getter
		return this.a;	
	}
	
	public double area() {	//creating method area
		return (a * b) / 2;
	}
}
