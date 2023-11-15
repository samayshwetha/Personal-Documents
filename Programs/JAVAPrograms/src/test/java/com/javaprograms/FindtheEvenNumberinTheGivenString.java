package com.javaprograms;

public class FindtheEvenNumberinTheGivenString {

	public static void main(String[] args) {
		
		
		String str = "d1d053042b4444a";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				if(str.charAt(i)%2==0)	
				{
					count++;
				}
			}
				}
		System.out.println(count);
}
}
