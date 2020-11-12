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
    public void showKey(Generic<? extends T> generic)
    {
        System.out.println(generic.getKey());
    }
    public <T> T showKeyName(Generic<? extends T> generic)
    {
        T ret = generic.getKey();
        System.out.println(ret);
        return ret;
    }
    private T key;
}
