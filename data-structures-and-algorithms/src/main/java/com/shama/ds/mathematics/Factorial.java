package com.shama.ds.mathematics;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorialM1(25));
		//System.out.println(factorialM2(5));

	}

	// iterative : Aux space theta 1 , time Theta n
	static int factorialM1(int number) {
		int res = 1;
		for (int i = 2; i <= number; i++) {
			res *= i;
		}
		return res;
	}

	// recursive : Aux space theta n, time Theta n
	static int factorialM2(int number) {
		if (number == 0 || number == 1)
			return 1;

		return number * factorialM2(number - 1);
	}
}
