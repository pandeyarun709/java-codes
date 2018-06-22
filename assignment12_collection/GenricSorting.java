package assignment12_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class GenricSorting {
	
		 

		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			
			  int size;
			  String str;
			  
			  System.out.println("Enter Element you want to enter : ");
			  size = sc.nextInt();
			
		     ArrayList<String> s =new ArrayList<String>();
		     
		     sc.nextLine();
		     for (int i = 0; i < size; i++) {
		    	
		    	 System.out.println("Enter String  : ");
				
		    	 str = sc.nextLine();
					s.add(str);
				}
		     Collections.sort(s);
		     
		     System.out.println("Sorted String array : "+s);
		     
		     

		     ArrayList<Integer> in =new ArrayList<Integer>();
		     
		     int num;
		     for(int i =0 ; i< 5 ; i++)
		     {
		    	 System.out.println("Enter number  : ");
					
		    	 num= sc.nextInt();
					in.add(num);
		     }
		    	 
		    
		     Collections.sort(in);
		     System.out.println("Sorted integers : "+in);
		     
		     sc.close();
			}
}

