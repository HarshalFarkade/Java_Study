package constructorOverloading;

public class Student {

    private String name;
    private int age;
    private String studentId;

//    default constructor  1
    public Student(){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
    }

//    constructor 2  with name and age
    public  Student(String name , int age){
        this.name=name;
        this.age=age;
    }

//    constructor 3  with name , age ,studentId
    public Student(String name,int age,String studentId){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
    }

    public void  display(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Student Id:"+ studentId);
        System.out.println("------------");
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Jhon",20);
        Student student3 = new Student("jhon",20,"s1234");
        student1.display();
        student2.display();
        student3.display();
    }

}
