/**
 * 
 */
package com.tania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Generate 500 random numbers and print the nth smallest number in a
 * programming language of your choice. (Ask user for the Nth smallest number)
 * 
 * Go in a loop 500 times{ Generate a single random number Add this number to a
 * list }
 * 
 * Sort the list in ascending order. Return nth number from the list
 *
 * 
 * 
 */
public class Randomizer {

	public static void main(String[] args) {
		//doStuff(9);
		printNthRandomNumber(3);		
	}

	public static void printNthRandomNumber(int n) {
		List<Integer> myList = new ArrayList<>();

		for (int i = 0; i < 500; i++) {

			Random rand = new Random();
			int x = rand.nextInt(100000);
			System.out.println(x);
			myList.add(x);

		}

		Collections.sort(myList);
		int result = myList.get(n);
		System.out.println("N is: "+ n + " and Result is: " + result);
	}

}
