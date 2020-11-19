public class Person
{
    public Person(String name,int idCard)
    {
        this.name = name;
        this.idCard = idCard;
    }
    public int getIdCard()
    {
        return idCard;
    }
    public String getName()
    {
        return name;
    }
    public boolean equals(Object o)
    {
        if (o == null || o.getClass() != getClass())
            return false;
        if (this == o)
            return true;
        Person p = (Person)o;
        return idCard == p.getIdCard();
    }
    public int hashCode()
    {
        return idCard;
    }
    private int idCard;
    private String name;
}
