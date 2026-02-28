package libraryfolder;

public class BackSystem extends Main {
	BackSystem(String bookName, String bookEdition, String bookAuthor, String bookSerialNo, double bookPrice){
		super(bookName,bookEdition,bookAuthor,bookSerialNo,bookPrice);
	}
	
	void addBook() {
		String title = addName();
		String edition = addbookEdition();
		String author = addAuthor();
		String serialNum = addBookSerialNo();
		double price = addBookPrice();
		
		BackSystem s = new BackSystem(title,edition,author,serialNum,price);
		arraylist.add(s);
		
		System.out.println(" Account added Successfull.");
		System.out.println("");
		
	}
	
	void searchBook() {
	    boolean found = false;

	    System.out.println(" Search mode is active now.");
	    System.out.print("Enter the book Title or Serial no. :");
	    String search = sc.nextLine().trim();

	    for (int i = 0; i < arraylist.size(); i++) {

	        if (search.equals(arraylist.get(i).getBookSerialNo()) ||
	            search.equalsIgnoreCase(arraylist.get(i).getBookName())) {

	            found = true;

	            System.out.println("");
	            System.out.println(" Book with title " + arraylist.get(i).getBookName() + " Found Successfully.");
	            System.out.print(" Wanna see all details of this book? yes or no :");
	            String choice = sc.nextLine().trim();

	            while (true) {
	                if (choice.equalsIgnoreCase("yes")) {

	                    System.out.println(" Book Details:-");
	                    System.out.println("");
	                    System.out.println(" Book Title :" + arraylist.get(i).getBookName());
	                    System.out.println(" Author :" + arraylist.get(i).getBookAuthor());
	                    System.out.println(" Edition :" + arraylist.get(i).getBookEdition());
	                    System.out.println(" Serial No. :" + arraylist.get(i).getBookSerialNo());
	                    System.out.println(" Price :" + arraylist.get(i).getBookPrice());  // ✅ fixed
	                    System.out.println("");
	                    break;

	                } else if (choice.equalsIgnoreCase("no")) {
	                    System.out.println(" Exiting from search mode.........");
	                    System.out.println("");
	                    break;

	                } else {
	                    System.out.println(" Invalid entry, Enter either yes or no only");
	                    System.out.print(" Enter again : ");
	                    choice = sc.nextLine().trim(); 
	                }
	            }

	            break; 
	        }
	    }

	    if (!found) {
	        System.out.println(" Book not Found");
	        System.out.println("");
	    }
	}
	
	
	void displayAllBook() {
		if(arraylist.size()<1) {
			System.out.println("No Data Found");
		}else {
			for(int i = 0;i < arraylist.size();i++) {
				System.out.println(i+1+" Book Title :"+ arraylist.get(i).getBookName() + ", Author :"+ arraylist.get(i).getBookAuthor()+
						", Edition :" + arraylist.get(i).getBookEdition()+", Serial No. :" + arraylist.get(i).getBookSerialNo()+
						", Price :" + arraylist.get(i).getBookSerialNo());
			}
		}
	}
	void removeBook() {
    	System.out.println(" Remove mode is active now.");
    	System.out.print(" Enter the book Title or Serial no. :");
    	String id = sc.nextLine().trim();

   		boolean found = false;

    	for (int i = 0; i < arraylist.size(); i++) {

        	if (id.equals(arraylist.get(i).getBookSerialNo()) ||
            	id.equalsIgnoreCase(arraylist.get(i).getBookName())) {

           		arraylist.remove(i);
            	found = true;

            	System.out.println(" Book details removed Successfully.");
            	break; 
        	}
    	}

    	if (!found) {
        	System.out.println(" Book not found.");
    	}
	}
	
	String addName() {
		String title;
		while(true) {
			System.out.print(" Enter the Title of the book : ");
			title = validateString(sc.nextLine().trim());
			
			if(!title.equals("-1")) {
				break;
			}
		}
		return title;
	}
	
	String addAuthor() {
		String name;
		while(true) {
			System.out.print(" Enter the name of the Author : ");
			name = validateString(sc.nextLine().trim());
			
			if(!name.equals("-1")) {
				break;
			}
		}
		return name;
	}
	String addbookEdition() {
		String edition;
		while(true) {
			System.out.print(" Enter the Edition of the book : ");
			edition = sc.nextLine().trim();
			
			if(!edition.equals("-1")) {
				break;
			}
		}
		return edition;
	}
	
	String addBookSerialNo() {
		String num;
		while(true) {
			System.out.print(" Enter the Serial No. of the book :");
			num = validateSerialNum(sc.nextLine().trim());
			
			if(!num.equals("-1")) {
				break;
			}
		}
		return num;
	}
	
	double addBookPrice() {
		String price;
		double pric;
		while(true) {
			System.out.print(" Enter the Price :");
			price = sc.nextLine().trim();
			
			if(price.matches("^(0|[1-9][0-9]*)(\\.[0-9]+)?$")) {
				pric = Double.parseDouble(price);
				break;
			}else {
				System.out.println(" Entered price is invalid.");
				System.out.println(" Enter Again");
			}
			
		}
		return pric;
	}
	
	String validateString(String str) {
		if(str.matches("[a-zA-Z ]+")) {
			return str;
		}else {
			return "-1";
		}
	}
	
	String validateSerialNum(String num) {
		
		if(num.matches("^(0|[1-9][0-9]*)$")) {
			for(int i = 0;i < arraylist.size();i++) {
				if(num.equals(arraylist.get(i).getBookSerialNo())) {
					System.out.println(" book with this serial number already exist.");
					return "-1";
				}
			}
			return num;
		}else {
			System.out.println(" Enter a valid Number.");
			return "-1";
		}
	}
	
}



