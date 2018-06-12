package assignment4;

import java.util.Scanner;

public class SecondLargestNum {

	public static int findSecondLargest(int [] arr)
	{
		int i=0;
		
		int lrg =-1,slrg=-1;
		
		for(i=0;i<arr.length;i++) {
			
			if(lrg<arr[i])
				
				lrg = arr[i];
		}
		
          for(i=0;i<arr.length;i++) {
			
			if(lrg != arr[i])
			{
				if(slrg<arr[i])
				{
					slrg = arr[i];
				}
					
			}
		}
		
		
		return slrg;
	}
	
	public static void main(String [] args)
	{
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		
		size = sc.nextInt();
		
		
		int secondLrg;
		
		int [] arr = new int[size];
		
		for(int i=0; i < arr.length; i++)
		{
			System.out.println("enter the number : ");
			arr[i] =  sc.nextInt();
		}
		sc.close();
		
		secondLrg = findSecondLargest(arr);
		
		System.out.println("Second large number is " + secondLrg);
		
	}
}
