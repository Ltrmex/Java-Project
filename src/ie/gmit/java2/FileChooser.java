package ie.gmit.java2;

import java.io.*;
import java.util.*;

public class FileChooser {
	//Define variables
	private BufferedReader read = null;
	private File file = null;
	private List<String> fileContents = new ArrayList<String>();
	
	//Default Constructor
	public FileChooser(){		
	}
	
	//Set File name
	public void setFile(File file){
		this.file = file;
	}
	
	//Get File name
	public File getFile(){
		return(file);
	}
	
	//Process the file
	public List<String> parseFile(File file){
		try {
			read = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			if(file != null)
				System.out.println("\t\tFile has been proccessed!");
			
			String s = null;
			
			while((s = read.readLine()) != null) {
				
				String [] str = s.split("\\s+"); // split by comma
				
				//Add to a list that maintains all the words in the file
				fileContents.addAll(Arrays.asList(str)); //how to convert java array to list
				
			}//while
			
			read.close();
						
		}//try
		
		catch (IOException e) {
			System.err.print("Use proper input and handle this exception error!\n");
		} //catch
		
		//Returns fileContents as it will be used in the main runner
		return(fileContents);
	}

}//FileChooser
