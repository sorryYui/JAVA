import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuInvocationHandler<T> implements InvocationHandler
{
    T target;
    public StuInvocationHandler(T target)
    {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method,Object args[])
        throws Throwable
    {
        System.out.println("invoke the " + method.getName());
        return method.invoke(target,args);
    }
}
