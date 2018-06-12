package assignment4;

import java.util.Scanner;

public class Complex {
	
	int real;
	
	int img;
	
	Complex()
	{
		real =0;
		img = 0;
		
	}

	public void setComplex(int real , int img) {
		this.real = real;
		this.img = img;
	}
	
	
	public void displayComplex()
	{
		System.out.println("Complex number is " +real + "+" + img + "i");
	}

	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int real,img;
		
		System.out.println("Enter the real part of complex number : ");
		
		real = sc.nextInt();
		
		System.out.println("Enter the imaginary part of complex number : ");
		
		img = sc.nextInt();
		
		sc.close();
		
		Complex c ;
		c = new  Complex();
		
		
		c.setComplex(real, img);
		
		c.displayComplex();
		
		
		
	}
	

}
