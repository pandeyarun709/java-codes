package Assignment4;
import java.util.Scanner;

public class Question7_BinarySearching {
	
	public static void binarySearch(int [] arr, int search)
	{
		int first = 0;
		int last =  arr.length -1;
		int mid = (first+ last)/2;
		while(first<= last)
		{
			if(arr[mid] < search)
			{
				first = mid + 1;

			}
			else if(arr[mid] == search)
			{
				
				
				System.out.println(search + " found in list at index " +mid);
				break;
			}
			else
			{
				 last = mid - 1;
			}
			mid = (first + last)/2;
		}
		if(first > last)
		{
			
			System.out.println(search + " not found in list");
		}
		}
	
	
	public static void main(String [] args)
	{
        int [] arr = {1,4,6,7,8,9,10};
		
		System.out.println("Enter Number To Search ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		binarySearch(arr,n);
	}

}
