import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class ConstructTest
{
    public static void main(String args[])
            throws ClassNotFoundException,NoSuchMethodException,InstantiationException,
            IllegalAccessException,InvocationTargetException
    {
        Class clazz = Class.forName("Person");
        System.out.println("\n---------");
        Constructor []constructors = clazz.getConstructors();
        for (Constructor constructor : constructors)
            System.out.print(constructor + " ");
        System.out.println("\n---------");
        Constructor []constructors1 = clazz.getDeclaredConstructors();
        for (Constructor constructor:constructors1)
            System.out.print(constructor + " ");
        System.out.println("\n----------");
        Constructor constructor = clazz.getConstructor(null);
        System.out.println("constructor = " + constructor);
        Object o = constructor.newInstance();
        System.out.println("Object:" + o);
        System.out.println("\n----------");
        Constructor con = clazz.getDeclaredConstructor(String.class);
        System.out.println(con);
        con.setAccessible(true);
        o = con.newInstance("man");
    }
}
