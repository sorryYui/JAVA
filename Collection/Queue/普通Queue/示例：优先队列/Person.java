class Person implements Comparable<Person>
{
    public Person(String name,int sroce)
    {
        this.name = name;
        this.sroce = sroce;
    }
    public int getSroce()
    {
        return sroce;
    }
    public String getName()
    {
        return name;
    }
    public int compareTo(Person p)
    {
        return this.sroce - p.getSroce();
    }
    private int sroce;
    private String name;
}
