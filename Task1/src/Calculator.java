import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

class Calculator{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println();
        System.out.println("============================== Calculator ===============================");
        System.out.println("\t\tOperations\t\t\t\t------>\t\t\t\tKeys to Enter");
        System.out.println("\t\tAddition\t\t\t\t------>\t\t\t\t\t1\n\t\tSubtraction\t\t\t\t------>\t\t\t\t\t2\n\t\tMultiplication\t\t\t------>\t\t\t\t\t3\n\t\tDivision\t\t\t\t------>\t\t\t\t\t4\n\t\tClose Calculator\t\t------>\t\t\t\t\t5");
        boolean proceed = true;
        while(proceed){
            System.out.print("\nEnter key between 1 to 5: ");
            int mode = sc.nextInt();
            System.out.println();

            switch (mode){
                case 1 -> add();
                case 2 -> subtract();
                case 3 -> multiply();
                case 4 -> divide();
                default -> {
                    proceed = false;
                    System.out.println("Exiting.....");
                    System.exit(0);
                }
            }
        }

    }

    public static void add(){
        System.out.println("➕ Addition Operation is Active Now.");
        boolean processAdition = true;
        while(processAdition){
            System.out.println();
            System.out.print("Wanna Proceed to perform ➕ Addition Operator? Yes or No: ");
            String permision = sc.next();
            if (permision.equalsIgnoreCase("Yes")){
                System.out.print("Enter on how many numbers you want to perform ➕ Addition: ");
                int loopTime = sc.nextInt();
                double sum = 0;
                for(int i = 1; i<= loopTime; i++ ){
                    System.out.print("Enter the number " + i + ": ");
                    double num = sc.nextFloat();
                    sum += num;
                }
                System.out.println("Sum is : " + sum);
            }
            else {
                processAdition = false;
                System.out.println("Exiting from ➕ Addition mode.................... ");
            }
        }
    }

    public static void subtract(){
        System.out.println("➖ Subtraction Operation is Active Now.");
        boolean processSubtraction = true;
        while(processSubtraction){
            System.out.println();
            System.out.print("Wanna Proceed to perform ➖ Subtraction Operator? Yes or No: ");
            String permision = sc.next();
            if (permision.equalsIgnoreCase("Yes")){
                System.out.print("Enter on how many numbers you want to perform ➖ Subtraction: ");
                int loopTime = sc.nextInt();
                double sub = 0;
                for(int i = 1; i<= loopTime; i++ ){
                    System.out.print("Enter the number " + i + ": ");
                    double num = sc.nextFloat();
                    if(i == 1) sub = num;
                    else sub = (double) (sub - num);
                }
                System.out.println("➖ Subtracted result is : " + sub);
            }
            else {
                processSubtraction = false;
                System.out.println("Exiting from ➖ Subtraction mode.................... ");
            }
        }
    }

    public static void multiply(){
        System.out.println("✖\uFE0F Multiplication Operation is Active Now.");
        boolean processMultiply = true;
        while(processMultiply){
            System.out.println();
            System.out.print("Wanna Proceed to perform ✖\uFE0F Multiplication Operator? Yes or No: ");
            String permision = sc.next();
            if (permision.equalsIgnoreCase("Yes")){
                System.out.print("Enter on how many numbers you want to perform ✖\uFE0F Multiplication: ");
                int loopTime = sc.nextInt();
                double multi = 1;
                for(int i = 1; i<= loopTime; i++ ){
                    System.out.print("Enter the number " + i + ": ");
                    double num = sc.nextFloat();
                    multi *= num;
                }
                System.out.println("✖\uFE0F Multiplication result is : " + multi);
            }
            else {
                processMultiply = false;
                System.out.println("Exiting from ✖\uFE0F Multiplication mode.................... ");
            }
        }
    }

    public static void divide(){
        System.out.println("➗ Division Operation is Active Now.");
        boolean processAdition = true;
        while(processAdition){
            System.out.println();
            System.out.print("Wanna Proceed to perform ➗ Division Operator? Yes or No: ");
            String permision = sc.next();
            if (permision.equalsIgnoreCase("Yes")){
                System.out.print("Enter the ➗ Divident number : ");
                double divident = sc.nextFloat();
                System.out.print("Enter the ➗ Divisor number : ");
                double divisor = sc.nextFloat();

                double divide = (double) (divident / divisor);
                System.out.println("Division Result is : " + divide);
            }
            else {
                processAdition = false;
                System.out.println("Exiting from ➗ Division mode.................... ");
            }
        }
    }
}