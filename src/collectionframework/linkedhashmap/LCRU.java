package collectionframework.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LCRU<k,v> extends LinkedHashMap<k,v> {

    private int capacity;

    public LCRU(int capacity){
        super(capacity,0.7f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LCRU<String,Integer> studentMap = new LCRU<>(3);

        studentMap.put("Harshal",98);
        studentMap.put("Vrushabh",77);
        studentMap.put("Saurabh",88);
        studentMap.put("Ankit",100);

        System.out.println(studentMap);
    }
}
