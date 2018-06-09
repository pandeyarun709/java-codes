package Assignment4;



public class Question6_Sorting {

	
	public static void selectionSort(int [] arr)
	{
		
	int temp,i,j,min_idx;
	
	for(i=0;i<arr.length-1;i++)
	{
		min_idx=i;
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[min_idx])
				min_idx=j;
		}
		
		temp=arr[i];
		arr[i]=arr[min_idx];
		arr[min_idx]=temp;
		
	}
	
}

public static void main(String[] args) {
	
	int [] arr = {1,1,1,1,0,0,1,0};
	
	selectionSort(arr);

	System.out.println("Sorted array : ");
	for(int element: arr)
	{
		System.out.println(element);
	
	}
}
	
	
		
	
}
