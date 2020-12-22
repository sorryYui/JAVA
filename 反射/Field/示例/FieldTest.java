import java.lang.reflect.*;
public class FieldTest
{
    public static void main(String args[])
            throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException
            , InvocationTargetException, InstantiationException, IllegalAccessException
    {
        Class clazz = Class.forName("Person");
        System.out.println("---------");
        Field []fields = clazz.getFields();
        for (Field field : fields)
            System.out.println(field);
        System.out.println("---------");
        fields = clazz.getDeclaredFields();
        for (Field field : fields)
            System.out.println(field);
        System.out.println("---------");
        Field field = clazz.getField("name");
        Object o = clazz.getConstructor().newInstance(null);
        field.set(o,"HHHH");
        Person p = (Person)o;
        System.out.println(p.name);
        System.out.println("-------");
        field = clazz.getDeclaredField("ip");
        System.out.println(field);
        field.setAccessible(true);
        field.set(o,"192.168.128");
        System.out.println(p.toString());
    }
}
