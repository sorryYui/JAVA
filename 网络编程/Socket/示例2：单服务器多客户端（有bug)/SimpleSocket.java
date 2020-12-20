import java.io.IOException;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.net.Socket;
public class SimpleSocket implements Runnable
{
    private Socket socket;
    private int clientCount;
    public SimpleSocket(Socket socket,int clientCount)
    {
        this.socket = socket;
        this.clientCount = clientCount;
    }
    public void run()
    {
        try
        {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            double length = dis.readDouble();
            System.out.println("clientCount"+clientCount + "length:" + length);
            dos.writeDouble(length * length);
            dos.flush();
            dos.close();
            dis.close();
            System.out.println("clientCount"+clientCount+"closed");
            socket.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
