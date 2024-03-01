package com.sagar;

import java.util.Scanner;

public class CountVovel_consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String s = sc.next();
		
		int countvowel = 0;
		int countconsonant = 0;
		char[] chars = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			
			if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u') {
				countvowel++;
			}
			else if(chars[i]>='a' && chars[i]<='z') {
				countconsonant++;
			}
		}
		System.out.println("vowel:"+countvowel);
		System.out.println("consonant:"+countconsonant);
		
		

	}

}
