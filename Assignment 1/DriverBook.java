//----------------------------------------------
//Assignment #1
//Question 1 Part 2
//Written by: Joanna Lau Ah Wing 
//Date: 25 January 2019
//----------------------------------------------
import java.util.Scanner;
/**
* The main driver class for this assignment.
* It only asks for the capacity of the library, creates the inventory array of that size, then calls the {@link #mainMenu} method.
*  @author Joanna Lau Ah Wing
* created on the 25 January 2019
*/

public class DriverBook {
	public static void main(String args[]) {
		int maxBooks = 0; //the max no of books the library can hold
		boolean goodPassword = false;
		final String password = "password";
		String inPassword; //the password input by the user
		int  updateBook, menuChoice, menuChange, menuNoBookIndex, bookIn, suspiAttempt= 0;
		double maxPrice; //used for option 4
		String title, author;
		String searchName; //used in option 3 to keep the name of the author
		long isbn;
		double price;
		Book inventory[]; //array of object books
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Joanna Lau's book tracking system!");
		System.out.println();
		System.out.print("Maximum number of books: ");
		maxBooks = keyboard.nextInt();
		inventory = new Book[maxBooks + 1];
		do { //repeats the loop with the menu until the user inputs 5
			System.out.println("");
			System.out.println("What do you want to do?");
			System.out.println("1. Enter new books (password required)");
			System.out.println("2. Change information of a book (password required)");
			System.out.println("3. Display all books by a specific author");
			System.out.println("4. Display all books under a certain price");
			System.out.println("5. Quit");
			System.out.println("");
			System.out.print("Please enter your choice: ");
			menuChoice = keyboard.nextInt();
			System.out.println("");
			switch (menuChoice)
			{ //using cases for each one of the option
			case 1: {
				int i;
				if (suspiAttempt < 4) { //blocks more inputs for password after 3*4 = 12 attempts
					System.out.print("Input your password: ");
					
					inPassword = keyboard.next();
					System.out.println("");
					if (inPassword.compareTo(password) ==0)
					{
						goodPassword = true;
						System.out.println("How many books do you want to enter?");
						bookIn = keyboard.nextInt();
						System.out.println("");
						if (bookIn < (maxBooks - Book.count()) + 1) //checking if the number of books the user wants to enter will fit in the array
						{
							for (i=0; i < bookIn; i++) {
								
								System.out.print("Input book " + (i+ 1));
								if (i== 0)
									System.out.println("");
								keyboard.nextLine();
								
								System.out.print("title: ");							
								title = keyboard.nextLine();
								
								System.out.print("price: ");
								price = keyboard.nextDouble();
								
								System.out.print("ISBN: ");
								isbn = keyboard.nextLong();
								keyboard.nextLine();
								
								System.out.print("author: ");
								author = keyboard.nextLine();

								System.out.println("");
								
								inventory[(Book.count()) +1] = new Book(title, author, isbn, price);
							}
						}
						else
						{
							System.out.println("There are only " + (maxBooks - Book.count()) + " spaces left.");
						}

					}
					for(i = 0; i< 2; i++) //loop for the case where the the user inputs the wrong password at his first go
					{
						if (goodPassword == false)
						{
							System.out.print("Wrong. Input your password: ");
							if (keyboard.next().compareTo(password) ==0)
							{
								goodPassword = true;
								System.out.println("How many books do you want to enter?"); //the same as above
								bookIn = keyboard.nextInt();
								keyboard.nextLine();

								if (bookIn < (maxBooks - Book.count()) + 1)
								{
									for (i=0; i < bookIn; i++) {
										System.out.println("Input book " + (i+ 1));
										keyboard.nextLine();
										System.out.println("title: ");
										title = keyboard.nextLine();
										System.out.println("price: ");
										price = keyboard.nextDouble();
										System.out.println("isbn: ");
										isbn = keyboard.nextLong();
										keyboard.nextLine();
										System.out.println("author: ");
										author = keyboard.nextLine();
										System.out.println();

										inventory[(Book.count()) +1] = new Book(title, author, isbn, price);
									}
								}
								else
								{
									System.out.println("There are only " + (maxBooks - Book.count()) + " spaces left.");
								}
							}	
						}
					}
					if (i == 2 && goodPassword == false)
						suspiAttempt++;
					break;
				}
				else
					System.out.println("");
					System.out.println("Program detected suspicous activities and will terminate immediately!");
				menuChoice = 5;
				break;
			}
			case 2: 
			{
				System.out.print("Input your password: ");
				int i;
				for (i = 0; i < 3; i++)
				{
					inPassword = keyboard.next();
					if (inPassword.compareTo(password) ==0)
					{
						i= 3;
						System.out.print("What book number do you want to update: ");
						updateBook = keyboard.nextInt();
						if (Book.count() >= updateBook) //checking if the book exists
						{
							do //do while loop is used so that the menu to change an attribute comes back until the user decides to quit
							{
							System.out.println("");
							System.out.println("Title: " + inventory[updateBook].getTitle());
							System.out.println("Author: " + inventory[updateBook].getAuthor());
							System.out.println("ISBM: " + inventory[updateBook].getISBN());
							System.out.println("Price: $" + inventory[updateBook].getPrice());
							System.out.println("");
							
								System.out.println("What information would you like to change?");
								System.out.println("   1. Author");
								System.out.println("   2. title");
								System.out.println("   3. ISBN");
								System.out.println("   4. Price");
								System.out.println("   5. Quit");
								System.out.print("Enter your choice: ");
								menuChange = keyboard.nextInt();
								keyboard.nextLine();
								switch (menuChange)
								{
								case 1:
								{
									System.out.print("Input the book's new author: ");
									inventory[updateBook].setAuthor(keyboard.nextLine());
									break;
								}
								case 2:
								{
									System.out.print("Input the book's new title: ");
									inventory[updateBook].setTitle(keyboard.nextLine());
									break;
								}
								case 3:
								{
									System.out.print("Input the book's new ISBN: ");
									inventory[updateBook].setISBN(keyboard.nextLong());
									break;
								}
								case 4:
								{
									System.out.print("Input the book's new price: ");
									inventory[updateBook].setPrice(keyboard.nextDouble());
									break;
								}
								case 5: break; //no default so that the program accepts only 1- 5
								}
								System.out.println("");
							}
							while(menuChange != 5);
						}
						else
						{
							System.out.println("There is no book at specified index. If you want to go to the main menu, please press 0.");
							menuNoBookIndex = keyboard.nextInt();
							if (menuNoBookIndex == 0)
								break;
						}
					}
					else
					{
						if (i != 2)
							System.out.print("Input your password again: ");
					}
				}
			}
			break;
			case 3:
			{
				keyboard.nextLine();
				System.out.println("Name of author: ");
				searchName = keyboard.nextLine();
				for (int i = 1; i<= Book.count(); i++)
				{
					if (inventory[i].getAuthor().compareTo(searchName) == 0)
						System.out.println(inventory[i].toString());
				}
				break;
			}
			case 4:
			{
				System.out.print("Enter the maximum price: ");
				maxPrice = keyboard.nextDouble();
				for (int i = 1; i<= Book.count(); i++)
				{
					if (inventory[i].getPrice() < maxPrice)
						System.out.println(inventory[i].toString());
				}
				break;
			}
			case 5: break;
			default: break;
			}
			System.out.println("");
			System.out.println("****************************************");
		}
		
		while (menuChoice != 5);
		System.out.println("Thank you for using this book keeping system!");
		keyboard.close();
	}

}
