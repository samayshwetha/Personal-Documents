package com.arrays;

public class SumOfArrayNumbers {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int sum=0;
		
		/*for(int i=0; i<array.length; i++)
		{
			sum=sum+array[i];
		}*/
		
		//approach2: using advanced for loop
		for (int arr : array) {
			sum=sum+arr;
		}
		System.out.println(sum);
	}

}
