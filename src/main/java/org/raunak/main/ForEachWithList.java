package org.raunak.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfInts = Arrays.asList(2, 3, 5, 7, 11, 3, 17);
		// before java 8 the way is
		// 1st way
		System.out.println("the First way in java 7------------------->");
		for (int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));

		}
		// second way
		System.out.println("the second way in java 7------------------->");
		
		for (Integer i : listOfInts) {
			System.out.println(i);
		}
		// third way 
		System.out.println("the thirs way in java 7------------------->");
		Iterator<Integer> it=listOfInts.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("the first way in java 8------------------->");
		// first java 8 ways
		listOfInts.stream().forEach((i) -> { System.out.println(i); });
		
		// second of java 8 way
		System.out.println("the 2nd way in java 8------------------->");
		listOfInts.stream().forEach(System.out::println);
		// other ways
		listOfInts.stream().forEach( i -> System.out.print( i + ","));
		
	}

}
