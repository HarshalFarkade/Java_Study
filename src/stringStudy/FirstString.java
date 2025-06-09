package stringStudy;

public class FirstString {
    public static void main(String[] args){
        String a = new String("Ram");
        String b = new String("Ram");
        String c = "Ram";
        String d = "Ram";

//        compare  value of string
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
//        -->  compare location
        System.out.println(a==b);
        System.out.println(c==d);


    }
}
