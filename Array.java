package com.sagar;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int arr[] = {12,34,45,67};
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void change(int arr[]) {
		arr[0] = 99;
	}

}
