package com.arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		///array should be in sorted order
		int arr[]= {1,2,3,4,5,6,7,8,9};
		//Approach1
		/*
		int key = 6;
		int low=0;             //0   //5  //6
		int high=arr.length-1; //8   //8
		boolean flag=false;
		while(low<=high)
		{
			int mid =(low+high)/2;   //4   //6  //7
			if(arr[mid]==key)
			{
				System.out.println("element found");
				flag=true;
				break;
			}
			else if(arr[mid]<key)
			{
				low=mid+1;          //5   //6
			}
			else if(arr[mid]>key)
			{
				high=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}*/

		//Approach2:
		
		System.out.println(Arrays.binarySearch(arr, 18));
	}

}
