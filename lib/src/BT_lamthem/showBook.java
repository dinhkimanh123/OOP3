package BT_lamthem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class showBook {
    public static void main(String[] args) throws SQLException {
        JDBC1 jdbc1 = new JDBC1();
        Connection connection = jdbc1.connection();

         //hien thi tat ca thong tin sach //
        String query = "select * from Sach";
        Statement stm = null;
        stm = connection.createStatement();
        ResultSet rs = stm.executeQuery(query);

        while (rs.next()) {
            int bookID = rs.getInt("bookID");
            String tieude = rs.getString("tieude");
            int namxuatban = rs.getInt("namxuatban");
            int idTacgia = rs.getInt("idTacgia");
            int genreID = rs.getInt("genreId");

            System.out.println(bookID + tieude + namxuatban + idTacgia + genreID);

        }
        connection.close();

    }

}
