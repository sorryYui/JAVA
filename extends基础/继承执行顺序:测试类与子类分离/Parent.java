import java.io.*;
public class Parent
{
    public Parent()
    {
        System.out.println("父类无参构造函数执行。");
    }
    public Parent(String name)
    {
        this.name = name;
        System.out.println("父类有参构造函数执行。");
    }
    {
        System.out.println("父类非静态代码块执行。");
    }
    static
    {
        System.out.println("父类静态代码块执行。");
    }
    private String name;
}
