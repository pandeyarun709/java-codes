package assignment7_String;

import java.util.Scanner;

public class ReversString {
	
	public static String reverseString(String str)
	{
		String s = new String();
		
		for(int i = str.length()-1 ; i>=0; i--)
		{
			s = s + str.charAt(i);
			
			
		}
		
		
		return s;
	}
	
	public static void main(String [] args)
	{
		
		Scanner sc =  new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter the String : ");
		
		str = sc.nextLine();
		
		String s = reverseString(str);
		
		System.out.println("Reverse of "+str+" is : "+s);
		
		sc.close();
		
		
		
	}

}
