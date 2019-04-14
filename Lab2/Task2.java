//Lab 2 - Task 2
/*Write java program to demonstrate the working of the following operators:
▪ Relational operators
▪ Logical Boolean operators*/

class Task2{
	public static void main(String args[]){
		int a=4,b=9;
		System.out.println("The given numebers are: "+a+" "+b);

		System.out.println();
		System.out.println("Following are the workings of Relational Operators:-");
		System.out.println("The == operator results to: "+(a==b));
		System.out.println("The != operator results to: "+(a!=b));
		System.out.println("The > operator results to: "+(a>b));
		System.out.println("The < operator results to: "+(a<b));
		System.out.println("The >= operator results to: "+(a>=b));
		System.out.println("The <= operator results to: "+(a<=b));

		System.out.println();
		System.out.println("Following are the workings of Logical Boolean Operators:-");
		System.out.println("For || operator:- ");
		System.out.println("If a<b || a==b, it results to: "+(a<b||a==b));
		System.out.println();

		System.out.println("For && operator:- ");
		System.out.println("If a<b && a==b, it results to: "+(a<b&&a==b));
		System.out.println();

		System.out.println("For & operator:- ");
		System.out.println("If a<b & a==b, it results to: "+(a<b&a==b));
		System.out.println();

		System.out.println("For | operator:- ");
		System.out.println("If a<b | a==b, it results to: "+(a<b|a==b));

	}
}