

class NumofOccurence{
	public static void main(String[] args){
		String s = "ITI develops people and ITI house of developers and ITI for people";
		String word = "ITI";
		String regex = "[\\s]";
		String[] arr = s.split(regex);
		int count = 0;
		int i = 0;
		
		while(i<arr.length){
			if(arr[i].equals(word)){
				count++;
				i++;
			}
			else{
				i++;
			}
		}
		System.out.print("Number of Occurunces of "+word+" is: "+count);
	}
}
