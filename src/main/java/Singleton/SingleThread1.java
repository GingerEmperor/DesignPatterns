package Singleton;

public class SingleThread1 extends Thread {
    @Override
    public void run() {
        SingleClass singleClass=SingleClass.getInstance();
        for (int i=0;i<10;i++) {
            singleClass.number++;
            System.out.print(Thread.currentThread().getName() +" "+i+"= "+ singleClass.number);
            if(singleClass.number<10){
               // System.out.print("<10");
            }
            System.out.println();
        }
    }
}
