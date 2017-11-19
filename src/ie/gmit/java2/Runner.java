package ie.gmit.java2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

//JavaProject extends Options
public class Runner {
	//Main
	public static void main(String[] args) throws MalformedURLException {
		
		//Declare variables
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String searchWord = "the";
		int option = 5;
		List<String> contents = new ArrayList<String>();
		
		//Display Menu
		OptionMenu menu = new OptionMenu();
		menu.basicMenu();
		
		//Prompt user for input
		InputValidation choice = new InputValidation();
		choice.setQuestion("\nYour Option: ");
		option = choice.validateInput(choice.getQuestion());
		
		//Loop lets the user to choose the options, 5 terminates the loop
		while(option != 5) {
			//Options from 1 to 4, because 5 exits the loop, allowed for default if wrong integer is given
			switch(option) {
				case 1:
					//Parse File or URL
					choice.setQuestion("\tParse a File(1) or URL(2): ");
					option = choice.validateInput(choice.getQuestion());
				
					//Determine which one to use
					if (option == 1) {
						FileChooser fileName = new FileChooser();
						
						System.out.print("\t\tParse a File: ");
						fileName.setFile(new File(input.next()));
						contents = fileName.parseFile(fileName.getFile());
						
					} else if(option == 2) {
						UrlChooser urlPath = new UrlChooser();
						
						System.out.print("\t\tParse a URL: ");
						urlPath.setUrl(new URL(input.next()));
						contents = urlPath.parseUrl(urlPath.getUrl());
					} else
						System.err.println("\t\tOption doesn't exist!");
					break;
				case 2:
					//Get the user to input word or element they would like to search statistics for
					System.out.print("\tEnter word or element you would like to search: ");
					searchWord = input.next();
					
					//While input will be empty it will prompt the user to get the input again
					while(searchWord == null) {
						System.out.print("\tEnter word or element you would like to search(not empty one): ");
						searchWord = input.next();
					}//while
					
					//If not empty gives a message that its been processed
					System.out.println("\tWord/element has been processed!");
					break;
				case 3:
					//Print Statistics Data
					
					//Print statistics menu options
					menu.statsMenu();
					
					//Prompt user for statistics input
					choice.setQuestion("\n\tYour Statistics Option: ");
					option = choice.validateInput(choice.getQuestion());
					
					SearchStats word = new SearchStats();
					
					//Loop let the user choose the options until 10 is inputed
					while(option != 10) {
						//Options from 1 to 9 and allowed for default one if user inputs anything else than integer
						switch(option) {
							case 1:
								//Check if the word exist within the array
								System.out.println("\t\tDoes it exist within the array: " + word.contains(searchWord, contents));
								break;
							case 2:
								//Counts of all elements in the array
								System.out.println("\t\tNumber of words in the array: " + word.count(contents));
								break;
							case 3:
								//Amount of occurrences of the word
								System.out.println("\t\tAmount of occurences: " + word.countOccurences(searchWord, contents));
								break;
							case 4:
								//First Index of the word
								System.out.println("\t\tFirst Index: " + word.getFirstIndex(searchWord, contents));
								break;
							case 5:
								//Last Index of the word
								System.out.println("\t\tLast Index: " + word.getLastIndex(searchWord, contents));
								break;
							case 6:
								//All Indices of the word
								System.out.println("\t\tAll Indices: " + word.getAllIndices(searchWord, contents));
								break;
							case 7:
								//Delete all array list contents
								word.delete(contents);
								
								//When the array is empty, outputs the message
								System.out.println("\t\tAll array elements have been deleted");
								break;
							case 8:
								//User gets to choose which array list element to delete
								choice.setQuestion("\n\t\tPlease enter index you would like to delete: ");
								int index = choice.validateInput(choice.getQuestion());
								
								while((index > word.count(contents)) || (index < 0)) {
									
									System.out.println("\t\tIndex doesn't exits!");
									
									//User gets to choose which array list element to delete
									choice.setQuestion("\n\t\tPlease enter index you would like to delete again: ");
									index = choice.validateInput(choice.getQuestion());
								}//while
								
								//Deletes chosen index
								word.delete(index, contents);
								System.out.println("\t\tChoosen index has been removed from the array");
								
								break;
							case 9:
								//Print statistics menu options again
								menu.statsMenu();
								break;
							default:
								System.err.println("\t\tOption doesn't exist!");
						}//nested switch
					
						//Prompt user for statistics input
						choice.setQuestion("\n\tYour Statistics Option (9 to display option menu): ");
						option = choice.validateInput(choice.getQuestion());
						
					}//while
					break;
				case 4:
					//Display Basic Menu Again
					menu.basicMenu();
					break;
				default:
					System.err.println("\tOption doesn't exist!");
			}//switch
			
			//Prompt user for input
			choice.setQuestion("\nYour Option (4 to display option menu): ");
			option = choice.validateInput(choice.getQuestion());
			
		}//while
		
		//Lets the user know they have successfully exited the loops
		System.out.println("\tProgram Closed");
	}//main()
}//Runner
