//Lab 2 - Task 4
/*Write java code that define radius for a circle and print the circumference, diameter and
area for the circle.*/
class Task4{
	public static void main(String args[]){
		
		double pi=3.14159, rad=35.23;
		double circum=2*pi*rad,
		area=pi*rad*rad, dia=rad*2;
		
		System.out.println("Following are the properties of the given circle:- ");		
		System.out.println("Radius: "+rad);
		System.out.println("Circumference: "+circum);
		System.out.println("Area: "+area);
		System.out.println("Diameter: "+dia);
	}
}