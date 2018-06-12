package assignment1;
import java.util.Scanner;

public class Question3_Pattern {
	

	public static void drawPattern(int num) //function draw the pattern
	{
			int c=0, r=0;
		
		for(c=0;c<num;c++)
		{
			for(r=0;r<=c;r++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter number of rows you want : ");
		
		num = sc.nextInt();
		
		drawPattern(num);
		
		sc.close();
	}

}
