//Lab 3 - Task 3
import java.util.*;
class Task3{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter a letter: ");
		char letter= sc.next().charAt(0);
		
		switch(letter){
			case 65:
			System.out.println("The letter is a vowel.");
			break;
			
			case 69:
			System.out.println("The letter is a vowel.");
			break;
			
			case 73:
			System.out.println("The letter is a vowel.");
			break;
			
			case 79:
			System.out.println("The letter is a vowel.");
			break;
			
			case 85:
			System.out.println("The letter is a vowel.");
			break;

			case 97:
			System.out.println("The letter is a vowel.");
			break;

			case 101:
			System.out.println("The letter is a vowel.");
			break;

			case 105:
			System.out.println("The letter is a vowel.");
			break;

			case 111:
			System.out.println("The letter is a vowel.");
			break;

			case 117:
			System.out.println("The letter is a vowel.");
			break;
			
			default:
			System.out.println("The letter is a consonant.");
		}
	}
}