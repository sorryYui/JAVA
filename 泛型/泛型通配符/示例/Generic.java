public class Generic<T>
{
    public Generic(T key)
    {
        this.key = key;
    }
    public void showKey(Generic<? extends T> generic)
    {
        System.out.println(generic.getClass());
        System.out.println(generic.getKey());
    }
    public T getKey()
    {
        return key;
    }
    private T key;
}
