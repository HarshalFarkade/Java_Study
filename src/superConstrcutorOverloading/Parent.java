package superConstrcutorOverloading;

public class Parent {

    private String name;
    private int age;

    public Parent(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("parent constructor called");
    }

    void  display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
