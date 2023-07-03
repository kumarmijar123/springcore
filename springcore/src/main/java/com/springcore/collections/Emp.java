package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    
	private List<String> phones;
     private Set<String> address;
     private Map<String, String> courses;
     private Properties mobile;
	public String getName() {
		return name;
	}
	public Emp(List<String> phones, Set<String> address, Map<String, String> courses, Properties mobile, String name) {
		super();
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.mobile = mobile;
		this.name = name;
	}
	public Properties getMobile() {
		return mobile;
	}
	public void setMobile(Properties mobile) {
		this.mobile = mobile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	 
	private String name;
	 public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
			super();
			this.name = name;
			this.phones = phones;
			this.address = address;
			this.courses = courses;

		}
	@Override
	public String toString() {
		return "Emp [phones=" + phones + ", address=" + address + ", courses=" + courses + ", mobile=" + mobile
				+ ", name=" + name + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
