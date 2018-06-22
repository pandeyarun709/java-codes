package assignment12_collection.quest1;

import java.util.Comparator;

public class Age_AndNameComparator implements Comparator <Student> {

	public int compare(Student s1, Student s2)
    {
			if ( (s1.rollNumber() > s2.rollNumber()) && (s1.getName().compareTo(s2.getName())) > 0 ) 
        	 {
        		return 1;
        	 }
        	else if ( (s1.rollNumber() < s2.rollNumber()) && (s1.getName().compareTo(s2.getName())) < 0 )
        	 {
        		return -1;
        	 }
        	else return 0;
    }
}
