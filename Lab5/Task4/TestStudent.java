import java.util.Scanner;
class TestStudent{
	public static void main(String args[]){
		String name, fname, rollno, dept;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name=input.nextLine();

		System.out.print("Please enter your father name: ");
		fname=input.nextLine();

		System.out.print("Please enter your roll number: ");
		rollno=input.nextLine();

		System.out.print("Please enter your department: ");
		dept=input.nextLine();
		
		Student ob=new Student(name, fname, rollno, dept);
		ob.getStudent();
	}
}