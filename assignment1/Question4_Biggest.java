package assignment1;
import java.util.Scanner;

public class Question4_Biggest {
	
	public static int biggestNum(int x,int y,int z)
	{
		if(x>=y && x>=z)
		{
			return x;
		}
		else if(y>=x && y>=z)
		{
			return y;
		}
		
		else return z;
	}
	
	
	public static void main(String [] args)
	{
		int a,b,c;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the first number  : ");
		
		a = sc.nextInt();
		
		System.out.println("Enter the 2nd number  : ");
		
		b = sc.nextInt();
		
		System.out.println("Enter the 3rd number  : ");
		
		c = sc.nextInt();
		
		int big = biggestNum(a,b,c);
		
		System.out.println("Biggest number is " + big);
		
		sc.close();
	}


}
