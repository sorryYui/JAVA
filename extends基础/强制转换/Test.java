public class Test
{
    public static void main(String args[])
    {
        Parent p = new Parent("HH");
        Son s = new Son("HHH");
        //s = (Son)p;
        //System.out.println(s.name);
       // System.put.println(s.year);
        p = (Parent)s;
        System.out.println(p.name);
    }
}
