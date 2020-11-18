import java.util.*;
public class PriorityQueueTest
{
    public static void main(String args[])
    {
        PriorityQueue<Person> q = new PriorityQueue<Person>();
        q.offer(new Person("H",1));
        q.offer(new Person("HH",2));
        q.offer(new Person("HHH",3));
        q.offer(new Person("HHHH",4));
        Iterator<Person> it = q.iterator();
        while (it.hasNext())
        {
            Person p = it.next();
            System.out.println(p.getName() + " " + p.getSroce());
        }
       while(!q.isEmpty())
       {
           Person p = q.poll();
           System.out.println(p.getName() + " " + p.getSroce());
       }
    }
}
