package com.io.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.io.beans.Triangle;

public class InjectingObjectTest {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		applicationContext.registerShutdownHook();
		
		Triangle triangle = (Triangle) applicationContext.getBean("triangle-name");
		triangle.draw();
		
		applicationContext.close();
	}

}
