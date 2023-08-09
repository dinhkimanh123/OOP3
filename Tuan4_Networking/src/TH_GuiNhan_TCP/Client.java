package TH_GuiNhan_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        String serverIP = "127.0.0.1";
        int server = 8080;

        try {
            Socket socket = new Socket(serverIP, server);

            OutputStream outputStream = socket.getOutputStream();
            String message = " hello " ;
            outputStream.write(message.getBytes());

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
