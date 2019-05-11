import java.util.Scanner;
class DogTest{
	public static void main(String args[]){
		String name, breed, age;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter the name of the dog: ");
		name=input.nextLine();

		System.out.print("Please enter the breed: ");
		breed=input.nextLine();

		System.out.print("Please enter the age: ");
		age=input.nextLine();

		System.out.println();
		
		Dog ob=new Dog(name,breed,age);
		ob.showDetails();
	}
}