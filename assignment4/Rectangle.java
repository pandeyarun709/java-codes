package assignment4;

import java.util.Scanner;

public class Rectangle {
	
	
	float length;
	float width;
	float area;
	
	
	Rectangle()
	{
		length = 0.0f;
		width = 0.0f;
		area = 0.0f;
	}
	
	public void SetDimensions(float len , float wid )
	{
		/*Scanner sc = new Scanner(System.in);*/
		length = len;
		width = wid ;
		
	}
	
	public void calculateArea()
	{
		area = length * width ;
		
		System.out.print("Area of rectangle is "+ area);
	}


	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		float len,wid;
		
		System.out.println("Enter the length of rectangle : ");
		
		len = sc.nextInt();
		
		System.out.println("Enter the width of rectangle : ");
		
		wid = sc.nextInt();
		
		sc.close();
		
		Rectangle rec ;
		rec = new  Rectangle();
		
		rec.SetDimensions(len, wid);
		
		rec.calculateArea();
		
		
	}

}
