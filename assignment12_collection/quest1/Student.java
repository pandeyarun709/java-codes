package assignment12_collection.quest1;



 class Student {
	
	private int roll;
	private String name;
	
	
	 
	    // Constructor
	    public Student(String name, int roll)
	    {
	        this.name = name;
	        
	        this.roll = roll;
	    }
	 
	    // Getter methods for accessing private data
	 
	    public String getName()   {  return name; }
	    public int rollNumber()      {  return roll;  }

}
