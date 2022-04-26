package com.springdemo;

public class Cone implements Shape{
	private int r;
	private int h;
	
	private Circle circle;
	private Triangle triangle;
	
	public Cone() {}   //creating empty constructor
	
	public Cone(Circle c, Triangle t) {  //creating constructor with 2 parameter
		circle = c;
		triangle = t;	
		setValues();
	}
	
	public void setCircle(Circle c){
		circle = c;		//creating method circle
	}
	
	private void setValues(){
		this.r = circle.getR();		//defining circle value in r
		this.h = triangle.getA();	//defining triangle value in h
	}
	
	public double area() {
		return Math.PI * r * ( r + Math.sqrt(r*r + h*h) );	// defining area method
	}
	
	
	public void coneInitMethod() {
		System.out.println("Cone : coneInitMethod()");  //printing init method when called
	}
	
	public void coneDestroyMethod() {
		System.out.println("Cone : coneDestroyMethod()");	//printing destroy method when called
	}
}
