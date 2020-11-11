import java.io.*;
import java.util.*;
public class _Thread extends Thread
{
    public _Thread (String name)
    {
        super(name);
        this.name = name;
    }
    public void run()
    {
        for (int i = 0;i < 20;i++)
        {
            System.out.println(name + " ran " + i + " times.");
            /*try {
                Thread.sleep(1000);
                Thread.interrupted();
            }catch(InterruptedException e){};*/
        }
    }
    private String name;
}
