package com.spring.practice.java_config.model;

import org.springframework.context.annotation.Scope;


public class School {

	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + "]";
	}
	private String address;
}
