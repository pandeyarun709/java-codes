package assignment5_Inheritence;

public class FunctionOverloading {
	
	
	void print()
	{
		System.out.println("1. printFunc call having NUll as argument  ");
	}
	
	void print(int number)
	{
		System.out.println("2. printFunc call having INT as argument where number = " + number);
	}
	
	void print(float number)
	{
		System.out.println("3. printFunc call having FLOAT as argument where number = " + number);
	}
	
	
	public static void main(String [] args)
	{
		FunctionOverloading obj = new FunctionOverloading();
		
		obj.print();
		obj.print(2);
		obj.print(2.55f);
		
		
	}
			
	
}
