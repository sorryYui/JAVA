public class Person
{
    public Person()
    {

    }
    public Person(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int hashCode()
    {
        return name.hashCode() + id;
    }
    public boolean equals(Object p)
    {
        if (this == p)
            return true;
        else if (p == null || p.getClass() != this.getClass())
            return false;
        Person tmp = (Person)p;
        return tmp.getId() == id && tmp.getName().compareTo(name) == 0;
    }
    public String toString()
    {
        return name + " " + id;
    }
    private int id;
    private String name;
}
