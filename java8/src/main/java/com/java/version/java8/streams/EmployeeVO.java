package com.java.version.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVO {

	private Integer id;
	private String fname;
	private String lname;
	private String address;
	private Double salary;
	
	public EmployeeVO(EmployeeEntity employeeEntity)
	{
		id = employeeEntity.getId();
		fname = employeeEntity.getFname();
		lname = employeeEntity.getLname();
		address = employeeEntity.getAddress();
		salary = employeeEntity.getSalary();
	}
	
	
}
