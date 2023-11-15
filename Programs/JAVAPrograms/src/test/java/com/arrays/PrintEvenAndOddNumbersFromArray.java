package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintEvenAndOddNumbersFromArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 6, 5, 7, 8,9};
				
		System.out.println("Even numbers in an Array.........");
		/*for (int i=0 ;i<arr.length ;i++)
		{
			if(arr[i]%2==0)
			System.out.print(arr[i]+"\t");	
			
		}*/
		//Using enhanced for loop
		/*for (int a : arr) {
			if(a%2==0)
		    System.out.print(a+"\t");		
		}
				
		System.out.println();
		System.out.println("Odd numbers in an Array.........");*/
		/*for (int i=0 ;i<arr.length ;i++)
		{
			if(arr[i]%2!=0)
			System.out.print(arr[i]+"\t");	
			
		}*/
		
		//Using enhanced for loop
		/*for (int a : arr) {
			if(a%2!=0)
		    System.out.print(a+"\t");		
		}*/

		ArrayList<Integer> odd = new ArrayList();
		ArrayList<Integer> even = new ArrayList();
		
		for (int i=0 ;i<arr.length ;i++)
		{
			if(arr[i]%2==0)
				even.add(arr[i]);
			else
				odd.add(arr[i]);
		}	
		
		System.out.println(even);
		System.out.println(odd);
	}

}
