package TH_GuiNhan_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int server = 8080;
        try {
            ServerSocket serverSocket = new ServerSocket(server);
            System.out.println("may chu dnag chay va cho ket noi ");

            Socket socket = serverSocket.accept();
            System.out.println("khach da ket noi ");

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int byteRead = inputStream.read(bytes);

            String message = new String(bytes, 0, byteRead);
            System.out.println("nhan tin  nhan tu khach hang " + message);
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
