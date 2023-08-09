package BT_2_So;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2so {
    public static void main(String[] args) throws IOException {
        int serverPort = 8080;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("dang cho ket noi..");

        Socket socket = serverSocket.accept();
        System.out.println("da ket noi nguoi dung..");

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        byte [] bytes = new byte [2028];

        int byteRead = inputStream.read(bytes);
        String input = new String(bytes,0, byteRead);
        String [] number = input.split("");
        int num1 = Integer.parseInt(number[0]);
        int num2 = Integer.parseInt(number[1]);
        int num3 = Integer.parseInt(number[2]);

        int sum = num1 + num2 + num3;

        String result = ("tông 3 số là :" + sum );
        outputStream.write(result.getBytes());
        outputStream.flush();
        serverSocket.close();

    }
}
