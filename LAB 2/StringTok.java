import java.util.*;

class StringTok{
	public static void main(String[] args){
		StringTokenizer s = new StringTokenizer("ITI develops people and ITI house of developers and ITI for people");
		String word = "ITI";
		int count = 0;
		
		while(s.hasMoreTokens()){
			if(s.nextToken().equals(word)){
				//System.out.print("here");
				count++;
			}
			// s = s.nextToken(); // incrementing until there are NO more tokens
		}
		System.out.print("Number of Occurunces of "+word+" is: "+count);
	}
}
