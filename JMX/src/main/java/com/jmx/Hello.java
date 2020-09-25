package com.jmx;

public class Hello implements HelloMBean{
	
	public String sayHello(String name) {
		return "Hello "+name;
	}
		
}
