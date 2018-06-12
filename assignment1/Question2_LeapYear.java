package assignment1;
import java.util.Scanner;

public class Question2_LeapYear {
	
	public static boolean checkLeapYear(int year)
	{
		if(year % 4 ==0 && year % 100 !=0)
		{
		
				return true;
		}
		else if(year % 4 ==0 && year % 100 ==0 && year % 400 ==0) //century year check whether divisible by 400 or not
		{
			return true;
		}
		else return false;
	}
	
	
	public static void main(String [] args)
	{
		boolean check;
		
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year : ");
		
		year = sc.nextInt();
		
		check = checkLeapYear(year);
		
		if(check)
		{
			System.out.println(year+" is leap year");
		}
		else  System.out.print(year+" is not leap year : ");
			
		sc.close();
	}

}
