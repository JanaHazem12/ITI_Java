class TwoInputs{
	public static void main(String[] args){ // {"jana", "222"}
		boolean flag = true;
		if(args.length > 2){
			System.out.println("MORE THAN 2 INPUTS");
			return;
		}
		/*for(int i=0; i<args[1].length(); i++){
			if(!(Character.isDigit(args[1].charAt(i)))){ 
				flag = false;
				break;
			}
		}*/
		//if(flag==true){
			try{
			int x = Integer.parseInt(args[1]);
			if(x<0){
				throw new RuntimeException("NEGATIVE NUMBER INSERTED");
				//System.out.println("NEGATIVE NUMBER INSERTED");
			}
			for(int j=0; j<x; j++){
				System.out.println(args[0]);
			}
			}
		//}
		//else{
		catch(NumberFormatException n){
				System.out.println("NOT AN INT");	
		}
		catch(RuntimeException re){
			System.out.println(re.getMessage());
		}
	}
		

}