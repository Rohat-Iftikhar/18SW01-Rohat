import java.util.Scanner;
class TaskClass{
	int array[]=new int[100];
	int even=0, odd=0;
	Scanner input=new Scanner(System.in);
	
	public void populateArray(){
		System.out.print("Please enter the number of values you want to input: ");
		int a=input.nextInt();
		
		System.out.println("Please enter the values: ");
		for(int x=0; x<a; x++){
			System.out.print("Input the value number "+(x+1)+": ");
			array[x]=input.nextInt();
			
			if(array[x]%2==0){
				even++;
			}
			
			else{
				odd++;
			}
		}
	}
	
	public void printArray(){
		System.out.println("The number of even numbers entered are: "+even);
		System.out.println("And the number of odd numbers entered are: "+odd);
	}
}