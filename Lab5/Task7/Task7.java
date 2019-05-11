import java.util.Scanner;
class Task7{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		System.out.println("Please enter the name, age, and program of Student1:- ");
		String info1=input.nextLine();
		
		System.out.println();
		System.out.println("Please enter the name, age, and program of Student2:- ");
		String info2=input.nextLine();
		
		String sp1[]=info1.split(",");
		System.out.println();
		System.out.println("Student 1:-");
		System.out.println("Name: "+sp1[0]);
		System.out.println("Age: "+sp1[1]);
		System.out.println("Program: "+sp1[2]);
		
		String sp2[]=info2.split(",");
		System.out.println();
		System.out.println("Student 2:-");
		System.out.println("Name: "+sp2[0]);
		System.out.println("Age: "+sp2[1]);
		System.out.println("Program: "+sp2[2]);
	}
}