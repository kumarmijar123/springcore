package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}   
	
	@PostConstruct
	public void start()
	{
		System.out.println("starting method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending method");
	}
}
	