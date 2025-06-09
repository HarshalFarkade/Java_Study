package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListInteratre {
    public static void main(String[] args) {
        {/* how to check if list is empty or not using optional ?
        if not iterate through it*/}

//        List<String> list = Arrays.asList("Jai","Shree","Ram");
        List<String> list = null;
        Optional<List<String>> optional =Optional.ofNullable(list);
       optional.ifPresentOrElse(n->n.stream()
               .forEach(System.out::println),
               ()-> System.out.println("list is empty"));

    }
}
