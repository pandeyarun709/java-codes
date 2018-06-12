package assignment3;
import java.util.Scanner;

public class Question1_Patterns {

	public static void pattern(int num)
	{
		int r=0,c=0;
		
		for(r=0;r<num;r++)
		{
			for(c=0;c<num-r;c++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}

	
		public static void main(String [] args)
		{
			int num;
			
			Scanner sc =  new Scanner(System.in);
			
			System.out.println("Enter the number : ");
			 
			num = sc.nextInt();
			
			pattern(num);
			sc.close();
			
			
		}
}
