package com.bank.capone.kiran;

import java.util.Scanner;

public class ReverseStrWithoutUsingStringAPI {

	public static void main(String[] args) {

		System.out.println("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		System.out.println("Reverse String : " + revStr);
		scanner.close();
		
		System.out.println(1%10 +  "  " + 1/10);

	}

}
