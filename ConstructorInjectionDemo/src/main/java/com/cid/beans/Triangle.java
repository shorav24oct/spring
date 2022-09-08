package com.cid.beans;

public class Triangle {
	private String type;
	private int height;

	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public void draw() {
		System.out.println("triangle type is " + this.type + " and height is " + this.height);
	}

}
