import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
public class FileOperator
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream input = new FileInputStream("F:\\input.txt");
            DataInputStream dataInput = new DataInputStream(new BufferedInputStream(input));
            FileOutputStream output = new FileOutputStream("F:\\output.txt");
            DataOutputStream  dataOutput = new DataOutputStream(new BufferedOutputStream(output));
            byte []b = new byte[50];
            dataInput.read(b);
            dataOutput.write(b,0,50);
            dataInput.close();
            dataOutput.close();
        }catch(IOException e){};
    }
}
