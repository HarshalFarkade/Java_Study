package polymorphism.completime;

public class Adder {

    static int add(int a , int b){
        System.out.println("int data type");
        return  a+b;
    }

    static double add(double a, double b){
        System.out.println("double data type");
        return a + b;
    }
}
