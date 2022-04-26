package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("beanCone")
public class Cone implements Shape{		//created annotation class Cone which implements shape
	private int r;
	private int h;
	
	private Shape circle;
	private Shape triangle;
	
	public Cone() {}	//empty constructor

	@Autowired
	public Cone(@Qualifier("beanCircle") Shape c, @Qualifier("beanTriangle") Shape t) {
		circle = c;		//created constructor with 2 parameter
		triangle = t;
		setValues();
	}
	
	private void setValues(){
		this.r = ( (Circle) circle ).getR();	//setting this as a bean name
		this.h = ( (Triangle) triangle ).getA();//setting this as a bean name
		System.out.println("circle radius : " + r); //displaying radius of circle
		System.out.println("triangle height : " + h); //displaying height of triangle
		
	}
	
	public double area() {	//created area method
		return Math.PI * r * ( r + Math.sqrt(r*r + h*h) );
	}
}
