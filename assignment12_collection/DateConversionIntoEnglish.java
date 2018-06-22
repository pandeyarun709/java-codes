package assignment12_collection;

import java.util.HashMap;
import java.util.Scanner;

public class DateConversionIntoEnglish {
	

	

	public static String dateConversion(String dt){
		
		HashMap<String, String> date = new HashMap<String, String>();
		HashMap<String, String> month = new HashMap<String, String>();
		HashMap<String, String> year1 = new HashMap<String, String>();
		HashMap<String, String> year2 = new HashMap<String, String>();
		
		
		
		
		
		
		date.put("01", "First");
		date.put("02", "Second");
		date.put("03", "Third");
		date.put("04", "Fourth");
		date.put("05", "Fifth");
		date.put("06", "Sixth");
		date.put("07", "Seventh");
		date.put("08", "Eighth");
		date.put("09", "Nineth");
		date.put("10", "Tenth");
		date.put("11", "Eleventh");
		date.put("12", "Tweleveth");
		date.put("13", "Thirteenth");
		date.put("14", "Fourteenth");
		date.put("15", "Fifteenth");
		date.put("16", "Sixteenth");
		date.put("17", "Seventeenth");
		date.put("18", "Eighteenth");
		date.put("19", "Nineteenth");
		date.put("20", "Twenty");
		date.put("21", "Twenty First");
		date.put("22", "Twenty Second");
		date.put("23", "Twenty Third");
		date.put("24", "Twenty Fourth");
		date.put("25", "Twent Fifth");
		date.put("26", "Twenty Sixth");
		date.put("27", "Twenty Seventh");
		date.put("28", "Twenty Eighth");
		date.put("29", "Twenty Nineth");
		date.put("30", "Thirty");
		date.put("31", "Thirty First");

		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");

		year1.put("07", "Seven");
		year1.put("08", "Eight");
		year1.put("09", "Nine");
		year1.put("10", "Ten");
		year1.put("11", "Eleven");
		year1.put("12", "Tweleve");
		year1.put("13", "Thirteen");
		year1.put("14", "Fourteen");
		year1.put("15", "Fifteen");
		year1.put("16", "Sixteen");
		year1.put("17", "Seventeen");
		year1.put("18", "Eighteen");
		year1.put("19", "Nineteen");
		year1.put("20", "Twenty");
		year1.put("21", "Twenty One");
		year1.put("22", "Twenty Two");

		year2.put("00", "Hundred");
		year2.put("10", "Ten");
		year2.put("20", "Twenty");
		year2.put("30", "Thirty");
		year2.put("40", "Forty");
		year2.put("50", "Fifty");
		year2.put("60", "Sixty");
		year2.put("70", "Seventy");
		year2.put("80", "Eighty");
		year2.put("90", "Ninety");
		year2.put("01", "One");
		year2.put("02", "Two");
		year2.put("03", "Three");
		year2.put("04", "Fourth");
		year2.put("05", "Five");
		year2.put("06", "Six");
		year2.put("07", "Seven");
		year2.put("08", "Eight");
		year2.put("09", "Nine");
		year2.put("10", "Ten");
		year2.put("11", "Eleven");
		year2.put("12", "Tweleve");
		year2.put("13", "Thirteen");
		year2.put("14", "Fourteen");
		year2.put("15", "Fifteen");
		year2.put("16", "Sixteen");
		year2.put("17", "Seventeen");
		year2.put("18", "Eighteen");
		year2.put("19", "Nineteen");
		year2.put("20", "Twenty");
		year2.put("21", "Twenty One");
		year2.put("22", "Twenty Two");

		//--------------------------------------conversion-------------------
		
		String resultDate = new String(); //22-01-1970
		
		resultDate += date.get(dt.substring(0,2));
		   
		resultDate += " ";
			
		resultDate += month.get(dt.substring(3,5));
		
		resultDate += " ";
		
		resultDate += year1.get(dt.substring(6,8));
		
		resultDate += " ";
		
		resultDate += year2.get(dt.substring(8,10));
		
		return resultDate;
	}

	

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		String date,english;
		
		
		
		System.out.println("Enter date in this format : 01-02-2017 or 01/02/2000");
		System.out.println("X Wrong format X : 1-2-2017");
		
		System.out.println("Enter the Date : ");
		date = sc.nextLine();
		
		if(date.length()== 10)
		{
			english = dateConversion(date);
			System.out.println("Date : "+date);
			System.out.println("Date in english : "+english);
		}
		else  System.out.println("Invalid Date format enter");
		

		sc.close();

	}
}


