package IP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String IP = "127.0.0.1";
        int serverPort = 0611;
        Socket socket = new Socket(IP,serverPort);

        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap ip");

        String Ipinput = input.next();

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(Ipinput.getBytes());


    }
}
