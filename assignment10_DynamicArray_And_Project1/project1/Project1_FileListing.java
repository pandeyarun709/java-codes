package assignment10_DynamicArray_And_Project1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1_FileListing {
	

/*	####################################### WRITTING THE PATH AND SAVING IN abc.txt#########################################################################*/
	
	public static void writePath(File file) throws IOException
	{
		//FileOutputStream fout = new FileOutputStream(file);

		FileWriter f =  new FileWriter(file);
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		String str = new String();
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the path file get List of File in that Directory  : ");
		 
		str = sc.nextLine();  //writting path
		 
		f.write(str);
		
		f.append(System.lineSeparator());
		
		System.out.println("Path written success fully");
		
		sc.close();
		f.close();
		
	}
	
	
/*	####################################### GET FILE LIST #########################################################################*/
	
	public static ArrayList<File> fileListing(File file) throws IOException
	{
		
		FileReader f = new FileReader(file);
		
		int in = f.read();
		
		String path = new String();
		
		while(in != 13 )
		{
			path = path + (char)in;
			
			in = f.read();
			
		}
		
		 
		ArrayList<File> list = new ArrayList<File>();
		
		 getFileList(path , list);  //CALL THE RECCURSION FUNCTION
		//System.out.println(path);
		
		
		f.close();
		
		return list;
		
		
	}
	
	

/*	######################################  RECCURSIVE PART TO GET LIST ##########################################################################*/
	
	public static  void getFileList(String path , ArrayList<File> list)
	{
		
		File file = new File(path);
		
		File f [] = file.listFiles();
		
		for(File fx : f)
		{
			if(fx.isFile())
			{
				list.add(fx);
			}
			else if(fx.isDirectory())
			{
				getFileList(fx.getAbsolutePath() , list);
			}
		}
		
		
		
		
	}
	

/*	####################################### SAVING LIST IN PATH IN .csv FILE #########################################################################*/

	
	public static void saveFileListPath(File finalFile, ArrayList<File> fileList) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file = new File("F:/arun/fileLists.csv");
		//File file = new File(path);
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileWriter w = new FileWriter(file);
		
		for(File f : fileList)
		{
			w.write(f.getName() + " , " + f.getAbsolutePath() + "\n");
			//w.append(System.lineSeparator());
		}
		
		
		FileWriter fw = new FileWriter(finalFile,true);
		
		fw.append(file.getPath());
		
		System.out.println("LIst file save in .csv file !! thank you !!");
		
		fw.close();
		w.close();
	}
	
	public static void main(String [] args) throws IOException
	{
		
		File file = new File("F:/arun/abc.txt");
		
		writePath(file);
		
		
		ArrayList<File> fileList = new ArrayList<File>();
		
		fileList = fileListing(file);
		
		saveFileListPath(file , fileList);
		
		
		
	}


	

}
