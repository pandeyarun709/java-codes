package assignment7_String;

import java.util.Scanner;

public class CheckStringOccurence {

	public static int  checkStringOccurence(String str , String check)
	{
		int count =0 ,j = 0;
		
		for(int i=0; i < str.length(); i++)
		{
			if(str.charAt(i) == check.charAt(j))
			{
				j++;
				
				if(j == check.length())
				{
					count++;
					j =0 ;
				}
			}
			else j = 0;
			
		}
		
		
		return count;
	}
	
	
	
	
	
	public static void main(String[] args) {

	Scanner sc =  new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter the Main String : ");
		
		str = sc.nextLine();
		
		String check ;
		
        System.out.println("Enter the Check String : ");
		
		check = sc.nextLine();
		
		int occur = checkStringOccurence(str ,check);
		
		System.out.println("Occurence of "+check+" in main string = "+occur);
		
		sc.close();
		


	}

}
