package com.shama.ds.mathematics;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(86683));
	}

	// Time complexity : theta d, Auxilary space complexity : theta 1
	static boolean isPalindrome(int number) {
		int rev = 0;
		int temp = number;
		while (temp > 0) {
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}

		return number == rev;
	}

}
