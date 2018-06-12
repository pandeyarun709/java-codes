package Assignment4;

import java.util.Scanner;

public class Question2_FindEvenNumber {
	
	public static void findEven(int num)
	{
		int i=0;
		System.out.println("Even numbers are : ");
		for(i=0;i<=num;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		
	}
		public static void main(String [] args)
		{
			int num;
			
			Scanner sc =  new Scanner(System.in);
			
			System.out.println("Enter the number : ");
			 
			num = sc.nextInt();
			
			findEven(num);
			sc.close();
			
			
		}
	}


