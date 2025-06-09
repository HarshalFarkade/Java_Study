package collectionframework.hashMap;

import java.util.HashMap;

public class HasMapWithEqualsMethod {

    public static void main(String[] args) {
        HashMap<Person ,String> map = new HashMap<>();

        Person p1 = new Person("Harshal",1);
        Person p2 = new Person("Vrushabh",2);
        Person p3 = new Person("Harshal",1);

        map.put(p1,"Engineer");
        map.put(p2,"Designer");
        map.put(p3,"Manager");

        System.out.println("HashMap Size"+ map.size());
        System.out.println("Value of P1"+ map.get(p1));
        System.out.println("Value of P2"+ map.get(p2));
    }


}

class Person{

private String name;
private Integer id;


   public Person(String name ,Integer id){
       this.name=name;
       this.id =id;
   }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

}
