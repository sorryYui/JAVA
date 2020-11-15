import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkTest
{
    public static void main(String args[])
    {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0;i < 10;i++)
            list.add(i);
        for (int i = 0;i < 10;i++)
            list.add(0,i);
        for (int i = 0;i < 10;i++)
            list.remove(0);
        list.remove(new Integer(0));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
