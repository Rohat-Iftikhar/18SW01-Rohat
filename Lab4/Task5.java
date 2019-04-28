//Lab4 - Task5
import java.util.Scanner;
class Task5{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int rows;

		System.out.print("Enter the number of elements for array: ");
		rows= input.nextInt();
		double arr[]=new double[rows];
		
		System.out.println("Input the elements of the array:- ");
		for(int x=0; x<rows; x++){
			System.out.print("Input the element "+(x+1)+": ");
			arr[x]= input.nextDouble();
		}
		double max= arr[0];
		
		System.out.println();
		System.out.print("The largest element in the array is: ");		
		for(int x=0; x<rows; x++){
			if(arr[x]>max){
				max=arr[x];
			}
		}
		System.out.print(max);
	}
}