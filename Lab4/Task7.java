//Lab4 - Task7
class Task7{
	public static void main(String args[]){
		int[] DATA={57,32,71,43,100};
		int temp=0, N=DATA.length;
		
		for(int K=1; K<N; K++){
			int PTR=0;
			while(PTR<N-K){
				if(DATA[PTR]>DATA[PTR+1]){
					temp=DATA[PTR];
					DATA[PTR]=DATA[PTR+1];
					DATA[PTR+1]=temp;
				}
				PTR=PTR+1;
			}
		}
		
		for(int K=0; K<N; K++){
			System.out.print(DATA[K]+" ");
		}
		
		
	}
}