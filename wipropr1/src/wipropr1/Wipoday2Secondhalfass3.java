package wipropr1;
public class Wipoday2Secondhalfass3 {
		    // Method to print multiplication table
		    public void printTable(int number) {
		        System.out.println("Multiplication table of " + number + ":");
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(number + " x " + i + " = " + (number * i));
		        }
		    }

		    // Method to calculate factorial
		    public void calculateFactorial(int number) {
		        int factorial = 1;
		        for (int i = 1; i <= number; i++) {
		            factorial *= i;
		        }
		        System.out.println("Factorial of " + number + " is " + factorial);
		    }

		    // Method to check prime number
		    public void checkPrime(int number) {
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

		    // Method to printing  Fibonacci series of numbers
		    public void printFibonacci(int terms) {
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



