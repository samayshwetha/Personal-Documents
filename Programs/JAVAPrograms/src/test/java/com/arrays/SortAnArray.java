package com.arrays;
 import java.util.Arrays;
import java.util.Collections;
public class SortAnArray {

	public static void main(String[] args) {
		
		/*int[] arr = { 2,0,2,0,1,2,1,1,0};
		System.out.println("Array elements before sorting: "+Arrays.toString(arr));
		
		//Approach1:
		/*for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
					
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array elements before sorting: " + arr[i]);
		}*/
		
		
		//Approach2:Using build in method parallelsort 
		/*Arrays.parallelSort(arr);
		System.out.println("Array elements after sorting: "+Arrays.toString(arr));*/
		
		//Approach3:Using build in method sort 
		/*Arrays.sort(arr);
		System.out.println("Array elements after sorting: "+Arrays.toString(arr));*/
		
		//Approach4: reverse array in descending order
		Integer[] arr = { 2,0,2,0,1,2,1,1,0};
		System.out.println("Array elements before sorting: "+Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Array elements before sorting: "+Arrays.toString(arr));
		
		
	}

}
