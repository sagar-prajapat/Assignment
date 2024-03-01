package com.sagar;
//string charAt()
public class String_charAt {

	public static void main(String[] args) {
		String str ="sagar prajapat java programming";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		for(int i=0;i<str.length();i++) {
			if(i%2==1) {
				System.out.println(str.charAt(i));
			}
			else if(i%2==0) {
				System.out.println(str.charAt(i));
			}
		}

	}

}
