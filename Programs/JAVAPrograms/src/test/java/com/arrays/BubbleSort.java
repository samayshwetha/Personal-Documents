package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {4,8,2,7,6,9,1};
		int n =arr.length;
		System.out.println("Before sorting: " +Arrays.toString(arr));
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting: "+Arrays.toString(arr));

	}

}
