package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		//creating application context
		
		Shape c = context.getBean("circle", Shape.class); // bean id is defined and implemented class
		System.out.println("area of circle : " + c.area()); // printing area of circle
		
		c = context.getBean("triangle", Shape.class);  //bean id is defined and implemented class
		System.out.println("area of triangle : " + c.area()); //printing area of triangle
		
		c = context.getBean("cone", Shape.class); //bean id is defined and implemented class
		System.out.println("area of cone : " + c.area()); //printing area of cone
		
		context.close();	//closing the application context
	}
}
