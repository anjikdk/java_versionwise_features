package com.java.version.java8.interfaces;

interface DefaultMethodExampleInterface
{
	public void test();
	
	default void test1()
	{
		System.out.println("DefaultMethodExampleInterface test1 method");
	}
}

public class DefaultMethodExample implements DefaultMethodExampleInterface
{
	@Override
	public void test() {
		System.out.println("DefaultMethodExample test method");
	}
	
	public static void main(String[] args) {
		
		DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
		defaultMethodExample.test();
		defaultMethodExample.test1();
	}

}
