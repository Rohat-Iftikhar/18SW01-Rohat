//Lab4 - Task4
import java.util.Scanner;
class Task4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int rows,cols;
		System.out.print("Enter the number of rows: ");
		rows= input.nextInt();
		System.out.print("Enter the number of columns: ");
		cols= input.nextInt();

		double arr1[][]=new double[rows][cols],arr2[][]=new double[rows][cols],sum[][]=new double[rows][cols];

		System.out.println();
		System.out.println("Input the elements of matrix A:- ");
		for(int x=0; x<rows; x++){
			for(int y=0; y<cols; y++){
				System.out.print("Input the matrix element a"+(x+1)+(y+1)+":- ");
				arr1[x][y]= input.nextDouble();
			}
		}
		
		System.out.println();
		System.out.println("Input the elements of matrix B:- ");
		for(int x=0; x<rows; x++){
			for(int y=0; y<cols; y++){
				System.out.print("Input the matrix element b"+(x+1)+(y+1)+":- ");
				arr2[x][y]= input.nextDouble();
			}
		}

		for(int x=0; x<rows; x++){
			for(int y=0; y<cols; y++){
				sum[x][y]=arr1[x][y]+arr2[x][y];
			}
		}
		
		System.out.println();
		System.out.println("The sum of both the matrices is:- ");
		for(int x=0; x<rows; x++){
			for(int y=0; y<cols; y++){
				System.out.print(sum[x][y]+" ");
			}
			System.out.println();
		}

	}
}