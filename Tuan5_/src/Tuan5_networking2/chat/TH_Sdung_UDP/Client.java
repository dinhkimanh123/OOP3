package Tuan5_networking2.chat.TH_Sdung_UDP;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "localhost";
        int serverPort = 12345;
        DatagramSocket clientSocket = new DatagramSocket();

        String messga = "hello";
        byte[] sendData = messga.getBytes();

        InetAddress severAddress = InetAddress.getByName(serverIP);
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, severAddress,serverPort);

        clientSocket.send(sendPacket);

        byte[] nhanAddress = new byte[1024];
        DatagramPacket nhanPcket = new DatagramPacket(nhanAddress, nhanAddress.length);

        clientSocket.receive(nhanPcket);

        String repMess = new String(nhanPcket.getData(),0,nhanPcket.getLength());
        System.out.println("nhan tu sever " + repMess);

        clientSocket.close();





    }
}
