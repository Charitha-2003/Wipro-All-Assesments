package wipropr1;
import java.util.*;
public class Wiproday2firsthalfass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        int choice;

		                do {
		                    System.out.println("Menu:");
		                    System.out.println("1. Print Table of a number");
		                    System.out.println("2. Calculate Factorial");
		                    System.out.println("3. Check Prime Number");
		                    System.out.println("4. Print Fibonacci Series");
		                    System.out.println("5. Exit");
		                    System.out.print("Enter your choice: ");
		                    choice = sc.nextInt();

		                    switch (choice) {
		                        case 1:
		                            printTable(sc);
		                            break;
		                        case 2:
		                            calculateFactorial(sc);
		                            break;
		                        case 3:
		                            checkPrime(sc);
		                            break;
		                        case 4:
		                            printFibonacciSeries(sc);
		                            break;
		                        case 5:
		                            System.out.println("Exit");
		                            break;
		                        default:
		                            System.out.println("Invalid choice. Please choose a valid option.");
		                    }

		                    if (choice != 5) {
		                        System.out.print("Back to Menu? (Y/N): ");
		                        String response = sc.next().trim().toUpperCase();
		                        while (!response.equals("Y") && !response.equals("N")) {
		                            System.out.print("Invalid input. Please enter Y or N: ");
		                            response = sc.next().trim().toUpperCase();
		                        }
		                        if (response.equals("N")) {
		                            choice = 5;
		                        }
		                    }
		                } while (choice != 5);

		                sc.close();
		            }

		            private static void printTable(Scanner scanner) {
		                System.out.print("Enter the number: ");
		                int number = scanner.nextInt();
		                for (int i = 1; i <= 10; i++) {
		                    System.out.println(number + " x " + i + " = " + (number * i));
		                }
		            }

		            private static void calculateFactorial(Scanner scanner) {
		                System.out.print("Enter the number: ");
		                int number = scanner.nextInt();
		                int factorial = 1;
		                for (int i = 1; i <= number; i++) {
		                    factorial *= i;
		                }
		                System.out.println("Factorial of " + number + " is " + factorial);
		            }

		            private static void checkPrime(Scanner scanner) {
		                System.out.print("Enter the number: ");
		                int number = scanner.nextInt();
		                boolean isPrime = true;
		                int i = 2;
		                while (i * i <= number) {
		                    if (number % i == 0) {
		                        isPrime = false;
		                        break;
		                    }
		                    i++;
		                }
		                if (isPrime && number > 1) {
		                    System.out.println(number + " is a prime number.");
		                } else {
		                    System.out.println(number + " is not a prime number.");
		                }
		            }

		            private static void printFibonacciSeries(Scanner scanner) {
		                System.out.print("Enter the number of terms: ");
		                int terms = scanner.nextInt();
		                int num1 = 0, num2 = 1;
		                System.out.print("Fibonacci Series: " + num1 + " " + num2);
		                for (int i = 2; i < terms; i++) {
		                    int sum = num1 + num2;
		                    System.out.print(" " + sum);
		                    num1 = num2;
		                    num2 = sum;
		                }
		                System.out.println();
		            }
		        }