package assignment1;
import java.util.Scanner;
public class Question1_AddNumber {
	
	public static int add(int x,int y)
	{
		return (x+y);
	}

	
	
	
	
	public static void main(String [] args)
	{
		
		Scanner obj = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter the first number : ");
		
		a = obj.nextInt();
		
       System.out.println("Enter the Second number : ");
		
		b = obj.nextInt();
		
		
		int sum = add(a,b);
		
		System.out.println("Sum is "+sum);
		
		obj.close();
	}

}
