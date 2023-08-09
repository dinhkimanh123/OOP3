package Tuan5_networking2.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws IOException {
        int serverPort = 8899;
        DatagramSocket severSocket = new DatagramSocket(serverPort);
        System.out.println("may chu dang chay va cho ket noi ");


        while (true) {
            byte[] nhanMessaga = new byte[1024];
            DatagramPacket nhanPacket = new DatagramPacket(nhanMessaga, nhanMessaga.length);
            severSocket.receive(nhanPacket);
            String nhanMess = new String(nhanPacket.getData(), 0, nhanPacket.getLength());
            System.out.println(nhanMess);


            Scanner sc = new Scanner(System.in);
            System.out.println("moi nhap tin nhan");
            String messga = sc.nextLine();
            if ("exit".equalsIgnoreCase(messga)) {
                severSocket.close();

            }
            byte[] sendMess = messga.getBytes();
            InetAddress ClientAddress = nhanPacket.getAddress();
            int ClientPort = nhanPacket.getPort();
            DatagramPacket serverPacket = new DatagramPacket(sendMess, sendMess.length, ClientAddress, ClientPort);
            severSocket.send(serverPacket);

        }


    }

}

