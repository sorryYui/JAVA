import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Consumer extends Person implements Runnable
{
    public Consumer()
    {

    }
    public void run()
    {
        try
        {
            while (true)
            {
                Thread.sleep(1000);
                if (count.get() >= 40)
                    break;
                String date;
                while ((date = super.pop()) == null);
                count.incrementAndGet();
                //System.out.println(count.get());
                System.out.println("Consuming " + date);
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    private static AtomicInteger count = new AtomicInteger(0);
}
