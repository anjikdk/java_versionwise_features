package com.java.version.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class EmployeeSortingExample1 
{
	public static void main(String[] args) {
		
		List<Employee> empList = getEmpDetails();
		System.out.println(empList);
		
		// Grouping By Department
		Map<String, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(empMap);
		
		// sorting and grouping by
		Map<String, List<Employee>> empMap1 = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(empMap1);
		
		// grouping, sorting and limit
		Map<String, List<Employee>> empMap2 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.collectingAndThen(Collectors.toList(), 
						e -> e.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2)
						.collect(Collectors.toList()))));
		System.out.println(empMap2);
	}
	
	public static List<Employee> getEmpDetails()
	{
		Employee emp1 = new Employee("IT", "Ram", "xyz", 50000.0);
		Employee emp2 = new Employee("IT", "Rak", "xyz", 60000.0);
		Employee emp3 = new Employee("IT", "Rajesh", "xyz", 20000.0);
		Employee emp4 = new Employee("IT", "Rakesh", "xyz", 30000.0);
		
		Employee emp_1 = new Employee("Admin", "Lokesh", "xyz", 90000.0);
		Employee emp_2 = new Employee("Admin", "Lohith", "xyz", 50000.0);
		Employee emp_3 = new Employee("Admin", "Lokshith", "xyz", 60000.0);
		Employee emp_4 = new Employee("Admin", "Alex", "xyz", 80000.0);
		
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp_1, emp_2, emp_3, emp_4);
		
		return empList;
	}
}
