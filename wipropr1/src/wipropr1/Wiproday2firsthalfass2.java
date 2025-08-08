package wipropr1;
import java.util.*;
//Utility class for String operations
	class StringUtility {

	    public int countVowels(String str) {
	        int count = 0;
	        str = str.toLowerCase();
	        for (char ch : str.toCharArray()) {
	            if ("aeiou".indexOf(ch) != -1) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public int countConsonants(String str) {
	        int count = 0;
	        str = str.toLowerCase();
	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public boolean isPalindrome(String str) {
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        int i = 0, j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }

	    public String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    public String toUpperCase(String str) {
	        return str.toUpperCase();
	    }

	    public String toLowerCase(String str) {
	        return str.toLowerCase();
	    }

	    public String replaceWord(String str, String oldWord, String newWord) {
	        return str.replace(oldWord, newWord);
	    }
	}

	// Main application class
	public class Wiproday2firsthalfass2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StringUtility util = new StringUtility();

	        System.out.print("Enter a string: ");
	        String inputString = sc.nextLine();

	        int choice;
	        char cont;

	        do {
	            System.out.println("\n********** MENU **********");
	            System.out.println("1. Count Vowels");
	            System.out.println("2. Count Consonants");
	            System.out.println("3. Check Palindrome");
	            System.out.println("4. Reverse String");
	            System.out.println("5. Convert to Uppercase");
	            System.out.println("6. Convert to Lowercase");
	            System.out.println("7. Replace Word");
	            System.out.println("8. Exit");
	            System.out.println("**************************");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            switch (choice) {
	                case 1:
	                    System.out.println("Vowels: " + util.countVowels(inputString));
	                    break;
	                case 2:
	                    System.out.println("Consonants: " + util.countConsonants(inputString));
	                    break;
	                case 3:
	                    System.out.println("Palindrome? " + util.isPalindrome(inputString));
	                    break;
	                case 4:
	                    System.out.println("Reversed: " + util.reverseString(inputString));
	                    break;
	                case 5:
	                    System.out.println("Uppercase: " + util.toUpperCase(inputString));
	                    break;
	                case 6:
	                    System.out.println("Lowercase: " + util.toLowerCase(inputString));
	                    break;
	                case 7:
	                    System.out.print("Enter word to replace: ");
	                    String oldWord = sc.nextLine();
	                    System.out.print("Enter new word: ");
	                    String newWord = sc.nextLine();
	                    inputString = util.replaceWord(inputString, oldWord, newWord);
	                    System.out.println("Updated string: " + inputString);
	                    break;
	                case 8:
	                    System.out.println("Exiting program.");
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }

	            System.out.print("\nBack to menu? (Y/N): ");
	            cont = sc.next().charAt(0);
	            sc.nextLine(); // clear buffer

	        } while (cont == 'Y' || cont == 'y');

	        System.out.println("Program ended.");
	        sc.close();
	    }
	}