package com.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {10,40,30,70,80};
		int key = 40;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("element found at position: "+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("element is not found");
		}

	}

}
