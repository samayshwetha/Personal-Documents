package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindDublicatesInArray {

	private static final Object Integer = null;

	public static void main(String[] args) {
		
		//Approach1:
		String arr[] = { "Program","C++","Python","java","OOPS","OOPS","java","Python"};
		
		String duplicate[]= new String[arr.length];
		int count=0;
		boolean flag=false; 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i].contentEquals(arr[j]))
			{
			
				System.out.println("Found duplicate element : "+arr[i]);
				duplicate[count]=arr[i];
				count++;
				flag=true;
			}
			}
		}
		
		if(flag=false)
		System.out.println("Not Found duplicate element : ");
		for(int i=0;i<count;i++)
			System.out.println(duplicate[i]);

		//Approach2: using hash table remove and print dublicates
		/*String arr[] = { "Program","C++","Python","java","OOPS","OOPS","java","Python"};
		HashSet<String> hash = new HashSet();
		HashSet<String> duplicatehash = new HashSet();
		
		 for (String str : arr) {
			if(hash.add(str)==true)
			{
				hash.add(str);
			}
			else
			{
				duplicatehash.add(str);
			}
					
		}
		 System.out.println("After removing duplicates:"+hash);
		 System.out.println("duplicate elemetes: "+duplicatehash);*/
		
		/*int arr[]= {0,0,1,3,3,2,2,0,1,2};
		HashSet<Integer> hash1 = new HashSet<Integer>();
		HashSet<Integer> hashdup = new HashSet<Integer>();
		
		for (Object a : arr) {
			if(hash1.add((Integer)a)==true)
			{
				hash1.add((Integer)a);
			}
			else
			{
				hashdup.add((Integer)a);
			}
			
		}
		System.out.println("After removing duplicates:"+hash1);
		System.out.println("duplicate elemetes: "+hashdup);*/
		 
		 
		 
	}

}
