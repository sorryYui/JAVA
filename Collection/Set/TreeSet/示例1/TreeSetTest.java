import java.util.*;
import java.io.*;
public class TreeSetTest
{
    public static void main(String args[])
    {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 10;i >= 0;i--)
            set.add(i);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        set.remove(9);
        Iterator<Integer> itNext = set.iterator();
        while (itNext.hasNext())
            System.out.println(itNext.next());
    }
}
