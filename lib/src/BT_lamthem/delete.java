package BT_lamthem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
    public static void main(String[] args) throws SQLException {
        JDBC1 jdbc1 = new JDBC1();
        Connection connection = jdbc1.connection();

        String query = "delete from Sach where = 3";
        Statement stm = null;
        stm = connection.createStatement();

        int row = stm.executeUpdate(query);
        if (row != 0) {
            System.out.println("xoa thanh cong " + row );
        }
        connection.close();
    }
}
