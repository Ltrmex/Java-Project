Improvements: 
	- The program lets the user to choose whenever they would like to input an URL or a File through menu interface with option 1 or 2.

	- I created two menus, one basic one and one for statistics. Basic option menu will exit when user inputs 5, as option number 4 lets the user to see the menu 
	  again. The statistics menu lets the user to choose from 10 different option, these options include the methods related to the search, 10 will exit the 
	  second loop.

	- With the search option number 2, user will only be able to input the word he/she would like to proccess, then all the array methods are being called in 
	  statiistics menu for better menu interface.

	- I allowed for an extra class called InputValidation which will make sure that the user inputs an integer for an option menus, if the user will enter
	  anything different than integer it will keep user inside the loop, user will only exit the loop once he/she inputs an integer.

	- I also allowed for a class called OptionMenu, where two menus being used are present. I done it in such as way because I reuse the menus three times, so
	  it keeps the code neat and prevents me from writing the same piece of code over and over.

	- Allowed for error messages which will be more known to the user if certain errors occur, and notice messages also whenever the file/URL was processed or 
	  when index was deleted, etc.