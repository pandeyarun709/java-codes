package Assignment4;


import java.util.Scanner;



public class Question3_PrimeNumber {
	

	

		
		public static void Prime(int num)
		{
			int i=0,flag =0;
			
			System.out.println("Prime numbers : ");
			
			for(int j=0 ;j<=num;j++)
			{
				flag =0;
				if(j !=1 && j !=0)
				{
					
					for(i=2;i<=Math.sqrt(j);i++)
					{
						if(j % i ==0)
						{
							flag =1;
							break;
							
						}
					}
				}
				else flag=1;
				
				if(flag==0)
				{
					System.out.println(j);
				}
				
			}
				
			
		}
		
		public static void main(String [] args)
		{
			int num;
			Scanner sc =  new Scanner(System.in);
			
			System.out.println("Enter the  number  : ");
			
			num = sc.nextInt();
			
			
			
			 Prime(num);
			
			
			
			sc.close();
			
		}
	}



