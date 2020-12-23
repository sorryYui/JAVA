import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest
{
    public static void main(String args[])
            throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException
    {
        Class clazz = Class.forName("Person");
        Method method = clazz.getMethod("main",String[].class);
        method.invoke(null,(Object)(new String[]{"a","b","c"}));
    }
}
