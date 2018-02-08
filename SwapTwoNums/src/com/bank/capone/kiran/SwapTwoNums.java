package com.bank.capone.kiran;

import java.util.Scanner;

public class SwapTwoNums {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first num : ");
		int a = scanner.nextInt();
		System.out.println("Enter second num : ");
		int b = scanner.nextInt();

		System.out.println("A=" + a + "   B =" + b);

		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println("After SWAP A=" + a + "   B =" + b);
		scanner.close();

	}

}
