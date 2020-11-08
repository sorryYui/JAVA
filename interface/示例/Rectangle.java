public class Rectangle implements Comparable<Rectangle>
{
    public Rectangle(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
    public int size()
    {
        return length * width;
    }
    public int compare(Rectangle p)
    {
        return p.size() - this.size();
    }
    private int length;
    private int width;
}
