package com.java.version.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class School {

	public static void main(String[] args) {

		School s = new School();

		List<Student> students = s.getStudents();
		System.out.println(s.getStudentsBasedOnHistorySubject(students));
		System.out.println(s.getDistinctSubjects(students));
	}

	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<Student>();

		List<String> subjects1 = Arrays.asList("English","Science","History");
		Student s = new Student("Rohit", subjects1);

		List<String> subjects2 = Arrays.asList("English","Science","Mathematics");
		Student s1 = new Student("Rahul",subjects2);

		students.add(s);
		students.add(s1);

		return students;
	}

	public List<String> getStudentsBasedOnHistorySubject(List<Student> students)
	{
		List<String> stdLidt = students.stream()
				.filter(s -> s.getSubjects().contains("History"))
				.map(s -> s.getName())
				.collect(Collectors.toList());

		return stdLidt;
	}

	// Using normal for loop
	public List<String> getStudentsBasedOnHistorySubject1(List<Student> students)
	{
		List<String> stdLidt = new ArrayList<String>();
		for(Student s : students)
		{
			if(s.getSubjects().contains("History"))
			{
				stdLidt.add(s.getName());
			}
		}

		return stdLidt;
	}

	public List<String> getDistinctSubjects(List<Student> students)
	{
		return students.stream()
				.map(s -> s.getSubjects())
				.flatMap(List::stream).distinct()
				.collect(Collectors.toList());
	}
}
