public class Test
{
    public static void main(String args[])
    {
        Shapes sq = new Square(25,25);
        Shapes cir = new Circle(25);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        System.out.println(cir.getArea());
        System.out.println(cir.getPerimeter());
    }
}
