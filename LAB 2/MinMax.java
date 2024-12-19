import java.lang.Math;

class MinMax{
	public static void main(String[] args){
			int size = 10; // change to 1000
			int arr[] = new int[size];
			int max = 0;
			int min = 999999;
			for(int i=0; i<size; i++){
				arr[i]=(int)(Math.random()*size+1);
				System.out.print(arr[i]+" ");
			}
			long startTime = System.nanoTime();
			for(int j=0; j<size; j++){ // 2,3,4,5
				if(arr[j]<min){ 
					min=arr[j];
				}
				if(arr[j]>max){
					max=arr[j];
				}
			}
			long endTime = System.nanoTime();
			long TimeTaken = endTime - startTime;
			

			
			System.out.println();
			System.out.println("MAX: "+ max);
			System.out.println("MIN: "+ min);
			System.out.println("TIME TAKEN: "+TimeTaken);

			//return arr;
			
	}
}