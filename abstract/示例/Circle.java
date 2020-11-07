public class Circle extends Shapes
{
    public double r;
    public Circle(int width)
    {
        super(width,width);
        r = (double)width / 2;
    }
    public double getArea()
    {
        return 3.14 * r * r;
    }
    public double getPerimeter()
    {
        return 2 * 3.14 * r;
    }
}
