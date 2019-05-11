class BioData{
	Student ob1;
	Marksheet ob2;
	
	BioData(Student ob1, Marksheet ob2){
		this.ob1=ob1;
		this.ob2=ob2;
	}
	public void setCalculate(){
		ob2.getObtain();
		ob2.getPercent();
		ob2.getGrade();
	}
	
	public void createStudentResult(){
		ob1.getStudent();
		ob2.getMarksheet();
	}
}