import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
public class MethodTest
{
    public static void main(String args[])
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        List<String> list = new ArrayList<>();
        list.add("H");
        list.add("HH");
        Class clazz = list.getClass();
        Method method = clazz.getMethod("add",Object.class);
        method.invoke((Object)list,100);
        for (Object o : list)
            System.out.println(o);
    }
}
