package collectionframework.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("Harshal",100);
        map.put("Vrushabh",100);
        map.put("Saurabh",100);
        map.put("Pavan",100);

        System.out.println("map size: "+ map.size());
        System.out.println(map.get("Pavan"));
        map.remove("Saurabh",100);
        System.out.println(map);
    }
}
