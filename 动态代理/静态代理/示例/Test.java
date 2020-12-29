public class Test
{
    public static void main(String args[])
    {
        Student student = new Student("张三");
        StudentProxy studentProxy = new StudentProxy(student);
        studentProxy.giveMoney();
    }
}
//结果：张三 has given money.
