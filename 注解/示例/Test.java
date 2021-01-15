import java.lang.annotation.Annotation;
@Test(age = 0,name = "HHH")
public class Demo
{
    public static void main(String args[])
    {
        Class clazz = Demo.class;
        boolean hasAnnotation = clazz.isAnnotationPresent(Test.class);
        if (hasAnnotation) {
            Test annotation = (Test) clazz.getAnnotation(Test.class);
            System.out.println(annotation.age());
        }
    }
}
