import java.io.File;
public class FileOperator
{
    public static void main(String args[])
    {
        File newFile = new File("F:\\javatest\\javatest.txt");
        File createrFile = new File("F:\\test.txt");
        if (createrFile.exists())
            System.out.println("File has existsed.");
        else
        {
            System.out.println("File hasn't exists.");
            try
            {
                createrFile.createNewFile();
            }catch(Exception e){}
        }
        System.out.println(newFile.getAbsoluteFile());
        System.out.println(newFile.getName());
        System.out.println(newFile.getParent());
        if (newFile.isDirectory())
            System.out.println("newFile is directory.");
        else
            System.out.println("newFile isn't directory.");
        System.out.println("The length of the File is:" + newFile.length());
        File file = new File("F:\\javatest\\abc");
        if (file.exists())
            System.out.println(file.getName() + "has existsed.");
        else
            if (file.mkdirs())
                System.out.println(file.getName() + "has created.");
            else
                System.out.println(file.getName() + "hasn't created.");
        File reNameFile = new File("F:\\javatest","reNameFile.txt");
        if (reNameFile.exists())
            System.out.println(reNameFile.getName() + "has exists.");
        else
            if (newFile.renameTo(reNameFile))
                System.out.println("Done");
            else
                System.out.println("False");
    }
}
