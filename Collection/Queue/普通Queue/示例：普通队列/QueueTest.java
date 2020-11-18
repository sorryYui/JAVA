import java.util.*;
public class QueueTest
{
    public static void main(String args[])
    {
        LinkedList<Person> q = new LinkedList<Person>();
        q.offer(new Person("HHH",1));
        q.offer(new Person("H",2));
        q.offer(new Person("HH",3));
        Person p1 = q.poll();
        System.out.println(p1.getName() + " " + p1.getSroce());
        Person p2 = q.peek();
        System.out.println(p2.getName() + " " + p2.getSroce());
        Iterator<Person> it = q.iterator();
        while (it.hasNext())
        {
            Person p = it.next();
            System.out.println(p.getName() + " " + p.getSroce());
        }
    }
}
