package streamJava8.programPractise;

import java.util.stream.Collectors;

public class RemoveVowels {

    /*  Remove all vowels from a string ?*/
    public static void main(String[]args){
        String vols="HelloJavaDeveloper";

     String collect =   vols.chars()
                .filter(ch-> !"aeiouAEIOU".contains( String.valueOf((char) ch)))
                .mapToObj(ch -> String.valueOf((char)ch))
                .collect(Collectors.joining());

        System.out.println(collect);
    }
}
