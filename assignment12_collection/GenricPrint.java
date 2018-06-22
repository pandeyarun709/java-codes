package assignment12_collection;

public class GenricPrint<T> {
	
	
	void print(T arr [])
	{
		for(T s : arr)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String [] args)
	{
		GenricPrint<Integer> in = new GenricPrint<Integer>();
		System.out.println("INteger values : ");
		Integer arr[] = {1,2,3,5,1,7};
		
		in.print(arr);
		
		System.out.println("String values : ");
		GenricPrint<String> str = new GenricPrint<String>();
         String s[] = {"Arun","Acad","Aryan","Chitkara"};
		
		str.print(s);
	}

}
