import java.net.Socket;
import java.io.IOException;
public class Test
{
    public static void main(String args[])
            throws IOException
    {
        for (int i = 0;i < 1000;i++)
        {
            SocketClient socketClient = new SocketClient();
            socketClient.setSocketClientCount(i);
            new Thread(socketClient).start();
        }
    }
}
