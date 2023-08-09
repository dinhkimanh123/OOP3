package TH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectJDBC {
    private String hostName = "localhost : 3306";
    private String databaseName = "products";
    private  String useName = "root";
    private String pass = "1";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+databaseName;

    public Connection connect(){
        Connection connectJDBC = null;

        try {
            connectJDBC = DriverManager.getConnection(connectionURL, useName, pass);
            System.out.println("ket noi thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connectJDBC;
    }



}
