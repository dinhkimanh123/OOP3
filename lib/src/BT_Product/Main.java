package BT_Product;

import TH.ConnectJDBC;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC1 connectJDBC1 = new ConnectJDBC1();
        Connection connection = connectJDBC1.connection();

//        String query = "select * from products";
//        Statement stm = null;
//
//        stm = connection.createStatement();
//        ResultSet rs = stm.executeQuery(query);
//
//        while (rs.next()) {
//            int id = rs.getInt("id");
//            String tensp = rs.getString("tensp");
//            String gia = rs.getString("gia");
//            String chitiet = rs.getString("chitiet");
//            String hangsx = rs.getString("hangsx");
//            int soluong = rs.getInt("soluong");
//            boolean trangthai = rs.getBoolean("trangthai");
//            System.out.println("id" + id + "ten sp" + tensp + "gia" + gia + "chi tiet"+ chitiet + "hang san xuat" + hangsx + "sp=o luong " + soluong + "trang thai" + trangthai);
//        }
//        connection.close();

        // theem use //
//        String query = "insert into products (id, tensp, soluong ) " + "values (4, 'xaomi', 25)";
//        Statement stm = null;
//        stm = connection.createStatement();
//
//        int row = stm.executeUpdate(query);
//        if (row!= 0) {
//            System.out.println("theem thamh cong " + row);
//        }
//        connection.close();

        // xóa // 
//        String query = "delete from products where id = 4 ";
//        Statement stm = null;
//         stm = connection.createStatement();
//
//         int row = stm.executeUpdate(query);
//         if (row!=0){
//             System.out.println("xao thanh cong" + row);
//         }
//        connection.close();

        // update //
        String query = "update products set gia = '25000', chitiet = 'mau xanh' where id = 3 ";
        Statement stm = null;
        stm = connection.createStatement();

        int row = stm.executeUpdate(query);
        if (row != 0){
            System.out.println("update thanh cong" + row);
        }

        connection.close();
    }
}
