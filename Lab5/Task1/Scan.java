import java.util.Scanner;
class Scan{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Following are inputs taken by methods of Scanner:- ");

		System.out.print("Enter the value for String method: ");
		String in1=input.nextLine();

		System.out.print("Enter the value for Boolean method: ");
		boolean in2=input.nextBoolean();

		System.out.print("Enter the value for Byte method: ");
		byte in3=input.nextByte();

		System.out.print("Enter the value for Float method: ");
		float in4=input.nextFloat();

		System.out.print("Enter the value for Double method: ");
		double in5=input.nextDouble();

		System.out.print("Enter the value for Integer method: ");
		int in6=input.nextInt();

		System.out.print("Enter the value for Short method: ");
		short in7=input.nextShort();

		System.out.print("Enter the value for Long method: ");
		long in8=input.nextLong();

		
		System.out.println();
		System.out.println("Thus, the values would be displayed or stored as: ");
		System.out.println("String: "+in1);
		System.out.println("Boolean: "+in2);
		System.out.println("Byte: "+in3);
		System.out.println("Float: "+in4);
		System.out.println("Double: "+in5);
		System.out.println("Integer: "+in6);
		System.out.println("Short: "+in7);
		System.out.println("Long: "+in8);
		
	}
}