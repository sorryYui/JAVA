import java.io.PrintWriter;
import java.io.FileWriter;
public class FileOperator
{
    public static void main(String args[])
    {
        try
        {
            PrintWriter pw = new PrintWriter(new FileWriter("F:\\data.txt"));
            pw.print(12);
            pw.print(" ");
            pw.println(3.5);
            pw.println(true);
            pw.println("你是弟弟!");
            pw.close();
        }catch(Exception e){};
    }
}
