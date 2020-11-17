import java.util.*;
public class HashsetTest_1
{
    public static void main(String args[])
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0;i < 10;i++)
            set.add(i);
        set.add(0);
        set.remove(0);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
