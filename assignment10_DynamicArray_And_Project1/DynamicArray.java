package assignment10_DynamicArray_And_Project1;

import java.util.Scanner;

public class DynamicArray {

	private int size,s;
	
	
	private int arr[] ;
	
	
  public DynamicArray()
	{
		 
		arr = new int[5];
	   size =5;
		s=0;
		
	}
	
 /* ########################################### add ##################################################################*/ 
	
	void add(int num)
	{
		if(s < size )
		{
			for(int i=0;i <arr.length;i++)
			{
				if(arr[i]== 0)
				{
					arr[i] = num ;
					s++;
					System.out.println("Value added successfull !!");
					break;
				}
			}
			
		}
		else {
		
			arrayRestructur();
			arr[s] = num;
			System.out.println("Value added successfull !!");
			s ++;
		}
		
	}
/*	#################################### Restructure ###################################################################*/
	
	void arrayRestructur()  //Restructure the array
	{
		// re-structuring of array
		
		int [] news = new int[size] ;
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			news[i] = arr[i];
		}
		
		size = (int)(size * 1.5) ;
		
		arr = new int[size] ;
		
		int i=0;
		for(i=0; i < s ;i++)
		{
			arr[i]  = news[i];
		}
	}
	
/*	###################################  Display ##########################################################################*/
	
	void display()
	{
		
			if(s > 0)
			{
				for(int i=0; i < s;i++)
				{
				
					System.out.print(arr[i] + " ");
				
			   }
		}
		else System.out.println("List is empty !!");
		System.out.println();
	}
	
/*	################################### Get value ##########################################################################*/
	
	void getValue(int idx) {
		
		try {
			
			if(s!=0)
			{
				System.out.println("At index  " + idx + " value is  " + arr[idx]);
			}
			else System.out.println("List is empty!!");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("invalid imdex!!");
			
		}
	
	}

/*	############################# Set value ################################################################################*/
	
	
	void setValueAt(int idx , int value)
	{
		
		try {
			arr[idx] = value;
			System.out.println("Value is set !!");
			
		}catch(Exception e)
		{
			System.out.println("Invalid index entered !!");
		}
		
	}
	/*	############################## Insert Element ###############################################################################*/	
	
	void insertAtIndex(int idx , int num)
	{
		try {

			if(s+1 < size) //check that is it space available in array to insert a number
			{
				for(int i = s-1 ; i >= idx ; i--)
				{
					arr[i+1] = arr[i];
				}
				
				arr[idx] = num;
				
				System.out.println("Value inserted !!");
			}else {
				
				arrayRestructur();  // restructuring if array length exceed 
				
				for(int i = s-1 ; i >= idx ; i--)
				{
					arr[i+1] = arr[i];
				}
				
				arr[idx] = num;
				System.out.println("Value inserted !!");
			}
			
		}catch(Exception e)
		{
			System.out.println("Invalid index entered !!");
		}
		
	}
	
/*	################################ Remove #############################################################################*/	
	  
	
	void remove()
	{
		try {
			
			arr[s-1] = 0;
			
			s--;
			
			System.out.println("Last value is removed !!");
			
		}catch(Exception e)
		{
			System.out.println("List is empty !!");
			
		}
	}
	
	
	
/*	################################### Remove at index ##########################################################################*/
	
	void removeAtIndex(int idx)
	{
		
        try {
			
        	for(int i = idx ; i < s ;i++)
    		{
    			arr[i] = arr[i+1];
    		}
    		s--;
    		
    		System.out.println("Value removed!!");
			
		}catch(Exception e)
		{
			System.out.println("Invalid index!!");
			
		}
		
	}
	
/*	#############################################################################################################*/

	
	
	// main----------------------------------------------------------------------------
	
	
	public static void main(String [] args)
	{
		int choice;
		
		// choice list
		System.out.println("ENter 1  To add element ");
		System.out.println("ENter 2  Display all value in array");
		System.out.println("ENter 3  Get value at any index");
		System.out.println("ENter 4  Set value at that index");
		System.out.println("ENter 5  To Insert value at that index");
		System.out.println("ENter 6  To Remove last ");
		System.out.println("ENter 7  To remove  value at that index");
		System.out.println("ENter -1 To exit");
		
		Scanner sc = new Scanner(System.in);

		/*		
  
  		int size;                           //if you want inialise own array size
		
		System.out.println("ENter size of array to initialise");
		size = sc.nextInt();
		DynamicArray a = new DynamicArray(size);  ///make constructor ---  DynamicArray(int size) -- above
		*/
		
		
	
		DynamicArray a = new DynamicArray();
		
		
		
		System.out.println("ENter the choice  : ");
			choice = sc.nextInt();
		while(choice != -1)
		{
			switch(choice)
			{
			    case 1 : // add the value
			    		{
							System.out.println("ENter the value to ADD in array : ");
							
							int val ;
							val = sc.nextInt();
							
							a.add(val);
							break;
						}
			    		
			    		
			    case 2 : // display the value
	    		{
					
					
					a.display();
					break;
				}
	    		
			    case 3 : // get value at that index
	    		{
					
	    			System.out.println("ENter the index and GET corresponding value ");
					int idx;
					
					idx = sc.nextInt();
					
					a.getValue(idx);
					break;
				}
	    		
			    case 4 : // set value at that index
	    		{
					
	    			System.out.println("ENter the index where has to SET value");
					int idx;
					
					idx = sc.nextInt();
					

					System.out.println("ENter the value");
					int val ;
					val = sc.nextInt();
					
					a.setValueAt(idx,val);
					
					break;
				}
	    		
			    case 5 : // insert value at that index
	    		{
					
	    			System.out.println("ENter the index where has to INSERT value");
					int idx;
					idx = sc.nextInt();
					
					System.out.println("ENter the value");
					int val ;
					val = sc.nextInt();
					
					a.insertAtIndex(idx, val);
					
					break;
				}
	    		
			    case 6 : // Remove value from last index
	    		{
					a.remove();
					
					break;
				}
	    		
			    case 7 : // Remove value from that index
	    		{
					
	    			System.out.println("ENter the index that value removed");
					int idx;
					idx = sc.nextInt();
					
					
					a.removeAtIndex(idx);
					
					break;
				}
			}
			
			
			System.out.println("ENter the choice  : ");
			choice = sc.nextInt();
			
		}
		
		
		sc.close();
	}
}
