package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationcontext_annotations.xml");  //creating ApplicationContext
		
		Shape c = context.getBean("beanCircle", Shape.class);	//bean id  and implemented class
		System.out.println("area of circle : " + c.area());	//printing area of circle
		
		Shape c2 = context.getBean("beanCircle", Shape.class);	//bean id and implemented class
		System.out.println("c==c2 : " + (c==c2) + " c1.hash : " + c.hashCode() + " & c2.hash : " + c2.hashCode());
		//printing of if c==c2 is true or false and c1 hashCode and c2 hashCode
				
		c = context.getBean("beanTriangle", Shape.class);	//bean id and implemented class
		System.out.println("area of triangle : " + c.area()); //printing the area of triangle
		
		c = context.getBean("beanCone", Shape.class);	//bean id and implemented class
		System.out.println("area of cone : " + c.area());	//printing the area of cone
		
		context.close();	//closing application context
	}
}
