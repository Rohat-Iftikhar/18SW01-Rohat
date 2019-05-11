class Dog{
	String name, breed, age;

	Dog(String n, String b, String a){
		this.name=n;
		this.breed=b;
		this.age=a;
	}
	
	public void showDetails(){
		if(name.isEmpty() && breed.isEmpty() && age.isEmpty())
			System.out.println("The details are unavailable. ");
		
		else{
			System.out.println("The details of the dog are: ");
			System.out.println("Name: "+name);
			System.out.println("Breed: "+breed);
			System.out.println("Age: "+age);
		}
	}
}