import java.util.Scanner;
class TestMarksheet{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		double OOP, LAAG, DCLD;
		
		System.out.println("Please input your marks:- ");
		System.out.print("Please input your obtained marks in \"OOP\": ");
		OOP=input.nextDouble();

		System.out.print("Please input your obtained marks in \"DCLD\": ");
		DCLD=input.nextDouble();

		System.out.print("Please input your obtained marks in \"LAAG\": ");
		LAAG=input.nextDouble();
		
		Marksheet ob= new Marksheet(OOP, DCLD, LAAG);
		double obtain=ob.getObtain(), percent=ob.getPercent();
		char grade=ob.getGrade();
		
		ob.getMarksheet();
	}
}