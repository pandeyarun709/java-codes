package assignment8_File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
/*import java.util.*;*/

public class FileHandling {
	
	
		public static void main(String[] args) throws IOException {
			
			
			File file=new File("C:\\Users\\Filehandling\\fileabc.txt");
			file.createNewFile();
			file.mkdirs();
			FileReader input = null;
			
		    try {
		    	
		    	input = new FileReader(file);
		    	int current=input.read();

		    	while(current != -1) {
				   System.out.print((char)current);
				   current = input.read();
			   }
		    	System.out.println();
		    } 
		    catch(InputMismatchException e) {
		    	 
		    	System.out.println("Input invalid");
		    
		    } finally {
		 	   if (input != null)
		 	   {
		 		  input.close();
		 		  System.out.println("File Closed Successfully");
		 	   }
		    }
		    }
		
	}
	


