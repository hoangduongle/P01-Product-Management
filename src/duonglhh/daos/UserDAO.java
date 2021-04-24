/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duonglhh.daos;

import duonglhh.dto.User;

import duonglhh.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class UserDAO {

    public static Vector<User> getUser() {
        Vector<User> list = new Vector<>();
        Connection conn = null;
        try {
            conn = MyConnection.getConnection();
            if (conn != null) {
                String sql = "select userID,fullName,password,status\n"
                        + "from tblUsers";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String userID = rs.getString("userID");
                    String fullName = rs.getNString("fullName");
                    String password = rs.getString("password");
                    int status = rs.getInt("status");
                    list.add(new User(userID, fullName, password, status));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

//    public static String CheckUser(String username, String password) {
//        Connection conn = null;
//        try {
//            conn = MyConnection.getConnection();
//            if (conn != null) {
//                String sql = "select fullname, status\n"
//                        + "from tblUsers\n"
//                        + "where userID = ? and password = ?";
//                PreparedStatement pst = conn.prepareStatement(sql);
//                pst.setString(1, username);
//                pst.setString(2, password);
//                ResultSet rs = pst.executeQuery();
//                if (rs.next())//while neu no co nhieu cot
//                {
//                    String name = rs.getString("fullname");
//                    return name;
//                }
//            }
//        } catch (Exception e) {
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return "";
//    }
}
