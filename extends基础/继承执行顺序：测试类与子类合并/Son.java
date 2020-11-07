import java.io.*;
public class Son extends Parent
{
    public Son()
    {
        System.out.println("子类无参构造函数执行。");
    }
    public Son(String name)
    {
        super(name);
        this.name = name;
        System.out.println("子类有参构造函数执行。");
    }
    {
        System.out.println("子类非静态代码块执行。");
    }
    static
    {
        System.out.println("子类静态代码块执行。");
    }
    public static void main(String args[])
    {
        System.out.println("主函数执行。");
        Parent p = new Son("HHH");
    }
    private String name;
}
