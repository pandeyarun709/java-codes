package assignment1;

import java.util.Scanner;

public class Question7_Reverse {
	
	 public static int reverseNum(int num) //check palindrome
		{
			int rev =0,rem =0;
			
			
			while(num !=0) //reverse the number
			{
				rem = num%10;
				
				rev = rev *10 + rem;
				
				num = num /10;
			}
			
			return rev;
		}
		
		public static void main(String [] args)
		{
			int num;
			Scanner sc =  new Scanner(System.in);
			
			System.out.println("Enter the  number  : ");
			
			num = sc.nextInt();
			
			
			
			int  reverse = reverseNum(num);
			
			 System.out.println("Reverse of "+num+" is "+reverse);
			
			sc.close();
		}
}
