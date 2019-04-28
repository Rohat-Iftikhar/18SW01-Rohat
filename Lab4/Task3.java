//Lab4 - Task3
import java.util.Scanner;
class Task3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int sum=0;
		
		System.out.print("Please enter an integer N: ");
		int N=input.nextInt();

		System.out.print("Sum of all integers till N is: ");
		for(int x=1; x<=N; x++){
			sum+=x;
		}
		System.out.print(sum);	
	}
}