package com.greatlearning.dsa.lab2.question1;

import java.util.Scanner;

/* Define class PayMoney for handling a list of payment transactions 
 * and managing daily target to be achieved
 */
public class PayMoney {

	// Define main method
	public static void main(String[] args) {

		/*
		 * Define Scanner class object sc and initialize it with a predefined System
		 * class standard input stream in
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of transaction array");

		/*
		 * Define transactionSize which takes user input as integer by invoking nextInt
		 * function of Scanner class
		 */
		int transactionSize = sc.nextInt();

		/*
		 * Define transactionArr array and initialize it with transactionSize as the
		 * number of elements or length of the array
		 */
		int transactionArr[] = new int[transactionSize];
		System.out.println("enter the values of array");

		/*
		 * Using a for loop to iterate till the value of transactionSize while taking
		 * user input as integer for transactionArr array by invoking nextInt function
		 * of Scanner class
		 */
		for (int i = 0; i < transactionSize; i++) {
			transactionArr[i] = sc.nextInt();
		}

		System.out.println("enter the total no of targets that needs to be achieved");

		/*
		 * Define totalTargetNo which takes user input as integer by invoking nextInt
		 * function of Scanner class
		 */
		int totalTargetNo = sc.nextInt();

		/*
		 * Using a while loop where the below instructions get executed until given
		 * condition is true
		 */
		while (totalTargetNo-- != 0) {
			int flag = 0;
			long target;

			System.out.println("enter the value of target");

			/*
			 * Define target which takes user input as integer by invoking nextInt function
			 * of Scanner class
			 */
			target = sc.nextInt();

			long sum = 0;

			/*
			 * Using a for loop to traverse transactionArr array till transactionSize value
			 * or length and add sum to the value every i'th value
			 */
			for (int i = 0; i < transactionSize; i++) {
				sum += transactionArr[i];

				// Execute following code while sum is greater than or equal to target value
				if (sum >= target) {

					// print appropriate message
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;
				}
			}

			// Execute following code if flag is equal to 0
			if (flag == 0) {

				// print appropriate message
				System.out.println("Given target is not achieved");
			}

		}

		// closing the Scanner class object sc to prevent leakage
		sc.close();

	}

}
