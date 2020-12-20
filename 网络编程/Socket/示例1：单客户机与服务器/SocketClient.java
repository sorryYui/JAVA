import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class SocketClient
{
    public static void main(String args[])
        throws IOException,UnknownHostException
    {
        int port = 7070;
        String host = "localhost";
        Socket socket = new Socket(host,port);
        DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("write a number.");
            double input = sc.nextDouble();
            dos.writeDouble(input);
            dos.flush();
            double result = dis.readDouble();
            System.out.println("The result is:" + result);
            System.out.println("continue?");
            String str = sc.next();
            if (str.equals("N"))
            {
                dos.writeInt(0);
                break;
            }
            else
                dos.writeInt(1);
        }
        sc.close();
        dis.close();;
        dos.close();
        socket.close();
    }
}
