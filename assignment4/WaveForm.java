package assignment4;

import java.util.Scanner;

public class WaveForm {
	
	public static void sortArray(int [] arr)
	{
		int i=0,j=0,min_idx;
		int temp;
		
		for(i=0;i<arr.length;i++)
		{
			min_idx = i;
			for(j=i+1; j< arr.length;j++)
			{
				if(arr[min_idx]>arr[j])
					min_idx = j;
			}
			
			temp = arr[min_idx];
			
			arr[min_idx] = arr[i];
			
			arr[i] = temp;
		}
	}
	
	public static void waveForm(int [] arr)
	{
		
		sortArray(arr); // first sorting the array
		
		int i=0,temp;
		
		
		for(i=0;i< arr.length ; i+=2)
		{
			temp = arr[i];
			arr[i] = arr[i+1];
			
			arr[i+1] =temp ;
		}
	}
	
	public static void main(String [] args)
	{
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		
		size = sc.nextInt();
		
		
		
		int [] arr = new int[size];
		
		for(int i=0; i < arr.length; i++)
		{
			System.out.println("enter the number : ");
			arr[i] =  sc.nextInt();
		}
		sc.close();
		
		waveForm(arr); // converting array into waveform
		
		System.out.println("Wave form : ");
		
		for(int element : arr)
		{
			
			System.out.print(element + " ");
			
		}
		
	}
}
