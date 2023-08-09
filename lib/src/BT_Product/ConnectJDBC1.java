package BT_Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC1 {
    private String hostName = "localhost:3306";
    private String databaseName = "product";
    private  String useName = "root";
    private String pass = "1";

    private String connectURL = "jdbc:mysql://"+hostName+"/"+databaseName;
    public Connection connection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(connectURL, useName, pass);
        System.out.println("ket noi thanh cong ");

        return connection;
    }


}
