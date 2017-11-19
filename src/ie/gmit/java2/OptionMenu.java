package ie.gmit.java2;

//Wrote menu here as used few time in while loops
public class OptionMenu {
	
	//Display basic options menu
	public void basicMenu() {
		//Options from 1 to 5 available, where 4 allows the user the display menu again
		System.out.println("\n\t===================== Basic Menu =====================");
		System.out.println("\tChoose from one of the following options: ");
		System.out.println("\t\t1 - Parse a File or URL");
		System.out.println("\t\t2 - Search");
		System.out.println("\t\t3 - Print Statistics");
		System.out.println("\t\t4 - Display Menu Again");
		System.out.println("\t\t5 - Exit");
	}//basicMenu()
	
	//Display statistics options
	public void statsMenu() {
			//Options from 1 to 10, where 9 allows for display of the options again
			System.out.println("\n\t===================== Statistics Menu =====================");
			System.out.println("\tChoose from one of the following options: ");
			System.out.println("\t\t1 - Does the searched word exist within the array");
			System.out.println("\t\t2 - Number of elements in the array");
			System.out.println("\t\t3 - Number of occurrences of searched word within the array");
			System.out.println("\t\t4 - First occurence");
			System.out.println("\t\t5 - Last Occurence");
			System.out.println("\t\t6 - Display all occurences");
			System.out.println("\t\t7 - Delete all occurences from the array");
			System.out.println("\t\t8 - Delete selected occurence from the array");
			System.out.println("\t\t9 - Display menu again");
			System.out.println("\t\t10 - Exit");
			
		}//statsMenu()
}//OptionMenu
