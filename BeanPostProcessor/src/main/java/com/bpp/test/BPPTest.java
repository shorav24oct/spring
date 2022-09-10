package com.bpp.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bpp.beans.Triangle;

public class BPPTest {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		
		triangle.draw();
		
		applicationContext.close();
	}

}
