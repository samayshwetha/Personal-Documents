package com.javaprograms;

import java.util.Scanner;

public class CountEvenAndOddNumbers {

	public static void main(String[] args) {
						
				System.out.println("enter the number");
			    Scanner sc = new Scanner(System.in);
			    int num = sc.nextInt();
				//int num = 67854;
			    int evencount=0;
			    int oddcount=0;
			    int count=0;
			    while(num>0)
			   {
				   int rem = num%10;
				   if(rem%2==0)
				   {
					   evencount++;
				   }
				   else
				   {
					   oddcount++;
				   }
				  num=num/10;
			   }
			    
			   	System.out.println("Number of Even numbers : "+evencount);
				System.out.println("Number of odd numbers : "+oddcount);
			   	
			}


	}


