package com.springdemo.javacode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringContainerConfiguration.class);
		//creating Application Context		
		
		Shape c = context.getBean("circle", Shape.class);    //bean id and implemented class
		System.out.println("area of circle : " + c.area());  //printing area of circle 

		c = context.getBean("triangle", Shape.class);  //bean id and implemented class
		System.out.println("area of triangle : " + c.area());  //printing area of triangle

		c = context.getBean("cone", Shape.class);  //bean id and implemented class
		System.out.println("area of cone : " + c.area()); //printing area of cone
		
	}
}
