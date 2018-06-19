package assignment9_File2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
	
	
	public static void main(String [] args) throws IOException
	{
		FileInputStream f1 = new FileInputStream("F:\\arun\\Acadview java\\javaFile_createdOne\\abc.txt");
		
		FileOutputStream f2 = new FileOutputStream("F:\\arun\\Acadview java\\javaFile_createdOne\\xyz.txt");
		
		FileInputStream f3 = new FileInputStream("F:\\arun\\Acadview java\\javaFile_createdOne\\xyz.txt");
		
		BufferedInputStream bin = new BufferedInputStream(f1);  //create to read from abc.txt
			
		BufferedOutputStream bout = new BufferedOutputStream(f2); //create to write in xyz.txt
		 
		 BufferedInputStream bin2 = new BufferedInputStream(f3);
		 
		try {
			
			//write in file xyz.txt from abc.txt
			 
			 int current = bin.read(); // read from file abc.txt
			 
			 while(current != -1)
			 {
				 bout.write((char)current);  //write in file xyz.txt
				 
				 current = bin.read();
			 }
			 
			 bout.flush();
			
			 //-----------------------------------------------------------------------
			 
			 
				
			/* boolean b = bin2.markSupported();    // check marker
				
				System.out.println(bin2.available());  //print the available length to read
				
				if(b)
				{
					bin2.mark(bin2.available()); // apply marker
				}*/
			//-------------------------------------------------------------------------------------
			 
			//reading from xyz.txt.....
			 
		    current = bin2.read(); // read from file xyz.txt
			 
			 while(current != -1)
			 {
				System.out.print((char)current);  
				 
				 current= bin2.read();
			 }

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Error !!");
			e.printStackTrace();
		}finally {
			
		
		
			bout.close();
			bin.close();
			
			bin2.close();
		}
		
		
	}

}
