package assignment5_Inheritence;

import java.util.Scanner;

public class LongestIncreasinSubArray {
	
	public static int subArray(int [] arr)
	{
		int len =1,lrg=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				len++;
			}
			else {
				
				if(len >= lrg)
				{
					lrg = len;
					
				}
				len = 1;
			}
		}
		
		
		
		return lrg;
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.println("Enter the size of array : ");
		
		size = sc.nextInt();
		
		int [] arr =  new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number : ");
			
			arr[i] = sc.nextInt();
		}
		
		int length = subArray(arr);
		
		System.out.println("Longest increasing length of sub array is " + length);
		sc.close();
		
	}

}
