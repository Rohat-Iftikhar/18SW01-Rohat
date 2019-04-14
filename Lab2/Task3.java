//Lab 2 - Task 3
/*Write java program that Declares 5 floating numbers and print their total sum and
average.*/
class Task3{
	public static void main(String[] args){
		double num1=12.21,num2=32.23,num3=9.42,num4=15.85,num5=2.53;
		double sum=num1+num2+num3+num4+num5;
		double avg=sum/5;
		
		System.out.println("The given numbers are:-");
		System.out.println(num1+"  "+num2+"  "+num3+"  "+num4+"  "+num5);
		System.out.println("Their sum is: "+sum);
		System.out.println("And their average is: "+avg);
	}
}