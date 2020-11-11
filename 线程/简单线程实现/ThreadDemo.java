import java.util.*;
import java.io.*;
public class ThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Thread  running.");
    }
    public static void main(String args[])
    {
        ThreadDemo th = new ThreadDemo();
        th.start();
    }
}
