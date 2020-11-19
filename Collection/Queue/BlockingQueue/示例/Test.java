import java.util.concurrent.*;
public class Test
{
    public static void main(String args[])
    {
        BlockingQueue<String> q = new LinkedBlockingQueue<String>(10);
        Producer p1 = new Producer();
        Producer p2 = new Producer();
        Consumer c1 = new Consumer();
        Consumer c2 = new Consumer();
        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(p2);
        Thread thread3 = new Thread(c1);
        Thread thread4 = new Thread(c2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
