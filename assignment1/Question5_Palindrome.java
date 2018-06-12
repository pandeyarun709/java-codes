package assignment1;
import java.util.Scanner;

public class Question5_Palindrome {

	public static boolean palindrome(int num) //check palindrome
	{
		int rev =0,rem =0,n;
		n= num;
		
		while(num !=0) //reverse the number
		{
			rem = num%10;
			
			rev = rev *10 + rem;
			
			num = num /10;
		}
		
		if(n == rev )
		{
			return true;
		}
		else return false;
	}
	
	public static void main(String [] args)
	{
		int num;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the  number  : ");
		
		num = sc.nextInt();
		
		
		
		boolean check = palindrome(num);
		
		if(check)
		{
			System.out.println(num + " is palindrome number");
		}
		else System.out.println(num + " is not palindrome number");
		
		sc.close();
	}
}
