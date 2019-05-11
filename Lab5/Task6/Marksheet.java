class Marksheet{
	double OOP, DCLD, LAAG;
	double obtain, total= 300, percent;
	char grade;
	
	Marksheet(double o, double d, double l){
		this.OOP=o;
		this.DCLD=d;
		this.LAAG=l;
	}
	
	public double getObtain(){
		obtain=OOP+DCLD+LAAG;
		return obtain;
	}
	
	public double getPercent(){
		percent=(obtain/total)*100;
		return percent;
	}
	
	public char getGrade(){
		if(percent<100 && percent>=90)
			grade='A';

		else if(percent<90 && percent>=80)
			grade='B';

		else if(percent<80 && percent>=70)
			grade='C';

		else if(percent<70 && percent>=60)
			grade='D';

		else
			grade='F';
		
		return grade;
	}
	
	public void getMarksheet(){
		System.out.println();
		System.out.println("Details of your Marksheet:- ");
		System.out.println("Obtained Marks: "+obtain);
		System.out.println("Total Marks: 300.00");
		System.out.println("Percentage: "+percent+"%");
		System.out.println("Grade: "+grade);
	}
}