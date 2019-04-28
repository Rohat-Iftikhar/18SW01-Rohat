//Lab4 - Task1
class Task1{
	public static void main(String args[]){
		for(int x=1; x<=5; x++){ //Loop for rows
			for(int y=1; y<=x; y++){ //Loop for columns
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int x=5; x>=1; x--){ //Loop for rows
			for(int y=1; y<=x; y++){ //Loop for columns
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		for(int a=0; a<5; a++){ //Loop for rows
			for(int b=0; b<=4-a; b++){ //Loop for inverted triangle of space
				System.out.print(" ");
			}

			for(int c=5-a; c<=5; c++){ //Loop for bigger half of * triangle
				System.out.print("*");
			}

			for(int d=5-a; d<5; d++){ //Loop for smaller half of * triangle
				System.out.print("*");
			}

			for(int e=0; e<5-a; e++){ //Loop for the inverted triangle of space after triangle of *
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}