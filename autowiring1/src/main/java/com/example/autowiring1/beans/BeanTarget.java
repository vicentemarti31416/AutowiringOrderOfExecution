package com.example.autowiring1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanTarget {
	
	@Autowired
	private Interface1 class2;

	public BeanTarget() {

	}

	public Interface1 getClass2() {
		return class2;
	}

	public void setClass2(Interface1 class2) {
		this.class2 = class2;
	}
	
}
