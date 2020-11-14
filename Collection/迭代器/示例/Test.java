import java.util.*;
import java.io.*;
public class Test
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList();
        list.add("!!!");
        list.add("111");
        list.add("HHH");
        Iterator<String> it = list.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
        for (String str : list)
            System.out.print(str + " ");
    }
}
