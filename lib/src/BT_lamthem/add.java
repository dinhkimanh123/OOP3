package BT_lamthem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class add {
    public static void main(String[] args) throws SQLException {
        JDBC1 jdbc1 = new JDBC1();
        Connection connection = jdbc1.connection();

        String query = "insert into tacgia (authorName)" + "values('kim anh')";
        Statement stm = null;
        stm = connection.createStatement();

        int row = stm.executeUpdate(query);
        if (row != 0) {
            System.out.println("them tac gia thanh cong " + row );
        }
        connection.close();
}}
