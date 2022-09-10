package com.required.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.required.beans.Shape;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Shape shape = (Shape) applicationContext.getBean("circle");
		
		shape.draw();
		
		applicationContext.close();
	}

}
