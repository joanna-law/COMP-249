//----------------------------------------------
//Assignment #1
//Question 1 Part 1
//Written by: Joanna Lau Ah Wing 
//Date: 25 January 2019
//----------------------------------------------

/**
 * This class is to create and manipulate objects of the type book
 * @author Joanna Lau Ah Wing
 *
 */
public class Book{
	private String title;
	private String author;
	private long ISBN;
	private double price;
	private static int count = 0;

	public static int count()
	{
		return count;
	}
	/**
	 * constructs and initialized a book with the four mentionned parametres
	 * @param title self explanatory
	 * @param author self explanatory
	 * @param ISBN self explanatory
	 * @param price self explanatory
	 */ 
	public Book(String title, String author, long ISBN, double price)
	{
		this.title =title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		count++;
	}
	
	public static void setCount(int count) {
		Book.count = count;
	}
	/**
	 * copy constructor
	 * @param b the book object to be copied
	 */
	public Book (Book b)
	{
		this.title = b.title;
		this.author = b.author;
		this.ISBN = b.ISBN;
		this.price = b.price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * returns the string of all the information in a specific book
	 */
	public String toString()
	{
		return "Author: " + author + 
				" || Title: " + title + 
				" || ISBN: " + ISBN + 
				" || Price: " + price;
	}
	/**
	 * 
	 * @param b the book that is used for comparaison
	 * @return whether the two books are the same or not 
	 */
	public boolean equals(Book b)
	{
		if ((b.ISBN== this.ISBN) && (b.price== this.price))
			return true;
		else
			return false;
	}

	
}

