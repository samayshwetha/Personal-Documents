package com.strings;

public class CheckWhetherAphabetDigit {

	public static void main(String[] args) {
		
		String str = "Shwetha12348";
	    String alpha="";
	    String num="";
	    int evencount=0;
	    int oddcount=0;
	    int large=0;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a')&&(str.charAt(i)<='z')||(str.charAt(i)>='A')&&(str.charAt(i)<='Z') )
			{
				alpha=alpha+str.charAt(i);
			}
			else if((str.charAt(i)>='0')&&(str.charAt(i)<='9'))
			{
				num=num+str.charAt(i);
				if(str.charAt(i)%2==0)
				{
					evencount++;
					System.out.println(str.charAt(i));
				}
				else
				{
					oddcount++;
				}
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println("Even numbers: "+evencount);
		System.out.println("odd numbers: "+oddcount);
		
		 
	    /*if(Character.isAlphabetic(c))
			 System.out.println(c + " is an alphabet");
		 else if(Character.isDigit(c))
			 System.out.println(c + " is a digit");
		 else
			 System.out.println(c + " is a special character");*/
		
    
	}

	

}
