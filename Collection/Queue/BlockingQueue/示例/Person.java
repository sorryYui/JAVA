import java.util.concurrent.*;
public class Person
{
    private static LinkedBlockingQueue<String> q
            = new LinkedBlockingQueue(10);
    public boolean push(String s) throws InterruptedException
    {
        return q.offer(s,1,TimeUnit.SECONDS);
    }
    public String pop() throws InterruptedException
    {
        return q.take();
    }
}
