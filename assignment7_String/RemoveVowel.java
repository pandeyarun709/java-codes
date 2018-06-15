package assignment7_String;

import java.util.Scanner;

public class RemoveVowel {

	public static String removeVowel(String str)
	{
		String s = new String();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && 
					str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'u' )
			{
				s = s + str.charAt(i);
			}
		
			
		
			
			
		}	
		
		// Note :-
//		 s = str.replaceAll("[aeiouAEIOU]", "");    ///we can also use replace method----  [aeiouAEIOU] - array of character
			
		
		
		
		return s;
	}
	
	public static void main(String [] args)
	{
		
		Scanner sc =  new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter the String : ");
		
		str = sc.nextLine();
		
		String s = removeVowel(str);
		
		System.out.println("After removing the vowel : "+s);
		
		sc.close();
		
		
		
	}

}
