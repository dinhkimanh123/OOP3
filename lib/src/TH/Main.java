package TH;

import TH.ConnectJDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
//
//        String query = "SELECT * FROM thongtin";
//        Statement stm = null;
//        try {
//            stm = conn.createStatement();
//            ResultSet rs = stm.executeQuery(query);
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String useName = rs.getString("username");
//                String pass = rs.getString("pass");
//                String email = rs.getString("email");
//
//                System.out.println(id + "-" + useName + "-" + pass + "-" + email);
//            }
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        String query = "insert into thongtin (id, username, pass, email )" + "values (?,?,?,?)";
//        PreparedStatement pstm = null;
//        try {
//            pstm = conn.prepareStatement(query);
//            pstm.setInt(1, 5);
//            pstm.setString(2,"kim anh 2");
//            pstm.setString(3, "1");
//            pstm.setString(4,"anh.dinh2@gmail.com");
//
//            int row = pstm.executeUpdate();
//            if (row != 0){
//                System.out.println("them thanh cong " + row);
//            }
//            conn.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        String query = "delete from thongtin where id = ? ";
//        try {
//            PreparedStatement pstm = null;
//            pstm = conn.prepareStatement(query);
//            pstm.setInt(1,5);
//            int row = pstm.executeUpdate();
//            if (row != 0){
//                System.out.println("xoa thanh cong " + row);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        String query = "update thongtin set pass = ? where id = ? ";
        PreparedStatement pstm = null;
        try {
                pstm = conn.prepareStatement(query);
            pstm.setString(1,"vu duy khanh ");
            pstm.setInt(2,5);

                int row = pstm.executeUpdate();
                if (row!= 0 ) {
                    System.out.println("cap nhat " + row );
                }
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
 }
}