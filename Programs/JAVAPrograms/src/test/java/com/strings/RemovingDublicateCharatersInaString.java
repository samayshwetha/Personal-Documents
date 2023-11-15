package com.strings;

public class RemovingDublicateCharatersInaString {

	public static void main(String[] args) {
		
		String name="shawetha";
		
		/*String result="";
		
		for(int i=0;i<name.length();i++)
		{
			String ch = ""+name.charAt(i);
			if(result.contains(ch))
			{
				continue;
			}
			result=result+ch;
			
		}
		System.out.println("String with duplicates: "+name);
		System.out.println("String without duplicates: "+result);*/
		
		
		System.out.println("dublicate characters");
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println(name.charAt(i));
				}
			}
		}
		}
	
	

	}


