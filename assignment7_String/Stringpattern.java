package assignment7_String;

import java.util.Scanner;

public class Stringpattern {

	
	public static void stringPattern(int row)
	{
		String s = new String();
		char c = 97; //intialize c at 'a' 
		
		for(int i=0 ; i < row ; i++)
		{
			 
			 s = s + c ;
			 c++;  
			 
			 System.out.println(s);
		}
		
	}
	
	public static void main(String [] args)
	{
		int row ;
		
		System.out.println("Enter how many row you want in pattern : ");
		
		Scanner sc = new Scanner(System.in);
		row =  sc.nextInt();
		
		stringPattern(row);
		
		sc.close();
	}
}
