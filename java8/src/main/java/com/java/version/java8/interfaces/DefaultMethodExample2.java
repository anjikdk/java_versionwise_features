package com.java.version.java8.interfaces;

interface DefaultMethodExample2Interface1
{
	default void test()
	{
		System.out.println("DefaultMethodExample2Interface1 test method");
	}
}

interface DefaultMethodExample2Interface2
{
	default void test()
	{
		System.out.println("DefaultMethodExample2Interface2 test method");
	}
}

public class DefaultMethodExample2 implements DefaultMethodExample2Interface1, DefaultMethodExample2Interface2
{
	@Override
	public void test() {
		DefaultMethodExample2Interface1.super.test();
	}
	
	public static void main(String[] args) {
		
		DefaultMethodExample2 defaultMethodExample2 = new DefaultMethodExample2();
		defaultMethodExample2.test();
	}
	
}
