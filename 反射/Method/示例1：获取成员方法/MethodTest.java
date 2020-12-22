import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class MethodTest
{
    public static void main(String args[])
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException
            , InstantiationException, InvocationTargetException
    {
        Class clazz = Class.forName("Person");
        System.out.println("-------");
        Method[] methods = clazz.getMethods();
        for (Method method:methods)
            System.out.println(method);
        System.out.println("--------");
        methods = clazz.getDeclaredMethods();
        for (Method method:methods)
            System.out.println(method);
        System.out.println("------");
        Method method = clazz.getMethod("show1",String.class);
        System.out.println(method);
        Object o = clazz.getConstructor().newInstance();
        method.invoke(o,"HHHHH");
        System.out.println("-------");
        method = clazz.getDeclaredMethod("show4",int.class);
        method.setAccessible(true);
        Object result = method.invoke(o,20);
        System.out.println(result);
    }
}
