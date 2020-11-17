import java.util.*;
public class TreeSetTest
{
    public static void main(String args[])
    {
        TreeSet<Person> set = new TreeSet<Person>();
        set.add(new Person("H",1));
        set.add(new Person("HH",2));
        set.add(new Person("HHH",3));
        set.add(new Person("HHHH",4));
        Iterator<Person> it = set.iterator();
        while (it.hasNext())
        {
            Person p = it.next();
            System.out.println(p.getName() + " " + p.getSroce());
        }
        set.remove(new Person("H",1));
        Iterator<Person> itNext = set.iterator();
        while (itNext.hasNext())
        {
            Person p = itNext.next();
            System.out.println(p.getName() + " " + p.getSroce());
        }
    }
}
