public enum Color
{
    RED,BLUE;
    public int a;
    public void show()
    {
        System.out.println(a);
    }
    private Color()
    {
        a = 0;
    }
    private Color(int a)
    {
        this.a = a;
    }
}
