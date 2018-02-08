package com.bank.capone.kiran;

import java.util.Scanner;

public class SumOfDigitsOfNumberRecursion {

	private static int sum;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();

		System.out.println("Sum of digits = " + recurFunction(n));

		scanner.close();

	}

	public static int recurFunction(int n) {
		if (n == 0) {
			return sum;
		} else {
			sum = sum + (n % 10);
			recurFunction(n / 10);
		}
		return sum;
	}
}
