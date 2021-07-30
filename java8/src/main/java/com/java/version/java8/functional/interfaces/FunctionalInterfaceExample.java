package com.java.version.java8.functional.interfaces;

/**
 * 
 * @author 91939
 *  Functional interface should contains only one abstract method but may contains any number of default and static methods
 *  @FunctionalInterface is optional for Functional interface
 *  Functional interface is also called as Single Abstract Method (SAM)
 */
@FunctionalInterface
interface Addition
{
	public int add(int i, int j);
}

public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		
		// Here we are using lamda expression
		Addition obj = (i, j) -> i+j;
		
		int k = obj.add(20, 30);
		System.out.println(k);
	}
}
