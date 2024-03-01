package com.sagar;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character:");
		char ch = sc.next().trim().charAt(0);
		
		switch(ch) {
		
		case 'a'->System.out.println("lowercase");
		case 'b'->System.out.println("lowercase");
		case 'c'->System.out.println("lowercase");
		case 'd'->System.out.println("lowercase");
		case 'e'->System.out.println("lowercase");
		case 'f'->System.out.println("lowercase");
		case 'g'->System.out.println("lowercase");
		case 'h'->System.out.println("lowercase");
		case 'i'->System.out.println("lowercase");
		case 'j'->System.out.println("lowercase");
		case 'k'->System.out.println("lowercase");
		case 'l'->System.out.println("lowercase");
		case 'm'->System.out.println("lowercase");
		case 'n'->System.out.println("lowercase");
		case 'o'->System.out.println("lowercase");
		case 'p'->System.out.println("lowercase");
		case 'q'->System.out.println("lowercase");
		case 'r'->System.out.println("lowercase");
		case 's'->System.out.println("lowercase");
		case 't'->System.out.println("lowercase");
		case 'u'->System.out.println("lowercase");
		case 'v'->System.out.println("lowercase");
		case 'w'->System.out.println("lowercase");
		case 'x'->System.out.println("lowercase");
		case 'y'->System.out.println("lowercase");
		case 'z'->System.out.println("lowercase");
		
		default->System.out.println("uppercase");
		}

	}

}
