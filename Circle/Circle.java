
public class Circle
{
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius >= 0.0 ? radius : 0.0;
    }
    public double getPerimeter()
    {
        return 2 * 3.14 * radius;
    }
    public double getArea()
    {
        return 3.14 * radius * radius;
    }
    public String toString()
    {
        return "Circle : Centre = (" + getX() + "," + getY() + ")" +
                ";Radius = " + getRadius() + ".";
    }
    private double x;
    private double y;
    private double radius;
}
