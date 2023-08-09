package IP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCheckIP {
    public static void main(String[] args) throws IOException {
        int serverPort = 0611;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[2048];
        int byteRead = inputStream.read(bytes);
        String inputString = new String(bytes,0,byteRead);
//        String regex =



    }
}
