package assignment6_InterfaceAbstract;

import java.util.Scanner;

public class StingIntoInteger {
      
	public static int biggest(int num1 , int num2)
	{
		if(num1 > num2)
		{
			return num1;
			
		}
		
		else return num2;
	}
	
	
	public static void main(String [] args)
	{
		String s1,s2;
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the two numbers ");
		s1 =  sc.next();
		s2 =  sc.next();
		
		num1 = Integer.parseInt(s1);
		
		num2 =  Integer.parseInt(s2);
		
		
		int big = biggest(num1 , num2);
		
		System.out.println("big number = "+ big);
		
		sc.close();
		
	}
}
