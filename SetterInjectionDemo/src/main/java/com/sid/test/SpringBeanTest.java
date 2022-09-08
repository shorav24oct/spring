package com.sid.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sid.beans.Triangle;

@SuppressWarnings("deprecation")
public class SpringBeanTest {

	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		// BeanFactory beanFactory = new XmlBeanFactory(new
		// FileSystemResource("spring-bean.xml"));
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
