package com.java.version.java8.interfaces;

interface DefaultAndStaticExampleInterface
{
	static void test()
	{
		System.out.println("DefaultAndStaticExampleInterface static test method");
	}
	
	default void test1()
	{
		System.out.println("DefaultAndStaticExampleInterface test1 method");
	}
}

public class DefaultAndStaticExample implements DefaultAndStaticExampleInterface
{
	public static void main(String[] args) {
		
		DefaultAndStaticExampleInterface defaultAndStaticExampleInterface = new DefaultAndStaticExample();
		defaultAndStaticExampleInterface.test1();
		DefaultAndStaticExampleInterface.test();
	}
}
