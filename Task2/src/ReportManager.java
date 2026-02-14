import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class ReportManager {
	String name;
	String id;
	float percentage;
	char grade;
	static int limit = 100;
	Map<String,Float> hashmap =  new HashMap<>();
	
	ReportManager(String i,String n){
		this.id = i;
		this.name = n;
	}
	
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<ReportManager> array = new ArrayList<>();
	
	void calPercentage() {
		
		int no_of_Subject;

		while (true) {
		    System.out.print("Enter the total number of Subjects : ");
		    no_of_Subject = sc.nextInt();
		    sc.nextLine();

		    if (no_of_Subject > 0) {
		        break;
		    }

		    System.out.println("Number of subjects must be greater than 0.");
		}
		
		float sum = 0;
		for(int i = 1; i <= no_of_Subject; i++) {

		    String subject;

		    while (true) {
		        System.out.print(i + ". Enter your Subject name : ");
		        subject = sc.nextLine();

		        if (!this.hashmap.containsKey(subject)) {
		            break;
		        }

		        System.out.println("Subject already entered. Try again.");
		    }

		    float marks;

		    while (true) {
		        System.out.print("---> Enter the marks scored in " + subject + " : ");
		        marks = sc.nextFloat();
		        sc.nextLine();

		        if (marks <= ReportManager.limit && marks >= 0) {
		            break;
		        } else {
		            System.out.println("Invalid marks. Enter again.");
		        }
		    }

		    this.hashmap.put(subject, marks);
		    sum += marks;
		}

		
		this.percentage = (float) ((sum*100.00)/(no_of_Subject*ReportManager.limit));
		
		if (this.percentage >= 90) {
		    this.grade = 'A';
		} else if (this.percentage >= 80) {
		    this.grade = 'B';
		} else if (this.percentage >= 70) {
		    this.grade = 'C';
		} else if (this.percentage >= 60) {
		    this.grade = 'D';
		} else if (this.percentage >= 50) {
		    this.grade = 'E';
		} else {
		    this.grade = 'F';
		}

	}
	
	static void addStudentReport() {
		do {
			System.out.print("Enter Student Id : ");
			String idg = sc.next();
			sc.nextLine();
			
			boolean found = false;
			for(ReportManager a:array) {
				if(a.id.equalsIgnoreCase(idg)) {
					System.out.println("Invalid Entery Student with Id "+idg+" already exisit.");
					System.out.println("Enter Again.");
					found = true;
					break;
				}
			}
			
			if (!found) {
				System.out.print("Enter Student name : ");
				String nameg = sc.nextLine();
				
				ReportManager rep = new ReportManager(idg,nameg);
				
				rep.calPercentage();
				
				System.out.println("Student with Id "+idg+" Added Successsfully.");
				
				array.add(rep);
				break;
			}
		}while(true);
	}
	
	static void deleteStudentReport() {
		System.out.print("Enter the Student Id : ");
	    String idg = sc.next();
	    sc.nextLine();
	    
	    boolean found = false;
	    for (int i = 0; i < array.size(); i++) {

	        if (array.get(i).id.equalsIgnoreCase(idg)) {
	        	System.out.println("Student Report Found.");
	            System.out.println("NAME : " + array.get(i).name);
	            System.out.println("ID : " + array.get(i).id);
	            System.out.println("");
	            System.out.println("Student with Id " + idg + " Deleted Successfully.");
	            found = true;
	            array.remove(i);
	            break;
	        }
	    }
	    if(!found) {
	    	System.out.println("Student with Id " + idg+ " not found.");
	    }
	}
	
	static void updateStudentReport() {

	    System.out.print("Enter the Student Id to update: ");
	    String idg = sc.next();
	    sc.nextLine();

	    ReportManager student = null;

	    // Find student
	    for (ReportManager s : array) {
	        if (s.id.equalsIgnoreCase(idg)) {
	            student = s;
	            break;
	        }
	    }

	    if (student == null) {
	        System.out.println("Student with Id " + idg + " not found.");
	        return;
	    }

	    System.out.println("Student Found.");
	    System.out.println("1. Update Name");
	    System.out.println("2. Update ID");
	    System.out.println("3. Update Subjects & Marks");
	    System.out.print("Choose what to update: ");
	    String choice = sc.nextLine();

	    // 🔹 Update Name
	    if (choice.equals("1")) {
	        System.out.print("Enter new name: ");
	        student.name = sc.nextLine();
	        System.out.println("Name updated successfully.");
	    }

	    // 🔹 Update ID
	    else if (choice.equals("2")) {

	        System.out.print("Enter new ID: ");
	        String newId = sc.next();
	        sc.nextLine();

	        // Check duplicate ID
	        for (ReportManager s : array) {
	            if (s.id.equalsIgnoreCase(newId)) {
	                System.out.println("ID already exists. Update failed.");
	                return;
	            }
	        }

	        student.id = newId;
	        System.out.println("ID updated successfully.");
	    }

	    // 🔹 Update Subjects & Marks
	    else if (choice.equals("3")) {

	        student.hashmap.clear();   // remove old subjects
	        student.calPercentage();   // re-enter subjects and recalculate
	        System.out.println("Subjects and marks updated successfully.");
	    }

	    else {
	        System.out.println("Invalid choice.");
	    }
	}

	
	static void searchStudentReport() {
	    System.out.print("Enter the Student Id : ");
	    String idg = sc.next();
	    sc.nextLine();

	    boolean found = false;

	    for(ReportManager s : array) {
	        if(s.id.equalsIgnoreCase(idg)) {
	            System.out.println("Student Report Found.");
	            System.out.println("NAME : " + s.name);
	            System.out.println("ID : " + s.id);
	            System.out.println("\tSUBJECTS\t\t\t\t\t MARKS");
    			System.out.println();
	            for (Map.Entry<String, Float> entry : s.hashmap.entrySet()) {
	                System.out.println("\t"+entry.getKey() + " \t\t\t\t\t " + entry.getValue());
	            }
	            System.out.println();
	            System.out.printf("Percentage : %.2f%%\n", s.percentage);
	            System.out.println("Grade : " + s.grade);
	            
	            found = true;
	            break;   
	        }
	    }

	    if(!found) {
	    	System.out.println("Student with Id " + idg+ " not found.");
	    }
	    
	}
	
	
	static void settings() {
		System.out.println("Want to change the Full marks of all Subjects? Yes or No : ");
		String want = sc.nextLine();
		
		if(want.equalsIgnoreCase("yes")) {
			System.out.println("Enter the new Full Marks : ");
			ReportManager.limit = sc.nextInt();
			sc.nextLine();
			System.out.println("Marks Changed Successfully.");
		}else {
			System.out.println("Exiting from Settings.......");
		}
		
		
	}

	
	public static void main(String args[]) {
		System.out.println("================================================================================");
		System.out.println("\t\tWelcome to the Student Report Management System.");
		
		while(true) {
			System.out.println("================================================================================");
			System.out.println("");
			System.out.println("Choose what you want to do?");
			System.out.println();
			System.out.println("\t Operations\t\t\t\t\t Keys to Enter");
			System.out.println();
			System.out.println(" For Adding new Student Report\t:--------------->\t\t1");
			System.out.println(" For Deleting a Student Report\t:--------------->\t\t2");
			System.out.println(" For Update a Student Report\t:--------------->\t\t3");
			System.out.println(" For Searching a Student Report\t:--------------->\t\t4");
			System.out.println(" For Settings\t\t\t:--------------->\t\t5");
			System.out.println(" For Closing Application\t\t:--------------->\t\t6");
			System.out.println("");
			System.out.print("Enter the key operation that you want to do :");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("1")) {
				addStudentReport();
			}else if(choice.equalsIgnoreCase("2")) {
				deleteStudentReport();
			}else if(choice.equalsIgnoreCase("3")) {
				updateStudentReport();
			}else if(choice.equalsIgnoreCase("4")) {
				searchStudentReport();
			}else if(choice.equalsIgnoreCase("5")) {
				settings();
			}else if(choice.equalsIgnoreCase("6")) {
				System.out.println("Exiting............");
				break;
			}else {
				System.out.println("You have enter a wrong input. Please input the correct value.");
			}
		}
	
	
	}
	
}
