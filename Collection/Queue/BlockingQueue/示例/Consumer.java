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
               String date = super.pop();
               if (count.get() > 40)
                   break;
               System.out.println("Consuming " + date);
           }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    private static AtomicInteger count = new AtomicInteger(0);
}
