import java.lang.Math; // 192.168.0.254 - range extender 9v 6 mn 10 amper

class BinarySearch{
	public static void main(String[] args){
			int size = 10; // change to 1000
			int arr[] = new int[size];
			int target = 3;
			int start = 0;
			int end = size-1;
			int middle = (start+end)/2; // 0+
			for(int i=0; i<size; i++){
				arr[i]=i+1;
				System.out.print(arr[i]+ " ");
			}
			 // return the index I found the target in
				while(start!=end+1){
				if (arr[middle] == target){
					break;
				}
				if (arr[middle] < target){
					start = middle + 1;
				}
				if (arr[middle] > target){
					end = middle - 1;
				}
				if (start<=end){
					middle = (start+end)/2;
				}
			}
			System.out.println("\n"+"index: "+ middle);
			
			

				
			
	}
}