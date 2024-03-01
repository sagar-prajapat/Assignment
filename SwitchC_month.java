package com.sagar;

import java.util.Scanner;

public class SwitchC_month {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("enter month(1-12):");
			int month = sc.nextInt();
			System.out.println("enter monthname:");
			String monthname = sc.next();
			
			switch(month) {
			
			case 1:System.out.println("jan");
			       switch(monthname) {
			       
			       case "jan":System.out.println("31 days");
			                  break;
			       }
			       break;
			       
			case 2:System.out.println("feb");
			       switch(monthname) {
		       
		           case "feb":System.out.println("28 days");
		                      break;
			       }
		           break;
		           
			case 3:System.out.println("march");
		       switch(monthname) {
	       
	           case "march":System.out.println("31 days");
	                      break;
		       }
	           break;
	           
	        
			case 4:System.out.println("april");
		       switch(monthname) {
	       
	           case "april":System.out.println("30 days");
	                      break;
		       }
		       
			case 5:System.out.println("may");
		           switch(monthname) {
	       
	               case "may":System.out.println("31 days");
	                          break;
		       }
	           break;
	           
			case 6:System.out.println("june");
		       switch(monthname) {
	       
	           case "june":System.out.println("30 days");
	                      break;
		       }
	           break;
	           
			case 7:System.out.println("july");
		       switch(monthname) {
		       
		       case "july":System.out.println("31 days");
		                  break;
		       }
		       break;
		       
		    case 8:System.out.println("aug");
		           switch(monthname) {
	       
	               case "aug":System.out.println("31 days");
	                          break;
		       }
	           break;
	           
		    case 9:System.out.println("sep");
	               switch(monthname) {
    
                   case "sep":System.out.println("30 days");
                              break;
	          }
              break;
        
     
		    case 10:System.out.println("oct");
	                switch(monthname) {
    
                    case "oct":System.out.println("31 days");
                               break;
	       }
	        break;
	       
		   case 11:System.out.println("nov");
	               switch(monthname) {
    
                   case "nov":System.out.println("30 days");
                              break;
	       }
           break;
        
		   case 12:System.out.println("dec");
	               switch(monthname) {
    
                   case "dec":System.out.println("31 days");
                               break;
	       }
            break;
            
		    default:System.out.println("invalid month");
		            break;
			}

	}
		            

	}

	
		            
