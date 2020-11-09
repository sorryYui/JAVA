import java.io.IOException;
import java.io.RandomAccessFile;
public class FileOperatorPos
{
    public static void main(String args[])
    {
        try
        {
            RandomAccessFile randomFile = new RandomAccessFile("F:\\data.dat","rw");
            randomFile.writeInt(10);
            randomFile.writeInt(20);
            System.out.println("The pos is " + randomFile.getFilePointer());
            randomFile.seek(0);
            System.out.println(randomFile.readInt());
            randomFile.seek(randomFile.length());
            randomFile.writeInt(30);
            randomFile.seek(4);
            System.out.println(randomFile.readInt());
            randomFile.seek(8);
            System.out.println(randomFile.readInt());
            randomFile.close();
        }catch(IOException e){};
    }
}
