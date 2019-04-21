//Lab3- Task4
class Task4{
	public static void main(String args[]){
		int num1=Integer.parseInt(args[0]),num2=Integer.parseInt(args[1]);
		char op=args[2].charAt(0);
		double divide=num1/num2;
		
		if(op==43){
			System.out.println("The 1st number is: "+num1);
			System.out.println("The 2nd number is: "+num2);
			System.out.println("And their addition(+) is: "+(num1+num2));
		}
		
		else if(op==45){
			System.out.println("The 1st number is: "+num1);
			System.out.println("The 2nd number is: "+num2);
			System.out.println("And their subtraction(-) is: "+(num1-num2));
		}

		else if(op==42){
			System.out.println("The 1st number is: "+num1);
			System.out.println("The 2nd number is: "+num2);
			System.out.println("And their multiplication(*) is: "+(num1*num2));
		}

		else if(op==47){
			System.out.println("The 1st number is: "+num1);
			System.out.println("The 2nd number is: "+num2);
			System.out.println("And their division(/) is: "+divide);
		}
		
		else{
			System.out.println("Please enter a proper operation.");
		}
	}
}