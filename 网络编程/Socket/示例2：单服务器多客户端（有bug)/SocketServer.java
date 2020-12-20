import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SocketServer
{
    public static void main(String args[])
            throws IOException
    {
        int port = 7070;
        int clientCount = 0;
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService exec = Executors.newCachedThreadPool();
        try
        {
            while(true)
            {
                Socket socket = serverSocket.accept();
                exec.execute(new SimpleSocket(socket,clientCount++));
                if (clientCount >= 1000)
                    break;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            serverSocket.close();
            exec.shutdownNow();
        }
    }
}
