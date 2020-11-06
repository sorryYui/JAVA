public class Test
{
    public static void main(String args[])
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.setX(1.0);
        c2.setX(2.0);
        c1.setY(1.0);
        c2.setY(2.0);
        c1.setRadius(1.0);
        c2.setRadius(1.0);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
