package multithreadingstudy.synchronizedmethodstudy;

public class Test {
    public static void main(String[] args) {
         Counter counter = new Counter();
         ThreadTest t1 = new ThreadTest(counter);
         ThreadTest t2  = new ThreadTest(counter);
         t1.start();
         t2.start();
         try{
             t1.join();
             t2.join();
         }catch (Exception e){

             System.out.println(e.getMessage());
         }
        System.out.println("Count:"+counter.getCount());

    }
}
