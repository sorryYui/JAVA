import java.io.*;
public class Test
{
    public static void main(String args[])
    {
        System.out.println("主函数执行。");
        Parent p = new Son("HHH");
    }
    static
    {
        System.out.println("测试类静态代码块执行。");
    }
}
