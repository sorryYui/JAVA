public class Son extends Parent
{
    public String name;
    public int year;
    public Son()
    {
        year = 0;
    }
    public Son(String name)
    {
        super(name);
        this.name = name;
    }
}
