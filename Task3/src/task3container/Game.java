package task3container;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Game {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("===============================================================================");
			System.out.println("\t\t\t\tNUMBER GUESSING GAME");
			
			int minValue = 0;
			int maxValue = 2;
			
			boolean work = false;
			
			do {
				System.out.println("===============================================================================");
				System.out.println(" Let's Play ,choose one of these options to procced.");
				System.out.println("");
				System.out.println("\t 1. Play within default Range (1 to 50).");
				System.out.println("\t 2. Play after setting a new Range.");
				System.out.println("\t 3. Exit / Close Game."); 
				System.out.println("");
				System.out.print(" Enter the option number that you want to do : ");
				String option = sc.next();
				
				
				if(option.equalsIgnoreCase("1")) {
					minValue = 1;
					maxValue = 50;
					break;
				}else if(option.equalsIgnoreCase("2")) {
					System.out.println(" Set the range to Guess");
					System.out.print(" --> Enter the lowest Integer Value that you can Guess :");
					minValue = sc.nextInt();
					System.out.print(" --> Enter the Highest Integer Value that you can Guess :");
					maxValue = sc.nextInt();
					System.out.println(" Range got set from (1 to 50) to (" + minValue + " to " + maxValue + ").");
					System.out.println(" New Range is " + minValue + " to " + maxValue);
					break;
				}else if(option.equalsIgnoreCase("3")) {
					System.out.println(" Exiting..............");
					work = true;
					break;
				}else {
					System.out.println(" Invalid input. Try again.");
				}
			}while(true);
			
			
			if(!work) {
				int attempt = 1;
				int number = ThreadLocalRandom.current().nextInt(minValue,maxValue+1);
				while(true) {

				    System.out.print(" Enter your guess number between " + minValue + " and " + maxValue + " : ");
				    int guess = sc.nextInt();

				    if(guess < minValue || guess > maxValue) {
				        System.out.println(" --> Invalid Guess. Number must be between " + minValue + " and " + maxValue);
				        continue;
				    }
				    
				    if(guess > number) {
				        System.out.println(" --> Your Guess is higher than the Original number.");
				    }
				    else if(guess < number) {
				        System.out.println(" --> Your Guess is smaller than the Original number.");
				    }
				    else {
				        System.out.println(" 🎉 Congratulations! You won at attempt: " + attempt);
				        break;
				    }

				    attempt++;
				}

			}
		}
	}
}
