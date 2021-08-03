package com.java.version.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertFromEntityToVO {
	
	public static void main(String[] args) {
		
		List<EmployeeEntity> employeeEntities = ConvertFromEntityToVO.getEmployeeEntities();
		
		ConvertFromEntityToVO.convertFromEntityToVO_1(employeeEntities);
		ConvertFromEntityToVO.convertFromEntityToVO_2(employeeEntities);
		ConvertFromEntityToVO.convertFromEntityToVO_3(employeeEntities);
		
	}

	public static List<EmployeeEntity> getEmployeeEntities()
	{
		EmployeeEntity emp1 = new EmployeeEntity(100, "abc", "xyz", "Blr", 15000.0);
		EmployeeEntity emp2 = new EmployeeEntity(100, "aaa", "yyy", "hyd", 50000.0);
		EmployeeEntity emp3 = new EmployeeEntity(100, "bbb", "zzz", "chennai", 1000.0);
		
		List<EmployeeEntity> employeeEntities = new ArrayList<EmployeeEntity>();
		employeeEntities.add(emp1);
		employeeEntities.add(emp2);
		employeeEntities.add(emp3);
		
		return employeeEntities;
	}
	
	public static void convertFromEntityToVO_1(List<EmployeeEntity> employeeEntities)
	{
		List<EmployeeVO> employeeVOs = employeeEntities.stream().map(EmployeeVO::new).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("First way....");
		System.out.println(employeeVOs);
	}
	
	public static void convertFromEntityToVO_2(List<EmployeeEntity> employeeEntities)
	{
		List<EmployeeVO> employeeVOs = employeeEntities.stream().map(ConvertFromEntityToVO::convert).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Second way....");
		System.out.println(employeeVOs);
	}
	
	public static void convertFromEntityToVO_3(List<EmployeeEntity> employeeEntities)
	{
		List<EmployeeVO> employeeVOs = employeeEntities.stream()
											.map(e -> new EmployeeVO(e.getId(), e.getFname(), e.getLname(), e.getAddress(), e.getSalary()))
											.collect(Collectors.toList());
		System.out.println("Third way....");
		System.out.println(employeeVOs);
	}
	
	public static EmployeeVO convert(EmployeeEntity employeeEntity)
	{
		EmployeeVO employeeVO = new EmployeeVO();
		
		employeeVO.setId(employeeEntity.getId());
		employeeVO.setAddress(employeeEntity.getAddress());
		employeeVO.setFname(employeeEntity.getFname());
		employeeVO.setLname(employeeEntity.getLname());
		employeeVO.setSalary(employeeEntity.getSalary());
		
		return employeeVO;
	}
}
