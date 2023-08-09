package Tuan5_networking2.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        String serverIp = "localhost" ;
        int serverPort = 8899;
        DatagramSocket ClientSocket = new DatagramSocket();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap tn ");

            String message = sc.nextLine();
            if ("exit".equalsIgnoreCase(message)) {
                ClientSocket.close();
            }
            byte[] sendData = message.getBytes();
            InetAddress severAddress = InetAddress.getByName(serverIp);
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, severAddress, serverPort);
            ClientSocket.send(sendPacket);

            byte[] nhanData = new byte[1024];
            DatagramPacket nhanPacket = new DatagramPacket(nhanData,nhanData.length);
            ClientSocket.receive(nhanPacket);

            String nhanMess = new String(nhanPacket.getData(), 0, nhanPacket.getLength());

            System.out.println(nhanMess);

        }
    }
}
