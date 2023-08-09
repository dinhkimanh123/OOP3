package Tuan5_networking2.chat.PhepTinh;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIp = "localhost";
        int serverPort = 8888;
        DatagramSocket clientSocket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phep tinh ");
        String input = sc.nextLine();

        if ("exit".equalsIgnoreCase(input)) {
            clientSocket.close();
        }
        InetAddress serverAddress = InetAddress.getByName(serverIp);
        byte[] sendData = input.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
        clientSocket.send(sendPacket);

        byte[] nhanData = new byte[1024];
        DatagramPacket nhanPacket = new DatagramPacket(sendData,sendData.length);
        clientSocket.receive(nhanPacket);

        String kqua = new String(nhanPacket.getData(), 0, nhanPacket.getLength());
        System.out.println("kqua la :" + kqua);
        clientSocket.close();

}
}
