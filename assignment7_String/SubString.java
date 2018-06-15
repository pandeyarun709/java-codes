package assignment7_String;

public class SubString {
	
	
	public static void genrateSubString(String str)
	{
		
		System.out.println("Substring of "+ str + " are : ");
		for(int j=0 ; j < str.length() ; j++)
		{
			for(int i=j+1;i <= str.length(); i++)
			{
				System.out.println(str.substring(j, i));
				
			}
		}
		
	}
	
	
	
	
	
	public static void main(String [] args)
	{
		String str = "?xyz?";
		
		
		genrateSubString(str);
	}

}
