package com.io.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.io.beans.Triangle;

public class InjectingObjectTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
