import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Producer extends Person implements Runnable
{
    public Producer()
    {

    }
    public void run()
    {
        try {
            while (true)
            {
                Thread.sleep(1000);
                String date = "date " + count.incrementAndGet();
                System.out.println("producing " + date);
                while(!super.push(date));
                if (count.get() >= 40)
                    break;
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    private static AtomicInteger count = new AtomicInteger(0);
}
