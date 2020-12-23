import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class MethodTest
{
    public static void main(String args[]) throws
            IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException
    {
        Class clazz = Class.forName(getValue("classname"));
        Method method = clazz.getMethod(getValue("methodname"));
        Object o = clazz.getConstructor().newInstance();
        method.invoke(o,null);
    }
    public static String getValue(String key) throws
            IOException
    {
        Properties pro = new Properties();
        FileReader in = new FileReader("F:\\JavaCode\\project1\\src\\src.txt");
        pro.load(in);
        in.close();
        return pro.getProperty(key);
    }
}
