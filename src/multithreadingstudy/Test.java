package multithreadingstudy;

public class Test {
    public static void main(String[] args) {
//        thread by extends THread class
//        World world= new World();
//        world.start();
//        for (;;){
//            System.out.println("hello");
//        }
//        thread by Runnable interface

        RuunabmeThreadimpl run = new RuunabmeThreadimpl();
        Thread t1 = new Thread(run);
        t1.start();
        for (;;){
            System.out.println("hello");
        }
    }
}
