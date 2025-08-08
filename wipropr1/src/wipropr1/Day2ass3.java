package wipropr1;
import java.util.*;
public class Day2ass3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Wipoday2Secondhalfass3 mathOperations = new Wipoday2Secondhalfass3();
	        int choice;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Print multiplication table");
	            System.out.println("2. Calculate factorial");
	            System.out.println("3. Check prime number");
	            System.out.println("4. Print Fibonacci series");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter number: ");
	                    int number = scanner.nextInt();
	                    mathOperations.printTable(number);
	                    break;
	                case 2:
	                    System.out.print("Enter number: ");
	                    int factorialNumber = scanner.nextInt();
	                    mathOperations.calculateFactorial(factorialNumber);
	                    break;
	                case 3:
	                    System.out.print("Enter number: ");
	                    int primeNumber = scanner.nextInt();
	                    mathOperations.checkPrime(primeNumber);
	                    break;
	                case 4:
	                    System.out.print("Enter number of terms: ");
	                    int terms = scanner.nextInt();
	                    mathOperations.printFibonacci(terms);
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please choose a valid option.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }
}
