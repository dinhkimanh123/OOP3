package BT_lamthem;

import java.sql.Connection;
import java.sql.SQLException;

public class up {
    public static void main(String[] args) throws SQLException {
        JDBC1 jdbc1 = new JDBC1();
        Connection connection = jdbc1.connection();



    }
}
