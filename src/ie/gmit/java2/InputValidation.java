package ie.gmit.java2;

import java.util.Scanner;

public class InputValidation {
	//Declare variables
	private String question;
	
	//Default Constructor
	public InputValidation() {
		
	}
	
	//Constructor
	public InputValidation(String question) {
		setQuestion(question);
	}
	
	//Set question
	public void setQuestion(String question) {
		this.question = question;
	}
	
	//Get question
	public String getQuestion() {
		return(question);
	}
	
	//Force the user to input integer
	public int validateInput(String question) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int option;
		
		//Prompt user for input
		while (true) {
			//Sets the questions for different validation uses
			System.out.print(question);
			String input2 = input.next();
			
			try {
				//Converts the string input into an integer
				option = Integer.parseInt(input2);
				break;
			} catch (NumberFormatException e) {
				//If not an integer output the error message
				System.err.println("Input is not a number, try again!");
		    }//catch
		}//while
		
		//Return validated input
		return option;
	}// validateInput()
}//InputValidation
