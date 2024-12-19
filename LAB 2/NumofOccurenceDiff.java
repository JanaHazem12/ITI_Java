class NumofOccurenceDiff{
	public static void main(String[] args){
		String s = "ITI develops people and ITI house of developers and ITI for people";
		String word = "ITI";
		int count = 0;
		//int i = 0;
		
		while(s.indexOf(word)!=-1){
			//s.indexOf(word);
			count++;
			int size = word.length();
			s = s.substring(s.indexOf(word)+size);
		}
		System.out.print("Number of Occurunces of "+word+" is: "+count);
	}
}
