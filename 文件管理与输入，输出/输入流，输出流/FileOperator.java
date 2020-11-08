import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class FileOperator
{
    public static void main(String args[])
    {
        File file = new File("F:\\input.txt");
        File oFile = new File("F:\\output.txt");
        if (!file.exists())
            try {
                file.createNewFile();
            }catch(IOException e){};
        if (!oFile.exists())
            try{
                oFile.createNewFile();
            }catch(Exception e){};
        try {
            FileOutputStream input = new FileOutputStream(file.getAbsolutePath());
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            for (int i = 0; i < n; i++)
            {
                int val = s.nextInt();
                input.write(val);
            }
            s.close();
            input.close();
        }catch(IOException e){};
        try
        {
            byte []b = new byte[10];
            FileInputStream input = new FileInputStream(file.getAbsolutePath());
            FileOutputStream output = new FileOutputStream(oFile.getAbsolutePath());
            int ch,count = 0;
            while ((ch = input.read(b)) != -1)
            {
                output.write(b,0,ch);
                count += ch;
            }
            input.close();
            output.close();
            System.out.println(count);
        }catch(IOException e){};
    }
}
