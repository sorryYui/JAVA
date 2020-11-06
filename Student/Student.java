public class Student
{
    public Student(String name)
    {
        this.name = name;
        count++;
    }
    public String getName()
    {
        return name;
    }
    public static int getCount()
    {
        return count;
    }
    private String name;
    private static int count = 0;
}
