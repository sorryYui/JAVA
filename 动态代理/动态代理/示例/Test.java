import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class Test
{
    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Student stu = new Student("zhangsan");
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(stu);
        Class proxyStu = Proxy.getProxyClass(Person.class.getClassLoader(),new Class[]{Person.class});
        Constructor<Person> constructor = proxyStu.getConstructor(InvocationHandler.class);
        Person person = constructor.newInstance(stuHandler);
        /*Person person = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class},stuHandler);*/
        person.giveMoney();
    }
}
