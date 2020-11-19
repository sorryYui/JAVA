import java.util.Map.*;
import java.util.*;
public class Test
{
    public static void main(String args[])
    {
        HashMap<Person,String> map = new HashMap<Person,String>();
        map.put(new Person("HH",1),"喜羊羊与灰太狼");
        map.put(new Person("H",2),"花园宝宝");
        map.put(new Person("HHH",3),"天线宝宝");
        map.put(new Person("HHHH",4),"猫和老鼠");
        print(map);
        map.remove(new Person("HH",1));
        print(map);
        String s = map.get(new Person("HHHHH",2));
        System.out.println(s);
    }
    public static void print(HashMap map)
    {
        Set<Entry<Person,String>> set = map.entrySet();
        //System.out.println(set.size());
        Iterator<Entry<Person,String>> it = set.iterator();
        while(it.hasNext())
        {
            Entry<Person,String> e = it.next();
            Person p = e.getKey();
            String s = e.getValue();
            System.out.println(p.getName() + " " + p.getIdCard() + " " + s);
        }
    }
}
