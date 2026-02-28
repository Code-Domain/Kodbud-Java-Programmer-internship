package libraryfolder;
import java.util.*;

class MainSystemScreen {
	public static Scanner sp = new Scanner(System.in);
	public static void main(String args[]) {
		BackSystem system = new BackSystem("", "", "","", 0);
		
		while(true) {
			System.out.println("===============================================================");
			System.out.println("\t\tLIBREARY MANAGEMENT SYSTEM");
			System.out.println("===============================================================");
			System.out.println(" 1. Add new books\r\n"
					+ " 2. Display all books\r\n"
					+ " 3. Search a book by title\r\n"
					+ " 4. Remove a book\r\n"
					+ " 5. Exit/Close");
			System.out.println("---------------------------------------------------------------");
			System.out.print(" Enter your Choosen option no. :");
			String choice = sp.nextLine().trim();
			if(choice.equals("1")) system.addBook();
			else if(choice.equals("2")) system.displayAllBook();
			else if(choice.equals("3")) system.searchBook();
			else if(choice.equals("4")) system.removeBook();
			else if(choice.equals("5")) {
				System.out.println(" Exiting....."); 
				break;
			}else {
				System.out.println(" Invalid input");
				System.out.println(" Please try again");
			}
		}
		
		
	}
	
}