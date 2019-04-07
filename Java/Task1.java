class Task1{
	public static void main(String arg[]){
		
		String name="Rohat Iftikhar";
		byte rollno=01;
		short batch=18;
		int total=400;
		double obtained=358.94;
		double percent=(358.94/400.00)*100;
		char grade='A';
		boolean status=true;
		
		System.out.println("My name is "+name+".");
		System.out.println("My roll number is "+batch+"SW"+rollno+".");
		System.out.println();
		System.out.println("Following are my stats for Intermediate:-");
		System.out.println("My obtained marks were "+obtained+" out of "+total+".");
		System.out.println("My percentage was "+percent+"%.");
		System.out.println("My grade was "+grade+".");
		
		if(status==true){
			System.out.println("My status was Pass.");
		}
	}
}