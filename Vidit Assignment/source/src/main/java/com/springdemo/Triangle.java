package com.springdemo;

public class Triangle implements Shape{
	private int a;
	private int b;
	
	public Triangle() {}	//created triangle constructor
	
	public Triangle(int a, int b) {		//creating constructor with 2 parameter
		this.a = a;
		this.b = b;
	}
	
	public int getA() {		//getter
		return this.a;
	}
	
	public double area() {
		return (a * b) / 2;		//created area method
	}
}
