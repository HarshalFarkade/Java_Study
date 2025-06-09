package collectionframework.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer>linkedHashMap = new LinkedHashMap<>(11, 0.5F,true);

        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Apple",13);
        linkedHashMap.put("Guava",12);

        linkedHashMap.get("Apple");

        for(Map.Entry<String,Integer> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        HashMap<String,Integer> map = new HashMap<>();
        LinkedHashMap   map3 = new LinkedHashMap<>(map);

        map.put("vipul",1);
        map.put("Harsh",2);
        map.put("Vrushabh",3);

        Integer val= map.getOrDefault("vipul", 0);
        System.out.println(val);
    }
}
