package ie.gmit.java2;

import java.util.*;

//Used in option three where the user chooses which statistics he/she would like to view
public class SearchStats {
	//Return true of false value depending if searched word exists within the list array
	public boolean contains(String s, List<String> fileContents) {
		boolean contains = fileContents.contains(s);
		return(contains);	
	}//contains()
	
	//Counts all elements in the list array
	public int count(List<String> fileContents) {
		int size = fileContents.size();
		return(size);
	}//count()
	
	//Displays number of occurrences of the searched word within the list array
	public int countOccurences(String s, List<String> fileContents) {
		int count = 0;
		//Goes through the list array
		for(String word : fileContents) {
			//If word will equal to the searched word, increment count
			if(word.equalsIgnoreCase(s))
				count++;
		}//for
		return(count);
	}//countOccurences()
	
	//Gets the first index of searched word
	public int getFirstIndex(String s, List<String> fileContents) {
		int first = fileContents.indexOf(s);
		return(first);
	}//getFirstIndex()
	
	//Gets the last index of searched word
	public int getLastIndex(String s, List<String> fileContents) {
		int last = fileContents.lastIndexOf(s);
		return(last);
	}// getLastIndex()
	
	//Return all indices of searched word
	public List<Integer> getAllIndices(String s, List<String> fileContents) {
		List<Integer> allIndices = new ArrayList<Integer>();
		//Goes through the list array
		for (int i = 0; i < fileContents.size(); i++) {
			//If the word will equal searched word, it will add the index into the allIndices list array
	        if(s.equalsIgnoreCase(fileContents.get(i))) {
	        	allIndices.add(i);
	        }//if
		}//for
		
		return (allIndices);
	}//  getAllIndices()
	
	//Deletes all indices from the list array
	public void delete(List<String> fileContents) {
		fileContents.clear();
	}//  delete()
	
	//Deletes chosen index from the list array
	public void delete(int index, List<String> fileContents) {
		if (index >= 0)
			fileContents.remove(index);
	}//  delete()
		
}//SearchStats
