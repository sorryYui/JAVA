public class Student implements Person
{
    private String name;
    public Student(String name)
    {
        this.name = name;
    }
    public void giveMoney()
    {
        System.out.println(name + " has given money.");
    }
}
