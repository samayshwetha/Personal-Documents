package com.arrays;

public class MaxAndMinNumbersInAnArray {

	public static void main(String[] args) {
		
		int arr[]= {9, 4, 5, 6, 8, 1};
		int min= arr[0];
		int max= arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if (arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Minimum number in array is :"+min);
		System.out.println("Maximum number in array is :"+max);
		
		
		
		

	}

}
