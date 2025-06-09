package linearSearchAlgorithm.stringsearch;

public class FirstNonRepeatingCharc {
    public static void main(String[] args) {
        String s="HARSHAl";
        System.out.println("First Non Repeating Char: "+firstNonRepeat(s));

    }

    static  char firstNonRepeat(String s){
        for (int i=0; i < s.length();  i++){
            char c=s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)){
                    return c;
            }
        }
        return '\0';
    }
}
