package com.bank.capone.kiran;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Binary Number : ");
		int binNum = scanner.nextInt();
		int mod;
		int power = 0;
		int decNum = 0;

		while (true) {
			if (binNum == 0) {
				break;
			} else {
				mod = binNum % 10;
				decNum += mod * (Math.pow(2, power));
				power++;
				binNum = binNum / 10;
			}
		}
		System.out.println("Decimal = " + decNum);

		scanner.close();
		
		//using Integer.parseInt  ---  Different approach
		System.out.println("using Integer.parseInt " + Integer.parseInt("10101", 2));
	}

}
