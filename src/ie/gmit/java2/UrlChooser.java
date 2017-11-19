package ie.gmit.java2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrlChooser {
	//Define variables
	private BufferedReader read = null;
	private List<String> fileContents = new ArrayList<String>();
	private URL url = null;
	
	//Default constructor
	public UrlChooser(){		
	}
	
	//Set URL path
	public void setUrl(URL url){
		this.url = url;
	}
	
	//Get URL path
	public URL getUrl(){
		return(url);
	}
	
	//Process the URL
	public List<String> parseUrl(URL url){
		try {
			read = new BufferedReader(new InputStreamReader(url.openStream()));
			if(url != null)
				System.out.println("\t\tURL has been proccessed!");
			
			String s = null;
			
			while((s = read.readLine()) != null){
				
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

}//UrlChooser
