package com.io.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, InitializingBean, DisposableBean {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("Point (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("Point (" + pointC.getX() + ", " + pointC.getY() + ")");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

	
	  @Override public void destroy() throws Exception {
	  System.out.println("DisposableBean destroy method called"); }
	  
	  @Override public void afterPropertiesSet() throws Exception {
	  System.out.println("InitializingBean init method called"); }
	 
	
	public void myInit() {
		System.out.println("my init method is calling");
	}
	
	public void cleanUp() {
		System.out.println("my clean up method is calling");
	}

}
