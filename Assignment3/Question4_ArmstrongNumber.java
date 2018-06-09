package Assignment4;
import java.util.Scanner;

public class Question4_ArmstrongNumber {
	
	public static int countDigit(int num)
	{
		int c=0;
		
		while(num!=0)
		{
			c++;
			num =num/10;
		}
		return c;
	}

	
	public static boolean armstrongNumber(int num)
	{
		int n=num;
		 int rem =0,sum=0;
		 int digit = countDigit(num);
		while(num!=0)
		{
			rem = num%10;
			sum = sum +   (int) Math.pow(rem, digit);
			
			num = num/10;
		}
		
		if(sum == n)
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
		
		
		boolean check = armstrongNumber(num);
		
		if(check)
		{
			System.out.println(num + " is Armstrong number");
		}
		else  System.out.println(num + " is not Armstrong number");
		
		sc.close();
	}
}
