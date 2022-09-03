package com.company;

public class Recursion {

	public static void main(String[] args) {
		int x = 4;
		System.out.println(factorial(x));
	}

	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			n = n * (n - 1);

			return (n * factorial(n - 1));
		}
	}

}