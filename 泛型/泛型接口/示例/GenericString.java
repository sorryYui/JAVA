import java.util.*;
public class GenericString implements Generic<String>
{
    public String next()
    {
        Random r = new Random();
        return fruits[r.nextInt(3)];
    }
    private String fruits[] = new String[]{"a","b","w"};
}
