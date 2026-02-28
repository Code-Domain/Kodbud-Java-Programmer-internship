package libraryfolder;

import java.util.*;

abstract class Main{
	private String bookName;
	private String bookEdition;
	private String bookAuthor;
	private String bookSerialNo;
	private double bookPrice;
	
	
	public Main(String bookName, String bookEdition, String bookAuthor, String bookSerialNo, double bookPrice) {
		this.bookName = bookName;
		this.bookEdition = bookEdition;
		this.bookAuthor = bookAuthor;
		this.bookSerialNo = bookSerialNo;
		this.bookPrice = bookPrice;
	}
	
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Main> arraylist = new ArrayList<>();
	
	public String getBookName() { return bookName; }
	
	public String getBookEdition() { return bookEdition; }

	public String getBookAuthor() { return bookAuthor; }

	public String getBookSerialNo() { return bookSerialNo; }
	
	public double getBookPrice() { return bookPrice; }
	
	abstract void addBook();
	abstract void searchBook();
	abstract void displayAllBook();
	abstract void removeBook();
	
}