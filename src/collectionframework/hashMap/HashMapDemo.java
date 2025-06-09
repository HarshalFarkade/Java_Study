package collectionframework.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Harshal");
        map.put(2,"Vrushabh");
        map.put(3,"Saurabh");

        System.out.println(map);

        String student =  map.get(2);
        System.out.println(student);

        Set<Integer> keys = map.keySet();
        for(int i: keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entires = map.entrySet();
        for(Map.Entry<Integer, String> entry  : entires){
//            System.out.println(entry.getKey()+" " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(3);
        System.out.println(map);
    }
}
