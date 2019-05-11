class Student{
	String name, rollno, fname, dept;
	
	Student(String n, String f, String r, String d){
		this.name=n;
		this.rollno=r;
		this.fname=f;
		this.dept=d;
	}
	
	public void setName(String name){
		this.name= name;
	}
	public void setRollno(String rollno){
		this.rollno= rollno;
	}
	public void setFname(String fname){
		this.fname= fname;
	}
	public void setDept(String dept){
		this.dept= dept;
	}
	
	public void getStudent(){
		System.out.println();
		System.out.println("Student's Biodata:- ");
		System.out.println("Name of Student: "+name);
		System.out.println("Father Name: "+fname);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Department: "+dept);
	}
}