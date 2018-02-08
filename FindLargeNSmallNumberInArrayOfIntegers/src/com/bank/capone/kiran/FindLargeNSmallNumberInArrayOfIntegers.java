package com.bank.capone.kiran;

public class FindLargeNSmallNumberInArrayOfIntegers {

	public static void main(String[] args) {

		int num[] = { 2, 43, 134, -23, 0, 3, 1, -22, -2453 };

		int max = 0;
		int maxIndex = 0;
		int min = 0;
		int minIndex = 0;

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
				maxIndex = i;
			} else if (min > num[i]) {
				min = num[i];
				minIndex = i;
			}
		}

		System.out.println("max = " + max + " indexed at = " + maxIndex);
		System.out.println("min = " + min + " indexed at = " + minIndex);

	}

}
