public class Generic<T>
{
    public Generic(T key)
    {
        this.key = key;
    }
    public T getKey()
    {
        return key;
    }
    private T key;
}
