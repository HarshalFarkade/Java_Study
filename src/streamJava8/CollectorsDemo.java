package streamJava8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
//        toList() methods
       List<String> names = Arrays.asList("Harsh","Harshal","vedant","vrushabh","hemanshu");
        System.out.println(names.
                stream().
                filter(name->name.toLowerCase().startsWith("h")).collect(Collectors.toList()));


//        toSet() methods
        List<Integer> nums = Arrays.asList(1,2,3,2,3,4,5);
        System.out.println(nums.stream().collect(Collectors.toSet()));

//        collecting to specific collection
        ArrayDeque<String>  deque =names.stream().collect(Collectors.toCollection(()-> new ArrayDeque<>()));
        System.out.println(deque);

        // Joining string
      String concatenames = names.stream().map(String::toUpperCase).collect(Collectors.joining(" :-> "));
        System.out.println(concatenames);

        // 5. Summarizing Data
        // Generates statistical summary (count, sum, min, average, max)

        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        // 6. Calculating Averages
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + average);

        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // 9. Partitioning Elements
        //  Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        // 11. toMap
//        example:1 names by length collect
         List<String> list= Arrays.asList("Aman","bob","jhon","harsh");
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));

//        example :2  count words occurrence
            String sentance = "Java is good java is best";
        System.out.println(Arrays.stream(sentance.toLowerCase().split(" ")).collect(Collectors.groupingBy(x -> x,Collectors.counting())));

//         example :3 parting even and odd number
            List<Integer> integers = Arrays.asList(1,4,2,7,8,10,13);
        System.out.println(integers.stream().collect(Collectors.partitioningBy(x-> x%2==0)));

        // Example 6:
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));;

    }
}
