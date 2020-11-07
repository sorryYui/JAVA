public class Test
{
    public static void main(String args[])
    {
        Color c = Color.RED;
        c.show();
        System.out.println(c);
        Color cc = Enum.valueOf(Color.class,"BLUE");
        System.out.println(cc);
    }
}
