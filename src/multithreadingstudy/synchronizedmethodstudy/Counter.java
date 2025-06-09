package multithreadingstudy.synchronizedmethodstudy;

public class Counter {
    private int count =0;

//    synchronized method so that at time only 1 user thread shared the resources
    public synchronized void  increment(){
         count++;
    }

    public  int getCount(){
        return count;
    }
}
