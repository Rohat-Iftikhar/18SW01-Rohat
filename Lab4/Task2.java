//Lab4 - Task2
import java.util.Scanner;
class Task2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the number whose table you require: ");
		int tab=input.nextInt();
		
		System.out.println();
		System.out.println("(The starting point must be greater than ending point)");
		System.out.print("Please enter the starting point of the table: ");
		int start=input.nextInt();
	
		System.out.print("Please enter the ending point of the table: ");
		int end=input.nextInt();

		System.out.println();	
		System.out.println("The table of "+tab+" is:- ");
		for(int x=start; x<=end; x++){
			System.out.println(tab+"x"+x+" = "+(tab*x));
		}
	}
}