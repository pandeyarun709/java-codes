package assignment1;

import java.util.Scanner;

public class Question6_Prime {

	public static boolean checkPrime(int num)
	{
		int i=0;
		if(num !=1 && num !=0)
		{
			for(i=2;i<=Math.sqrt(num);i++)
			{
				if(num % i ==0)
				{
					return false;
				}
			}
		}
		else return false;
		
		
	
		
		return true;
	}
	
	public static void main(String [] args)
	{
		int num;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the  number  : ");
		
		num = sc.nextInt();
		
		
		
		boolean  check = checkPrime(num);
		
		if(check)
		{
			 System.out.println(num+" is prime number");
			
		}
		else System.out.println(num+" is not prime number");
		
		sc.close();
		
	}
}
