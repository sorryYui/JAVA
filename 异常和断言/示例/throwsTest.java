public class throwsTest
{
    public static void main(String args[])
    {
        Animal h = new House();
        try
        {
            h.eat();
        }catch(Exception e)
        {
            System.out.println("caught execption: " + e.getClass());
        }
    }
}
