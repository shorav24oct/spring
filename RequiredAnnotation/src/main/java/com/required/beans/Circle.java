package com.required.beans;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Circle implements Shape {

	private Point pointA;

	public Point getPointA() {
		return pointA;
	}

	@Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void draw() {
		System.out.println("drawing circle");
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
	}

}
