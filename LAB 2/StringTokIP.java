import java.util.*;

class StringTokIP{
	public static void main(String[] args){
		StringTokenizer s = new StringTokenizer("192.0.0.1",".");
		//String word = "0";
		int count = 0;
		
		while(s.hasMoreTokens()){
			//if(s.nextToken()){
				System.out.println(s.nextToken());
			//}
			// s = s.nextToken(); // incrementing until there are NO more tokens
		}
	}
}
