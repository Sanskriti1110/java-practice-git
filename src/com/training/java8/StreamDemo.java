package com.training.java8;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(10,12,15,17,28,20);
//		Stream<Integer> numStream = numbers.stream();
//		numStream.filter(x -> x>15).map(n -> n*n).forEach(t -> System.out.println(t));
		
		List<String> names = Arrays.asList("Sans","Nikita","Sam","Chirag");
		//Stream<String> nameStream = names.stream();
		names.stream().filter(x -> x.charAt(0)=='S').map(y -> y.concat(" Amdocs")).sorted().forEach(n -> System.out.println(n));
	}

}
