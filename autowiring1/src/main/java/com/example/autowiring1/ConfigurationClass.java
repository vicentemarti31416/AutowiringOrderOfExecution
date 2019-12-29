package com.example.autowiring1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.autowiring1.beans.BeanTarget;

@Configuration
@ComponentScan(basePackages = {"com.example.autowiring1.beans"})
public class ConfigurationClass {
	
	public BeanTarget getClass1() {
		return new BeanTarget();
	}

}
