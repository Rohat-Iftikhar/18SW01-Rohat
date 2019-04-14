//Lab 2 - Task 1
/*Write a java program to demonstrate the concept of java runtime arguments. Input your
name and roll number and print it on the console.*/
class Task1{
	public static void main(String args[]){
		String fname=args[0],lname=args[1],rollno=args[2];
		System.out.println("The provided name is: "+fname+" "+lname);
		System.out.println("And their provided roll number is: "+rollno);
	}
}