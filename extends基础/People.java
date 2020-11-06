import java.io.*;
public class Test
{
    public static void main(String args[])
    {
        People p = new People();
        Student s = new Student();
        People sp = new Student();
        p.eat();
        s.eat();
        sp.eat();
        System.out.println(p.m);
        System.out.println(s.m);
        System.out.println(sp.m);
    }
}
