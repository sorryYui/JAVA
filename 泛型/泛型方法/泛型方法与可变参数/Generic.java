public class Generic
{
    public<T> void show(T...obj)
    {
        for (T t : obj)
            System.out.println(t.toString());
    }
}
