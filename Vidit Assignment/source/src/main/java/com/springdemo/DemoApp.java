package com.springdemo;

public class DemoApp {
	public static void main(String[] args) {
		Circle circle = new Circle(5);		//creating circle object
		System.out.println("Area of a circle is : " + circle.area());	//printing area of circle
		
		Shape s = new Circle(10); //creating shape object
		System.out.println("Area of c : " + s.area());	//printing area of shape
		
		s = new Triangle(5, 10);	//calling triangle method and storing the value in s var
		System.out.println("Area of tri : " + s.area());	//printing area of triangle 
	}
}
