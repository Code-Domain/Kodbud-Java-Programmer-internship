package ATM_Simulation.in;

public class AccSettings extends MainSystem {
	
	public AccSettings(String accName, String accNum, String cardPin, double balance) {
		super(accName,accNum,cardPin,balance);
	}
	
	
	void addAcc() {
		String name = addName();
		String number = addaccNum();
		String pin = addcardPin();
		double balance = addbalance();
		
		AccSettings s = new AccSettings(name,number,pin,balance);
		arraylist.add(s);
		
		System.out.println(" Account added Successfull.");
		System.out.println("");
		
	}
	
	public void accountaccess() {
		
		System.out.print(" Enter your Account Number: ");
		String num = sc.nextLine().trim();
		System.out.print(" Enter your Account access pin: ");
		String pin = sc.nextLine().trim();
			
		for(int i = 0; i < arraylist.size(); i++) {
			if(num.equals(arraylist.get(i).getAccNum()) && pin.equals(arraylist.get(i).getCardPin())){
				mainPanel(arraylist.get(i));
			}
		}
			
	}
	
	public void manageraccess() {
		while(true) {
			System.out.print(" Enter your Id: ");
			String id = sc.nextLine().trim();
			System.out.print(" Enter your password: ");
			String password = sc.nextLine().trim();
			System.out.println("");
			
			if(id.matches("^(0|[1-9][0-9]*)$")||password.matches("^[0-9]{6}$")) {
				if(id.equals("4040") && password.equals("44440000")){
					managerPanel();
					break;
					}
			}else {
				System.out.println(" You have entered Wrong Id or Password");
				System.out.println(" PLease check and try again later.");
			}
		}
	}
	
	void managerPanel() {
		while(true) {
			System.out.println(" WELCOME ACCOUNT MANAGER, TELL US HOW MEY I CAN HELP YOU?");
			System.out.println("");
			System.out.println(" 1. Add new Account");
			System.out.println(" 2. Search Account");
			System.out.println(" 3. Delete Account");
			System.out.println(" 4. Edit Account");
			System.out.println(" 5. Exit");
			System.out.println("");
			System.out.print(" Enter your choice option number :");
			String choice1 = sc.nextLine().trim();
			
			if(choice1.equalsIgnoreCase("1")) {
				addAcc();
			}else if(choice1.equalsIgnoreCase("2")) {
				searchacc();
			}else if(choice1.equalsIgnoreCase("3")) {
				deleteaccName();
			}else if(choice1.equalsIgnoreCase("4")){
				editaccName();
			}else if(choice1.equalsIgnoreCase("5")){
				System.out.println(" Exiting......");
				break;
			}else {
				System.out.println(" Invalid entery, Enter the option number between 1 and 4.");
			}
		}
	}
		
	void mainPanel(AccSettings a) {
		boolean found = true;
		while(true) {
			System.out.println("");
			System.out.println(" WELCOME SIR, TELL US HOW MEY I CAN HELP YOU?");
			System.out.println("");
			System.out.println(" 1. Show Account");
			System.out.println(" 2. Deposite Amount");
			System.out.println(" 3. Withdraw Amount");
			System.out.println(" 4. Exit");
			System.out.println("");
			System.out.print(" Enter your choice option number :");
			String choice = sc.nextLine().trim();
		
			if(choice.equalsIgnoreCase("1")) {
				System.out.println(" Account Details:-");
				System.out.println("");
				System.out.println(" Account Holder name: " + a.getAccName());
				System.out.println(" Account Number: " + a.getAccNum());
				System.out.println(" Account Card Pin: " + a.getCardPin());
				System.out.println(" Current Balance: " + a.getBalance());
				System.out.println("");
			}else if(choice.equalsIgnoreCase("2")) {
				a.depositebalance();
			}else if(choice.equalsIgnoreCase("3")) {
				a.withdrawbalance();
			}else if(choice.equalsIgnoreCase("4")){
				System.out.println(" Exiting.......");
				break;
			}else {
				System.out.println(" Invalid entery, Enter the option number between 1 and 4.");
			}
		}
	
		if(!found) {
			System.out.println(" Account not found");
			System.out.println("");
		}
	}
	
	void searchacc() {
		System.out.println(" Search Account mode is active");
		System.out.print(" Enter the Account Number of the Account holder :");
		String accnum = sc.nextLine().trim();
		System.out.println("");
		boolean found = false;
		
		for(int i = 0; i < arraylist.size();i++) {
			if(accnum.equals(arraylist.get(i).getAccNum())) {
				found = true;
				System.out.println("");
				System.out.println(" Account Found Successfully.");
				System.out.println(" Account holder name is "+ arraylist.get(i).getAccName());
				System.out.print(" Wanna see all details of this account? yes or no :");
				String choice = sc.nextLine().trim();
				System.out.println("");
				
				while(true) {
					if(choice.equalsIgnoreCase("yes")) {
						System.out.println(" Account Details:-");
						System.out.println("");
						System.out.println(" Account Holder name: " + arraylist.get(i).getAccName());
						System.out.println(" Account Number: " + arraylist.get(i).getAccNum());
						System.out.println(" Account Card Pin: " + arraylist.get(i).getCardPin());
						System.out.println(" Current Balance: " + arraylist.get(i).getBalance());
						System.out.println("");
						break;
					}else if(choice.equalsIgnoreCase("no")) {
						System.out.println(" Exiting from editing mode.........");
						System.out.println("");
						break;
					}else {
						System.out.println(" Invalid entery, Enter either yes or no only");
						System.out.println("");
					} 
				}
			}
		}
		if(!found) {
			System.out.println(" Accound not Found");
			System.out.println("");
		}
	}
	
	void editaccName() {
		System.out.println(" Edit Account Name mode is active");
		System.out.print(" Enter the Account Number of the Account holder :");
		String accnum = sc.nextLine().trim();
		boolean found = false;
		
		for(int i = 0; i < arraylist.size();i++) {
			if(accnum.equals(arraylist.get(i).getAccNum())) {
				found = true;
				System.out.println("");
				System.out.println(" Account Found Successfully.");
				System.out.println(" Account holder name is "+ arraylist.get(i).getAccName());
				System.out.print(" Wanna change the holder name? yes or no :");
				String choice = sc.nextLine().trim();
				System.out.println("");
				
				while(true) {
					if(choice.equalsIgnoreCase("yes")) {
						String newName = addName(); 
						arraylist.get(i).setaccName(newName);
						System.out.println("Name Changed Successfully.");
						break;
					}else if(choice.equalsIgnoreCase("no")) {
						System.out.println(" Exiting from editing mode.........");
						break;
					}else {
						System.out.println(" Invalid entery, Enter either yes or no only");
					}
				}
			}
		}
		if(!found) {
			System.out.println(" Accound not Found");
		}
	}
	
	void deleteaccName() {
		System.out.println(" Delete Account mode is active");
		System.out.print(" Enter the Account Number of the Account to be deleted :");
		String accnum = sc.nextLine().trim();
		System.out.println("");
		
		boolean found = false;
		
		for(int i = 0; i < arraylist.size();i++) {
			if(accnum.equals(arraylist.get(i).getAccNum())) {
				System.out.println(" Account Found Successfully.");
				System.out.println(" Account holder name is "+ arraylist.get(i).getAccName());
				System.out.print(" Wanna Delete this account? yes or no :");
				String choice = sc.nextLine().trim();
				
				found = true;
				
				while(true) {
					if(choice.equalsIgnoreCase("yes")) {
						arraylist.remove(i);
						System.out.println("");
						System.out.println("Account deleted Successfully");
						break;
					}else if(choice.equalsIgnoreCase("no")) {
						System.out.println("");
						System.out.println(" Exiting from Delete mode.........");
						break;
					}else {
						System.out.println("");
						System.out.println(" Invalid entery, Enter either yes or no only");
					}
				}
				
			}
		}
		if(!found) {
			System.out.println("");
			System.out.println(" Accound not Found");
		}
	}
	
	String addName() {
		String name;
		while(true) {
			System.out.print(" Enter the Account Holder Name :");
			name = validateString(sc.nextLine().trim());
			
			if(!name.equals("-1")) {
				break;
			}
		}
		return name;
	}
	
	String addaccNum() {
		String num;
		while(true) {
			System.out.print(" Enter the Account Number :");
			num = validateaccNumber(sc.nextLine().trim());
			
			if(!num.equals("-1")) {
				break;
			}
		}
		return num;
	}
	
	String addcardPin() {
		String pin;
		while(true) {
			System.out.print(" Enter the Card Pin :");
			pin = validateCardPin(sc.nextLine().trim());
			
			if(!pin.equals("-1")) {
			    break;
			}
		}
		return pin;
	}
	
	double addbalance() {
		String balance;
		double amount;
		while(true) {
			System.out.print(" Enter the Balance :");
			balance = sc.nextLine().trim();
			
			if(balance.matches("^(0|[1-9][0-9]*)(\\.[0-9]+)?$")) {
				amount = Double.parseDouble(balance);
				break;
			}else {
				System.out.println(" Entered Balance is invalid.");
				System.out.println(" Enter Again");
			}
			
		}
		return amount;
	}
	
	public void depositebalance() {
		String addbalance;
		double amount;
		while(true) {
			System.out.print(" Enter the Amount to deposite :");
			addbalance = sc.nextLine().trim();
			
			if(addbalance.matches("^(0|[1-9][0-9]*)(\\.[0-9]+)?$")) {
				amount = Double.parseDouble(addbalance);
				double newBalance = this.getBalance() + amount;
                this.setBalance(newBalance);
                System.out.print("");
				System.out.println(" Amount Deposited Successfully.");
				break;
			}else {
				System.out.println(" Invalid amount. Enter again.");
			}
			
		}
	}
	
	void withdrawbalance() {
		String withdrawbalance;
		double amount;
		while(true) {
			System.out.print(" Enter the amount to withdraw :");
			withdrawbalance = sc.nextLine().trim();
			
			if(withdrawbalance.matches("^(0|[1-9][0-9]*)(\\.[0-9]+)?$")) {
				amount = Double.parseDouble(withdrawbalance);
				if(amount <= this.getBalance() ) {
					double newBalance = this.getBalance() - amount;
	                this.setBalance(newBalance);

	                System.out.println(" Amount Withdrawn Successfully.");
	                System.out.print("");
	                break;
				}else {
					System.out.println(" Amount can't be withdrawal, Check your balance.");
				}
			}else {
				System.out.println(" Invalid amount. Enter again.");
			}
			
		}
	}
	
	String validateString(String name) {
		
		if(name.matches("[A-Za-z]+( [A-Za-z]+)*")) {
			return name;
		}else {
			System.out.println(" Enter a valid Name.");
			return "-1";
		}
	}
	
	String validateaccNumber(String num) {
		
		if(num.matches("^(0|[1-9][0-9]*)$")) {
			for(int i = 0;i < arraylist.size();i++) {
				if(num.equals(arraylist.get(i).getAccNum())) {
					System.out.println(" Account with this Account number already exist.");
					return "-1";
				}
			}
			return num;
		}else {
			System.out.println(" Enter a valid Number.");
			return "-1";
		}
	}
	
	String validateCardPin(String cardPinNum) {
		
		if(cardPinNum.matches("^[0-9]{6}$")) {
			for(int i = 0;i < arraylist.size();i++) {
				if(cardPinNum.equals(arraylist.get(i).getCardPin())) {
					System.out.println(" Account with this Card Pin already exist.");
					return "-1";
				}
			}
			return cardPinNum;
		}else {
			System.out.println(" Enter a valid pin.");
			return "-1";
		}
	}
	
}
