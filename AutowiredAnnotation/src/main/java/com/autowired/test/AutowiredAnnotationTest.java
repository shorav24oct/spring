package com.autowired.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowired.beans.Shape;

public class AutowiredAnnotationTest {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Shape shape = (Shape) applicationContext.getBean("circle");
		
		shape.draw();
		
		applicationContext.close();
	}

}
