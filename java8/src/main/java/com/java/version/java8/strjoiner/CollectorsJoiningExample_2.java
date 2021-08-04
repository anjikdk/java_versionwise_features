package com.java.version.java8.strjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

public class CollectorsJoiningExample_2 {

	public static void main(String[] args) {

		List<Game> list = Arrays.asList(
				new Game("Dragon Blaze", 5),
				new Game("Angry Bird", 5),
				new Game("Candy Crush", 5)
				);

		//{Dragon Blaze, Angry Bird, Candy Crush}
		String result = list.stream().map(x -> x.getName())
				.collect(Collectors.joining(", ", "{", "}"));
		
		System.out.println(result);
	}
}

@Setter
@Getter
class Game{
	String name;
	int ranking;

	public Game(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}
}
