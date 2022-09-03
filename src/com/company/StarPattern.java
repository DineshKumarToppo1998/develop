package com.company;

public class StarPattern {

	public void starPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}
}
