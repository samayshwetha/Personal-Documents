package com.arrays;


import java.util.ArrayList;
import java.util.HashSet;
public class RemovingDublicateNumberArray {

	public static void main(String[] args) {
		
		int arr[]= {0,0,1,3,3,2,2,0,1,2};
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
		System.out.println("duplicate elemetes: "+hashdup);
		 
		 
		
		
		  
		
	}

}
