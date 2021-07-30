package com.java.version.java8.streams;

import java.util.List;

public class Student {

	private String name;
	private List<String> subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public Student(String name, List<String> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", subjects=" + subjects + "]";
	}
	
	
}
