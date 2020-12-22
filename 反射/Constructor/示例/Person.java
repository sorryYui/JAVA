public class Person
{
    public Person()
    {
        System.out.println("公有、无参构造方法执行了。");
    }
    public Person(String name)
    {
        System.out.println(name);
    }
    public Person(String name,String age)
    {
        System.out.println("name:" + name + " age:"+age);
    }
    protected Person(boolean flag)
    {
        System.out.println("protected" + flag);
    }
    private Person(int age)
    {
        System.out.println("private age:" + age);
    }
}
