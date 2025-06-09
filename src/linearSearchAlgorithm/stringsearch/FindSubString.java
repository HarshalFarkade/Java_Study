package linearSearchAlgorithm.stringsearch;

public class FindSubString {
    /* find the substring without using .contains() method */
    public static void main(String[] args) {
        String s="absced";
        String m="bsc";

        System.out.println(findSubStrings(s,m));

    }

    static int findSubStrings(String str,String sub){
        int n =str.length();
        int m = sub.length();
        for (int i = 0; i<= n -m;i++){
            if (str.substring(i,i+m).equals(sub))
                return i;
        }
        return -1;
    }
}
