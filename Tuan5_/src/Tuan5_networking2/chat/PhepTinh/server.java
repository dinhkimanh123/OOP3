package Tuan5_networking2.chat.PhepTinh;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.StringTokenizer;

public class server {
    public static void main(String[] args) throws IOException {
        int serverPort = 8888;
        DatagramSocket serverSoket = new DatagramSocket(serverPort);
        System.out.println("server dang chay");

        byte[] nhanData = new byte[1024];
        DatagramPacket nhanPacket = new DatagramPacket(nhanData, nhanData.length);
        serverSoket.receive(nhanPacket);

        String operation = new String(nhanPacket.getData(),0, nhanPacket.getLength());
        System.out.println("phep tinh la" + operation);
        StringTokenizer inputData = new StringTokenizer(operation);

        int num1 = Integer.parseInt(inputData.nextToken());
        String operra = inputData.nextToken();
        int num2 = Integer.parseInt(inputData.nextToken());
         int kqua = 0;

        switch (operra) {
            case "+":
                kqua = num1 + num2;
                break;
            case "-":
                kqua = num1 - num2;
                break;
            case "*":
                kqua = num1 * num2;
                break;
            case "/":
                kqua = num1 / num2;
                break;
            default:
                System.out.println("Phep tinh khong hop le!");
                break;


    }
        InetAddress clientAddress = nhanPacket.getAddress();
        int ClientPort = nhanPacket.getPort();
        String data = Integer.toString(kqua);
         DatagramPacket sendPacket = new DatagramPacket(data.getBytes(), data.length(), clientAddress, ClientPort);
         serverSoket.send(sendPacket);
        serverSoket.close();

}
}