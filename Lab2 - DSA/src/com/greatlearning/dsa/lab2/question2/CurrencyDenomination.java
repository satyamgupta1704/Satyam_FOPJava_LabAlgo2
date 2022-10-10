package com.greatlearning.dsa.lab2.question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* Define class CurrencyDenomination where for a given size, corresponding
 * number of denominations and an amount, we calculate how to make an
 * exact payment with higher denominations first.
 */
public class CurrencyDenomination {

	// Define main method
	public static void main(String[] args) {

		/*
		 * Define Scanner class object sc and initialize it with a predefined System
		 * class standard input stream in
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");
		
		/*
		 * Define denominationSize which takes user input as integer by invoking nextInt
		 * function of Scanner class
		 */
		int denominationSize = sc.nextInt();

		System.out.println("enter the currency denominations value");

		/*
		 * Define Integer denominationArr array and initialize it with denominationSize
		 * as the number of elements or length of the array
		 */
		Integer[] denominationArr = new Integer[denominationSize];

		/*
		 * Using a for loop to iterate till the value of denominationSize while taking
		 * user input as integer for denominationArr array by invoking nextInt function
		 * of Scanner class
		 */
		for (int i = 0; i < denominationSize; i++) {
			denominationArr[i] = sc.nextInt();
		}

		/*
		 * Using predefined sort method under Arrays class and passing 2 arguments the
		 * first of which is denominationArr, and for second argument we use another
		 * predefined method reverseOrder under Collections class. This is used to
		 * achieve the sorting of denominations value being provided by user.
		 */
		Arrays.sort(denominationArr, Collections.reverseOrder());

		System.out.println("enter the amount you want to pay");

		/*
		 * Define amount which takes user input as integer by invoking nextInt function
		 * of Scanner class
		 */
		int amount = sc.nextInt();

		// closing the Scanner class object sc to prevent leakage
		sc.close();

		int i = 0;

		/*
		 * Define currencyCount array and initialize it with denominationSize as the
		 * number of elements
		 */
		int[] currencyCount = new int[denominationSize];

		/*
		 * Using a while loop where the below instructions get executed until given
		 * condition is true
		 */
		while (amount > 0) {
			currencyCount[i] = amount / denominationArr[i];
			amount = amount - (denominationArr[i] * currencyCount[i]);
			i++;
		}

		System.out.println("Your payment approach in order to give min no of notes will be");

		/*
		 * Using a for loop to traverse denominationArr array till denominationSize
		 * value or length and printing appropriate message if the condition is
		 * satisfied
		 */
		for (int j = 0; j < denominationSize; j++) {
			if (currencyCount[j] != 0) {
				System.out.println(denominationArr[j] + ":" + currencyCount[j]);
			}

		}

	}

}
