package com.java.version.java8.foreach;

import java.util.List;
import java.util.function.Consumer;

import com.java.version.java8.Util;

public class ForEachExample2 {

	public static void main(String[] args) {

		List<String> list = Util.prepareListOfStrings();
		ForEachExample2 forEachExample2 = new ForEachExample2();
		forEachExample2.printListValues(list);
	}

	public void printListValues(List<String> list)
	{
		MyConsumer consumer = new MyConsumer();
		list.forEach(consumer);
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<String>{

	public void accept(String t) {
		System.out.println("Consumer impl Value:: "+t);
	}
}
