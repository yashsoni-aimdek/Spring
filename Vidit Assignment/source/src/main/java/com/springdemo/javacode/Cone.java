package com.springdemo.javacode;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cone implements Shape{	//creating Cone class which implements shape
	private int r;
	private int h;
	
	private Shape circle;
	private Shape triangle;
	
	public Cone() {}	//empty constructor

	public Cone(Shape c, Shape t) { //Constructor with 2 parameter
		circle = c;
		triangle = t;
		setValues();
	}
	
	private void setValues(){
		this.r = ( (Circle) circle ).getR();	//setting this as the bean name
		this.h = ( (Triangle) triangle ).getA();	//setting this as the bean name
		System.out.println("circle radius : " + r);	//printing circle radius
		System.out.println("triangle height : " + h);	//printing triangle height
		
	}
	
	public double area() {	//creating area method
		return Math.PI * r * ( r + Math.sqrt(r*r + h*h) );
	}
	

	@PostConstruct
	public void coneInitMethod() {	//creating init method
		System.out.println("Cone : coneInitMethod()");
	}
	
	@PreDestroy
	public void coneDestroyMethod() {	//creating destroy method
		System.out.println("Cone : coneDestroyMethod()");
	}
}
