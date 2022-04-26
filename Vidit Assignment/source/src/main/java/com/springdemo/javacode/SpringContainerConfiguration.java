package com.springdemo.javacode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration	//defining that this class include more than 1 bean method
@ComponentScan("com.springdemo.javacode")	//defines which package to scan
@PropertySource("application.properties")	//defining the property to look for this class
public class SpringContainerConfiguration {

	@Bean("triangle")		//defining bean method
	public Triangle getTriangle(@Value("${triangle.height}") int a, @Value("${triangle.base}") int b ) {
		return new Triangle((a), (b));
		//returns value of Triangle(a)(b) variable
	}
	
	@Bean("circle")		//defining bean method
	public Circle getCircle(@Value("${circle.radius}") int r) {
		return new Circle((r));
		//returns value of Circle(r)
	}
	
	@Bean("cone")	//defining bean method 
	public Cone getCone(Shape circle, Shape triangle) {
		return new Cone(circle, triangle);
		//return value of Cone(circle and triangle)
	}
}
