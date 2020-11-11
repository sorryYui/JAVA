import java.io.*;
import java.util.*;
public class ThreadTest
{
    public static void main(String args[]) throws InterruptedException
    {
        for (int i = 0;i < 20;i++)
        {
            System.out.println("main" + i);
            Thread.sleep(100);
        }
    }
}
