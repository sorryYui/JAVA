import java.io.*;
import java.util.*;
public class ClassTest
{
    public static void main(String args[])
    {
        ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
        ArrayList<String> arrayString = new ArrayList<String>();
        if (arrayInteger.getClass().equals(arrayString.getClass()))
            System.out.println("class equals.");
    }
}
