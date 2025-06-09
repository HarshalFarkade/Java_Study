package streamJava8.programPractise;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWordsInCount {
    public static void main(String[] args) {
        {/* how to find duplicate elements inserting and print it occurrence */}
            String[] ls =  {"Jai","Shree","Ram","Jai","Shree"};
        List<String > list= Arrays.asList(ls);
//        this will print occurrence of words
        System.out.println(list.stream().collect(Collectors.groupingBy(x-> x,Collectors.counting())));

        Map<String,Long> listDuplicate = list.stream().collect(Collectors.groupingBy(n-> n,Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("duplicate words: "+listDuplicate);

    }
}
