package pkgg;

@FunctionalInterface
interface isAlphabeticc {
    boolean alphabetic(String s);
}

public class Alphabetic{
    public static void main(String[] args) {
        isAlphabeticc alphabeticc = (s) -> {
            for (int i=0; i<s.length(); i++) {
                if (!Character.isLetter(s.charAt(i))) {
                    return false;
                }
            }
            return true;
        };
        String str = "jan12";
        String strr = "jana";
        System.out.println(alphabeticc.alphabetic(str));
        System.out.println(alphabeticc.alphabetic(strr));
    }
}