package com.bank.capone.kiran;

import java.util.Scanner;

public class PrintNumbersWithOutLoop {

	static int n;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		recursiveFunction(1);
		
		scanner.close();

	}

	public static void recursiveFunction(int i) {

		if (i <= n) {
			System.out.println(i);
			recursiveFunction(i+1);
		}
	}

}
