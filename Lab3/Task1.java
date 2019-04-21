//Lab3 - Task1
import java.util.Scanner;
class Task1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter your obtained marks in \"C++\": ");
		double num1= sc.nextDouble();

		System.out.print("Please enter your obtained marks in \"Data Structures\": ");
		double num2= sc.nextDouble();

		System.out.print("Please enter your obtained marks in \"Operating Systems\": ");
		double num3= sc.nextDouble();
		
		double obtain=num1+num2+num3;
		System.out.println("Your total obtained marks will be: "+obtain);
		
		double total=300.00, percent=(obtain/total)*100;		
		System.out.println("Your percentage will be: "+percent);
		
		System.out.println("And your grade will be:- ");
		if(percent>90)
			System.out.println("Grade: A");

		else if(percent>=80&&percent<=90)
			System.out.println("Grade: B");

		else if(percent>=70&&percent<80)
			System.out.println("Grade: C");

		else if(percent>=60&&percent<70)
			System.out.println("Grade: D");
		
		else
			System.out.println("Grade: FAIL");

	}
}