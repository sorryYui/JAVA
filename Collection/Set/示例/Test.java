import java.util.*;
public class Test
{
    public static void main(String args[])
    {
        HashSet<Person> set = new HashSet<Person>();
        set.add(new Person("H",1));
        set.add(new Person("HH",2));
        set.add(new Person("HHH",3));
        set.add(new Person("H",1));
        set.remove(new Person("H",1));
        set.add(new Person("H",4));
        set.add(new Person("HHHH",1));
        Iterator<Person> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next().toString());
    }
}
