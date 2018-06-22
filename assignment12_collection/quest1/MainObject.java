package assignment12_collection.quest1;

import java.util.ArrayList;
import java.util.Collections;


public class MainObject {

	public static void main(String [] args)
	{
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		//list.add(new Student("Arshnoor",1182));
		list.add(new Student("Arun",1186));
		list.add(new Student("Assem",1192));
		list.add(new Student("Aryan",1191));
		list.add(new Student("Arshnoor",1182));
		
		  System.out.println("Sorted by Name and Age ");
		  Age_AndNameComparator compare = new Age_AndNameComparator();
	        Collections.sort(list, compare);
	        
	        for (Student s: list)
	            System.out.println(s.getName() + " " +s.rollNumber());
	                               
		
	}
}
