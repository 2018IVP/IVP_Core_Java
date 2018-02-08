package com.bank.capione.kiran;

public class SortStringOfCharsWithoutUsingStringAPI {

	public static void main(String[] args) {
		
		String str = "asfdasewiroq";
		
		char charArray[] = str.toCharArray();
		char temp;
		
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				if(charArray[i] < charArray[j]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		
		System.out.println(charArray);
		
	}

}
