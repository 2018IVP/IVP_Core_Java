package com.bank.capone.kiran;

import java.util.Scanner;

public class DecimalToBinary {

	/*
	 * Note that here you are using 2 not 10 for Decimal to Binary conversion
	 */

	public static void convertDeciamlToBinary(int num) {

		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index] = num % 2;
			num = num / 2;
			index++;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}

	}

	public static void main(String[] args) {

		System.out.println("\nBinary representation of 12: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		convertDeciamlToBinary(n);

		/*
		 * you can simple use one statement to convert
		 */
		System.out.println("\n" + Integer.toBinaryString(n));
		
		scanner.close();

	}

}