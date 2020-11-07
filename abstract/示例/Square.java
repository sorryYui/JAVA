public class Square extends Shapes
{
    public Square(int width,int height)
    {
        super(width,height);
    }
    public double getArea()
    {
        return width * height;
    }
    public double getPerimeter()
    {
        return 2 * width + 2 * height;
    }
}
