package TH_URLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLConnection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.geeksforgeeks.org/javafx-filechooser-class/");

        java.net.URLConnection connection = url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
