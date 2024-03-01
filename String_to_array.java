package com.sagar;
//convert string to array
public class String_to_array {

	public static void main(String[] args) {
		String str = "sagar";
		char chars[] = str.toCharArray();
		System.out.println(chars);
		
		for(int i=0;i<chars.length;i++) {
			System.out.println(chars[i]);
		}
	}

}
