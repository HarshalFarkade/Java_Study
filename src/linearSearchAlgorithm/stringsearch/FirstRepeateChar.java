package linearSearchAlgorithm.stringsearch;

public class FirstRepeateChar {
    public static void main(String[] args) {
        String s  ="Absbsc";
        System.out.println(firstRepeateChar(s.toLowerCase()));
    }

    static char firstRepeateChar(String sr){
        boolean[] seen  = new boolean[256];

        for (char c: sr.toCharArray()){
            if (seen[c])
                return c;
                seen[c]=true;

        }
        return '\0';
    }
}
