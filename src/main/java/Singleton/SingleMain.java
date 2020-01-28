package Singleton;

public class SingleMain {
    public static void main(String[] args) {

        SingleThread1 singleThread1=new SingleThread1();
        SingleThread1 singleThread2=new SingleThread1();

        singleThread1.start();
        singleThread2.start();
    }
}
