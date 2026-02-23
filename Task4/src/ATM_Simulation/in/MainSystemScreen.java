package ATM_Simulation.in;
import java.util.*;

abstract class MainSystem{
	private String accName;
	private String accNum;
	private String cardPin;
	private double balance;
	
	
	
	public MainSystem(String accName, String accNum, String cardPin, double balance) {
		this.accName = accName;
		this.accNum = accNum;
		this.cardPin = cardPin;
		this.balance = balance;
	}
	
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<AccSettings> arraylist = new ArrayList<>();
	
	public String getAccName() {
	    return accName;
	}
	
	public void setaccName(String name) {
	    this.accName = name;
	}
	
	public String getAccNum() {
	    return accNum;
	}

	public String getCardPin() {
	    return cardPin;
	}

	public double getBalance() {
	    return balance;
	}
	
	public void setBalance(double balance) {
	    this.balance = balance;
	}
	
	abstract void addAcc();
	abstract void searchacc();
	abstract void editaccName();
	abstract void deleteaccName();
	abstract String addName();
	abstract String addaccNum();
	abstract String addcardPin();
	abstract double addbalance();
	
}

class MainSystemScreen {
	public static Scanner sp = new Scanner(System.in);
	public static void main(String args[]) {
		AccSettings system = new AccSettings("", "", "", 0);
		
		while(true) {
			System.out.println("===============================================================");
			System.out.println("\t\t\tATM SIMULATION");
			System.out.println("===============================================================");
			System.out.println(" 1.User mode\n 2.Manager mode");
			System.out.println("---------------------------------------------------------------");
			System.out.print(" Enter your Choosen option no. :");
			String choice = sp.nextLine().trim();
			if(choice.equals("1")) {
				system.accountaccess();
			}else if(choice.equals("2")) {
				system.manageraccess();
			}else {
				System.out.print("Invalid input");
				System.out.print("Please try again");
				break;
			}
		}
		
		
	}

	
}
