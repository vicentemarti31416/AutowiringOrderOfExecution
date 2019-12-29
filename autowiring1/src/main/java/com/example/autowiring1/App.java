package com.example.autowiring1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.autowiring1.beans.BeanTarget;

public class App {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		BeanTarget target = context.getBean(BeanTarget.class);
		System.out.println(target.getClass2());
	}
}
