package com.java.version.java8.interfaces;

interface StaticMethodExampleInterface
{
	public void test();
	
	static void test1()
	{
		System.out.println("StaticMethodExampleInterface test1 method");
	}
}

public class StaticMethodExample implements StaticMethodExampleInterface
{
	public static void main(String[] args) {
		
		StaticMethodExampleInterface staticMethodExampleInterface = new StaticMethodExample();
		staticMethodExampleInterface.test();
		StaticMethodExampleInterface.test1();
	}

	@Override
	public void test() {
		System.out.println("StaticMethodExample test method");
	}
}
