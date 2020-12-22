public class Person
{
    public Person()
    {

    }
    public void show1(String s)
    {
        System.out.println("The public method is called,and The var is" + s);
    }
    protected void show2()
    {
        System.out.println("The protected method is called");
    }
    void show3()
    {
        System.out.println("The default method is called.");
    }
    private String show4(int age)
    {
        System.out.println("The private method is called");
        return " " + age + " ";
    }
}
