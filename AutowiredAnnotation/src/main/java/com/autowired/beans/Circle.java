package com.autowired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier(value = "circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("drawing circle");
		System.out.println("Point A = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
	}

}
