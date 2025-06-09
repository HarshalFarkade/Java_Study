package superConstrcutorOverloading;

public class Student extends  Parent{

    private  String studentId;

    public Student(String name,int age,String studentId){
        super(name,age);
        this.studentId=studentId;
        System.out.println("Student constructor called");
    }

    @Override
    public void display(){
        super.display();
        System.out.println("studentID:"+studentId);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice",20,"S1234");
        student.display();
    }

}
