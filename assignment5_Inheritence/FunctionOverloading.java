package assignment5_Inheritence;

public class FunctionOverloading {
	
	
	void printFunc()
	{
		System.out.println("1. printFunc call having NUll as argument  ");
	}
	
	void printFunc(int number)
	{
		System.out.println("2. printFunc call having INT as argument where number = " + number);
	}
	
	void printFunc(float number)
	{
		System.out.println("3. printFunc call having FLOAT as argument where number = " + number);
	}
	
	
	public static void main(String [] args)
	{
		FunctionOverloading f = new FunctionOverloading();
		
		f.printFunc();
		f.printFunc(2);
		f.printFunc(2.55f);
		
		
	}
			
	
}
