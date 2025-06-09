package streamJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {

    public static void main(String[] args) {
//        filter();
        List<String> list = Arrays.asList("Harshal","Vrushabh","Harsh");
        Stream<String> filterStream = list.stream().filter(x->x.startsWith("H"));
        long res = filterStream.count();
        System.out.println(res);

//        map();
       Stream<String> mapStream= list.stream().map(String::toUpperCase);

//       sorted(); sorted(with custom comparison)
        Stream<String> sort =list.stream().sorted();
        Stream<String> sortedWthComparator  =  list.stream().sorted((a,b)->  a.length()-b.length() );

//        distinct();
        System.out.println(list.stream().filter(x->x.startsWith("H")).distinct().count());

//        limit();
        System.out.println(Stream.iterate(1,x -> x + 1).limit(100));

//        skip();
        System.out.println(Stream.iterate(1,x -> x +1).skip(10).limit(100));
    }
}
