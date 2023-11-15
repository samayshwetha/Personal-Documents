package com.javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
				
		// A factorial is a function that multiplies a number by every number below it.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num =  sc.nextInt();
		
		
		//descending order
		/*int fact=num;
		for(int i=num-1;i>=1;i--)
		{
			fact = fact*i;
		}*/
		
		//Ascending order
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		 
		 System.out.println("factorial of "+num +" is :"+fact);

	}

}
