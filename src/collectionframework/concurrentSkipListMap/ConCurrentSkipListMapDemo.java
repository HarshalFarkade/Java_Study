package collectionframework.concurrentSkipListMap;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConCurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,String> map = new ConcurrentSkipListMap<>();
        map.put(1,"Apple");
        map.put(2,"Grapes");
        map.put(3,"Orange");
        map.put(4,"WaterMelon");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry);
        };

        System.out.println("Key is Greater than 2:"+map.ceilingEntry(2));

//        descending  key order
        System.out.println(map.descendingMap());
        System.out.println(map.firstEntry());

    }
}
