//Lab 2 - Task 5
/*Write java program to demonstrate the working of the Bitwise operators.*/
class Task5{
	public static void main(String args[]){
		int a=2,b=3;
		System.out.println("The given numbers are: "+"a="+a+" b="+b);
		int c=a>>>b;
		int w=4,x=5,y=6,z=7,v=8;

		System.out.println();
		System.out.println("Following are the workings of Bitwise Operators:-");
		System.out.println("For & operator:- ");
		System.out.println("If a&b, it results to: "+(a&b));
		System.out.println();

		System.out.println("For ^ operator:- ");
		System.out.println("If a^b, it results to: "+(a^b));
		System.out.println();

		System.out.println("For ~ operator:- ");
		System.out.println("If ~a, it results to: "+(~a));
		System.out.println();

		System.out.println("For | operator:- ");
		System.out.println("If a|b, it results to: "+(a|b));
		System.out.println();

		System.out.println("For << operator:- ");
		System.out.println("If a<<b, it results to: "+(a<<b));
		System.out.println();

		System.out.println("For >> operator:- ");
		System.out.println("If a>>b, it results to: "+(a>>b));
		System.out.println();

		System.out.println("For >>> operator:- ");
		System.out.println("If a>>>b, it results to: "+c);
		System.out.println();

		System.out.println("The given numbers for Bitwise Assignment Operators are: "+"v="+v+" w="+w+" x="+x+" y="+y+" z="+z);
		w|=7; x>>=2; y<<=1; w^=5; z&=4; v>>>=2;		
		System.out.println("For &= operator:- ");
		System.out.println("If z&=4, it results to: "+z);
		System.out.println();

		System.out.println("For |= operator:- ");
		System.out.println("If w|=7, it results to: "+w);
		System.out.println();

		System.out.println("For >>= operator:- ");
		System.out.println("If x>>=2, it results to: "+x);
		System.out.println();

		System.out.println("For <<= operator:- ");
		System.out.println("If y<<=1, it results to: "+y);
		System.out.println();

		System.out.println("For ^= operator:- ");
		System.out.println("If w^=5, it results to: "+w);
		System.out.println();

		System.out.println("For >>>= operator:- ");
		System.out.println("If v>>>=2, it results to: "+v);
		System.out.println();

	}
}