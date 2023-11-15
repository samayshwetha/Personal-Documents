package com.strings;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicatesElemetsInaStringArray {

	public static void main(String[] args) {
		
		//Finding the duplicates
		String[] str = {"Java","C++","C","java","python"};
		boolean flag=true;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					
					System.out.println("Duplicates found: "+str[i]);
					flag=false;
				}
			}
		}
		if(flag==true)
			System.out.println("duplicates are not present");
		
		//removing the duplicates
		/*HashSet<String> hs = new HashSet<String>();
		for (String s : str) {
			hs.add(s);
		}
		System.out.println(hs);*/
 
		
		/*HashSet<String> hs = new HashSet<String>();
		for (String s : str) {
			if(hs.add(s)==false)
			System.out.println(s);
		}
		System.out.println(hs);*/
		
	}

}
