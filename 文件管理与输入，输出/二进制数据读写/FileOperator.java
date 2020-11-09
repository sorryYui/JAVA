import java.io.*;
public class FileOperator
{
    public static void writeMethod()
    {
        String fileName = "F:\\data.txt";
        try
        {
            FileOutputStream output = new FileOutputStream(fileName);
            DataOutputStream dataFile = new DataOutputStream(new BufferedOutputStream(output));
            dataFile.writeInt(10);
            System.out.println(dataFile.size() + "bytes have been written.");
            dataFile.writeDouble(3.14);
            System.out.println(dataFile.size() + "bytes have been written.");
            dataFile.writeBoolean(true);
            System.out.println(dataFile.size() + "bytes has been written.");
            dataFile.writeUTF("你是弟弟!");
            System.out.println(dataFile.size() + "bytes has benn written.");
            dataFile.close();
        }catch(IOException e){};
    }
    public static void readMethod()
    {
        String fileName = "F:\\data.txt";
        try
        {
            FileInputStream input = new FileInputStream(fileName);
            DataInputStream dataInput = new DataInputStream(new BufferedInputStream(input));
            System.out.println(dataInput.readInt());
            System.out.println(dataInput.readDouble());
            System.out.println(dataInput.readBoolean());
            System.out.println(dataInput.readUTF());
            dataInput.close();
        }catch(IOException e){};
    }
    public static void main(String args[])
    {
        writeMethod();
        readMethod();
    }
}
