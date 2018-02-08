package com.bank.capone.kiran;

public class PrintNFibnocciNumberRecursiveFun {

	int nn;

	public static void main(String[] args) {

		System.out.println(0 + " \n" + 1);
		fibRecursive(0, 1);

	}

	private static void fibRecursive(int i, int j) {

		int nn;
		nn = i + j;
		if (nn >= 100) {
			System.exit(1);
		} else {
			System.out.println(nn);
			i = j;
			j = nn;
			fibRecursive(i, j);
		}
	}

}
