package com.company;

import java.util.Scanner;

public class MainController {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int n = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		MultiplicationTable mt = new MultiplicationTable();
		StarPattern sp = new StarPattern();
		RecursiveSum rs = new RecursiveSum();
		MultipleArguments mArg = new MultipleArguments();
		
//		System.out.print("Enter the number: ");
//		n = sc.nextInt();
		
//		MULTIPLICATION TABLE
//		mt.multipicationTable(n);
		
//		STAR PATTERN
//		sp.starPattern(n);
		
//		RECURSIVE SUM
//		System.out.println(rs.recursiveSum(n));
		
//		AVERAGE OF THE NUMBERS PASSED IN ARGUMENTS
		System.out.print("Enter the number of arguments to be passed: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Enter the number: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("The Average is: "+mArg.multiArgs(arr));
	}

}
