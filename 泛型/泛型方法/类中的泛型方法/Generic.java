public class Generic<T>
{
    public void show_1(T obj)
    {
        System.out.println(obj.toString());
    }
    public <E> void show_2(E obj)
    {
        System.out.println(obj.toString());
    }
    public <T> void show_3(T obj)
    {
        System.out.println(obj.toString());
    }
}
