package com.company;

public class MultipleArguments {

	public float multiArgs(int... arr) {
		float avg = 0f;
		int sum = 0;

		for (int i : arr) {
			sum = sum + i;
		}

		avg = sum / arr.length;

		return avg;

	}
}
