import java.io.IOException;

public class House extends Animal
{
    public void eat() throws IOException
    {
        System.out.println("House is eating!");throw new IOException();
    }
}
