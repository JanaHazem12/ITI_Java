

@FunctionalInterface
interface BetterStringg{
     boolean isBetter(String str1, String str2);   
}
public class Main {
        public static String StringCheck(String str, String strr, BetterStringg bs){
           if(bs.isBetter(str, strr)){
            //System.out.println(bs.isBetter(str, strr));
            return str;
           }
           else{
            //System.out.println(bs.isBetter(str, strr));
            return strr;
           }
        }
   
    public static void main(String[] args){
        String str1 = "janaaaaaa";
        String str2 = "malakk";
        //String output = StringCheck(str1,str2,(s1, s2) -> str1.length() > str2.length());
        //BetterStringg longer = ;
        //System.out.println("STR 1 = " + str1.length() + " STR 2 = "+ str2.length());
        //System.out.println(output);
        System.out.println("Better String => "+StringCheck(str1, str2, (s1, s2) -> s1.length() > s2.length()));
    }
}
