package org.money;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
	int balance = 50000,Withdraw = 0 ,Deposite = 0,Pin =1999,Card=456521229;
		
		
		while (true) {
			System.out.println("Welcome to ATM");
			
		    System.out.println("1.Enter the card num");
            System.out.println("2.Enter the pin");
			System.out.println("3.Enter the amount Withdraw");
			System.out.println("4.Enter the amount deposite");
			   Card=a.nextInt();
		   switch (Card) {
		   case 1:System.out.println("Enter the card num");
		   Card=a.nextInt();
		   if (Card==456521229) {
			   System.out.println("\n Select next step");
			   
			
		}
		   else {
			   System.out.println("\n Invalid card no");
			   return;
			   
		} 
		   
		   
		   break;
		   
		   case 2: System.out.println("Enter the pin");
		   Pin=a.nextInt();
		   if (Pin==1999) {
			  
			   System.out.println("\n You able to go next step");
			
		}
		   else {
			System.out.println("\n Pin invalid");
			return;
			}
		   break;
		case 3:System.out.println("Enter the amount Withdraw");
		          Withdraw = a.nextInt();
		       if (balance>=Withdraw) {
		    	   balance= balance - Withdraw;
		    	   System.out.println("\n Your balance is "+ balance);
				
			} else {
				System.out.println("\nInsufficiant balance");

			}
			
			break;
			
		case 4:System.out.println("Enter the amoutn deposite");
		    Deposite= a.nextInt();
		balance = balance+Deposite;
        System.out.println("\nYour balance is"+ balance);
		
		break;
		} 
			
			
			
			
			
			
			
			
		   
			
			
			
			
			
			
		   
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
