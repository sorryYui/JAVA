import java.io.*;
import java.util.*;
public class ThreadTest
{
    public static void main(String args[])
    {
        Thread th_1 = new _Thread("Thread_1");
        Thread th_2 = new _Thread("Thread_2");
        th_1.start();
        th_2.start();
    }
}
