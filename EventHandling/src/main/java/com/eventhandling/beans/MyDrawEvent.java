package com.eventhandling.beans;

import org.springframework.context.ApplicationEvent;

public class MyDrawEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1029905395902408333L;

	public MyDrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "My Draw event occured";
	}

}
