package com.bank.capone.kiran;

import java.util.Scanner;

public class NumberPalindromeOrNot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = scanner.nextInt();

		int n = input;
		int rev = 0;

		while (n != 0) {
			rev = (rev * 10) + (n % 10);
			n = n / 10;
		}

		System.out.println("Reverse = " + rev);

		if (input == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not palindrom");
		}

		scanner.close();

	}

}
