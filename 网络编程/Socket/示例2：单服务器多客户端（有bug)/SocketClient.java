import java.net.Socket;
import java.util.Random;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
public class SocketClient implements Runnable
{
    private int SocketClientCount;
    public void run()
    {
        try {
            Thread.sleep(1000);
            int port = 7070;
            String host = "localhost";
            Socket socket = new Socket(host,port);
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            double val = new Random(System.currentTimeMillis() % 1000).nextInt(100);
            System.out.println(SocketClientCount + " value : " + val);
            dos.writeDouble(val);
            dos.flush();
            double res = dis.readDouble();
            dis.close();
            dos.close();
            System.out.println(SocketClientCount + " result : " + res);
            socket.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void setSocketClientCount(int SocketClientCount)
    {
        this.SocketClientCount = SocketClientCount;
    }
}
