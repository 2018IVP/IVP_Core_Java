package com.bank.capone.kiran;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int sum[][] = new int[3][3];
		
		System.out.println("Enter matrix A");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter matrix B");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("");
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + sum[i][j]);
			}
		}
		

	}

}
