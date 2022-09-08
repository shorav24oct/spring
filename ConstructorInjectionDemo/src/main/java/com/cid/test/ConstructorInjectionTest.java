package com.cid.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cid.beans.Triangle;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
