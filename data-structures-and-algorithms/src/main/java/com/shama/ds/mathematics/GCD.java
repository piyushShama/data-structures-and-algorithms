package com.shama.ds.mathematics;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(4, 6));
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);

	}
}
