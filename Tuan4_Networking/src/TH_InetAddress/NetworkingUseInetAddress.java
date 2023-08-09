package TH_InetAddress;

import java.io.IOException;
import java.net.InetAddress;

public class NetworkingUseInetAddress {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName("www.example.com");

        String ipAdd = address.getHostAddress();
        System.out.println(ipAdd);

        String hostName = address.getHostName();
        System.out.println(hostName);

        boolean reachale = address.isReachable(5000);
        System.out.println(reachale);
    }
}
