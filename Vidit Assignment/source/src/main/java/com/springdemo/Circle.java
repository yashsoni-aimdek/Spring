package com.springdemo;

public class Circle implements Shape{
	private int r;

	public Circle() {}	//mandatory
	public Circle(int r) {	//created constructor with 1 parameter
		this.r = r;
	}
	
	public void setR(int r) { 
		this.r = r; //setter
	}
	
	public int getR() {
		return r;  //getter
	}
	
	public double area() {
		return Math.PI * r * r;  //defining area formula
	}
}
