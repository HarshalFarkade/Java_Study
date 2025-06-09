package multithreadingstudy.synchronizedmethodstudy;

public class ThreadTest extends Thread{

    private Counter counter;

    public ThreadTest(Counter counter){
        this.counter=counter;
    }

    @Override
    public  void run() {
        for (int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
