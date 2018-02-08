package com.bank.capone.kiran;

import java.util.Arrays;

public class SortStringOfCharsUsingStringAPI {

	public static void main(String[] args) {

		String str = "asdflkjghqwertpoiuyzxcvmnb";

		char charArray[] = str.toCharArray();

		Arrays.sort(charArray);

		System.out.println(charArray);

	}

}
