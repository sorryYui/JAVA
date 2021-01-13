import java.util.concurrent.atomic.AtomicInteger;

public class Test
{
    private static volatile int res = 0;
    private static final int THREAD_COUNT = 10;
    synchronized private static void add()
    {
        res++;
    }
    public static void main(String args[])
    {
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0;i < THREAD_COUNT;i++)
        {
            threads[i] = new Thread(() ->
            {
                for (int j = 0;j < 1000;j++)
                    add();
            });
            threads[i].start();
        }
        while (Thread.activeCount() > 2)
            Thread.yield();
        System.out.println(res);
    }
}
