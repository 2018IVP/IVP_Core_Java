package com.bank.capone.kiran;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int sum = 0;

		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}

		System.out.println("Sum of digits = " + sum);
		scanner.close();

	}

}
