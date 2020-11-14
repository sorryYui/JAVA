import java.util.*;
import java.io.*;
public class Test
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("12");
        list.add("123");
        list.removeIf(s->s.equals("123"));
        list.forEach(s->System.out.println(s));
    }
}
