package com.shama.ds.mathematics;

public class CountDigits {
	public static void main(String[] args) {
		System.out.println(countOfDigits(7));
	}

	// Time complexity : Theta n
	// Aux space complexity: Theta 1
	public static int countOfDigits(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}

		return count;
	}
}
