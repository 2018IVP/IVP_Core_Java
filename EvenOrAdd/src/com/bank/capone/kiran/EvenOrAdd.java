package com.bank.capone.kiran;

import java.util.Scanner;

public class EvenOrAdd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int n = scanner.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is Even number");
		} else {
			System.out.println(n + " is Add number");
		}

		scanner.close();

	}

}
