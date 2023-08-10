package BT_lamthem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC1 {
    private String hostName = "localhost:3306";
    private String databaseName = "test";
    private  String useName = "root";
    private String pass = "1";

    private String connectURL =  "jdbc:mysql://"+hostName+"/"+databaseName;

    public Connection connection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection(connectURL,useName,pass);
        System.out.println("ket noi thanh cong" );

        return connection;

    }
}
