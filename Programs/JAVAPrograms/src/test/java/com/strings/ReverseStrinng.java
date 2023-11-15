package com.strings;

public class ReverseStrinng {

	public static void main(String[] args) {
		 
		//Approach1: Using String concatenation (+) Operator
		
		 /*String input = "Madam";
		 String rev ="";
		 System.out.println(rev);
		 for(int i=input.length()-1;i>=0;i--)
		 {
			 rev = rev+input.charAt(i);
		 }
		 System.out.println(rev);
		 if(input.equalsIgnoreCase(rev))
			 System.out.println(input+ " is palindrome");
		 else
			 System.out.println(input+ " is not palindrome");*/
		 
		//Appraoch 2: Using character Array
		/*String str = "samay";
		char[] arr =str.toCharArray();
		String rev ="";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		System.out.println(rev);*/
		
		//Approach3: String butter class
		String str = "Java";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

}
