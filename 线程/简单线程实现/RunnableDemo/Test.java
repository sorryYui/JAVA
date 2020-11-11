public class Test
{
    public static void main(String args[])
    {
        Thread th = new Thread(new ThreadDemo());
        th.start();
    }
}
