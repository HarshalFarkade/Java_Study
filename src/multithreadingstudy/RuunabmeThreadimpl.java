package multithreadingstudy;

import streamJava8.programPractise.Employee;

public class RuunabmeThreadimpl implements Runnable{
    @Override
    public void run() {
        for (;;){
            System.out.println("world thread");
        }
    }
}
