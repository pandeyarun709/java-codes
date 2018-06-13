package assignment3;

public class BinaryArraySortLeastComputation {

	public static void sortLeastComputation(int [] arr)
	{

        int j=0,temp=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
          }
        
        }
	}
       
	
	public static void main(String [] args)
	{
		int arr[] = {1,1,1,1,0,0,1,0};
		
		sortLeastComputation(arr);
		
		for(int element : arr)
			System.out.print(element + " ");
	}
}
