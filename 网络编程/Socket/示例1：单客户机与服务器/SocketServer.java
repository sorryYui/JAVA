import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class SocketServer
{
    public static void main(String args[])
            throws IOException
    {
        int port = 7070;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        do {
            double length = dis.readDouble();
            double result = length * length;
            System.out.println(length);
            dos.writeDouble(result);
            dos.flush();
        }while(dis.readInt() != 0);
    }
}
