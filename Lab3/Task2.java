//Lab3 - Task2
import java.util.Scanner;
class Task2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the unit consumed: ");
		int unit=input.nextInt(), bill, remain;
		
		if(unit<50){
			bill=50*10;
		}
		
		else if(unit>=50&&unit<=100){
			remain=unit-50;
			bill=(50*10)+(remain*15);
		}

		else if(unit>100&&unit<=200){
			remain=unit-100;
			bill=(50*10)+(50*15)+(remain*20);
		}

		else if(unit>200&&unit<=300){
			remain=unit-200;
			bill=(50*10)+(50*15)+(100*20)+(remain*25);
		}

		else{
			remain=unit-300;
			bill=(50*10)+(50*15)+(100*20)+(100*25)+(remain*30);
		}

		System.out.print("Your total calculated bill would be: "+bill);
		
	}
}