package com.spring.jdbc;

public class Student {
	private Integer id;
	private String name;
	private String city;
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
    
	
}
