import java.util.Scanner;
class BioDataTest{
	public static void main(String args[]){
		String name, fname, rollno, dept;
		double OOP, LAAG, DCLD;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name=input.nextLine();

		System.out.print("Please enter your father name: ");
		fname=input.nextLine();

		System.out.print("Please enter your roll number: ");
		rollno=input.nextLine();

		System.out.print("Please enter your department: ");
		dept=input.nextLine();

		System.out.println();
		System.out.println("Please input your marks:- ");
		System.out.print("Please input your obtained marks in \"OOP\": ");
		OOP=input.nextDouble();

		System.out.print("Please input your obtained marks in \"DCLD\": ");
		DCLD=input.nextDouble();

		System.out.print("Please input your obtained marks in \"LAAG\": ");
		LAAG=input.nextDouble();
		
		Student ob1=new Student(name, fname, rollno, dept);
		Marksheet ob2=new Marksheet(OOP, DCLD, LAAG);
		BioData ob=new BioData(ob1, ob2);
		ob.setCalculate();
		ob.createStudentResult();
	}
}