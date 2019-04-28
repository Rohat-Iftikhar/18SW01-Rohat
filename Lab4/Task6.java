//Lab4 - Task6
class Task6{
	public static void main(String args[]){
		int value= Integer.parseInt(args[0]);
		int array[]={1,2,3,4,5,6,7,8,9,10};
		int x;
		
		for(x=0; x< array.length; x++){
			if(value==array[x]){
				System.out.println("The value is found in the array.");			
				System.out.println("And the position of the value is: "+x);
				break;
			}
		}
		
		if(x==array.length){
				System.out.println("The value is not found in the array.");
		}
	}
}