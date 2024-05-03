package com.shama.ds.mathematics;

public class TrailingZerosFactorial {
	public static void main(String[] args) {
		System.out.println(trailingZeros(25));
	}

	// time complexity : theta log (n)
	public static int trailingZeros(int number) {

		int res = 0;
		for (int i = 5; i <= number; i = i * 5) {
			res += number / i;
		}

		return res;
	}
}
