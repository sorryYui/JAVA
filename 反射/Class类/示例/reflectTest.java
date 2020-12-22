public class reflectTest
{
    public static void main(String arsg[])
            throws ClassNotFoundException
    {
        Class clazz = Class.forName("Person");
        System.out.println(clazz);
    }
}
