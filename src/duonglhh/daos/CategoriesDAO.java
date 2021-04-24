/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duonglhh.daos;

import duonglhh.dto.Categories;
import duonglhh.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class CategoriesDAO {

    public static Vector<Categories> getCategories() {
        Vector<Categories> list = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.getConnection();
            if (cn != null) {
                String sql = "select categoryID,categoryName,description\n"
                        + "from tblCategories";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String categoryID = rs.getString("categoryID");
                    String categoryName = rs.getNString("categoryName");
                    String description = rs.getNString("description");
                    list.add(new Categories(categoryID, categoryName, description));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;

    }

    public static Vector<String> getColum() {
        Vector<String> header = new Vector();
        Connection cn = null;
        try {
            cn = MyConnection.getConnection();
            if (cn != null) {
                String sql = "select categoryID,categoryName,description\n"
                        + "from tblCategories";
                PreparedStatement pst = cn.prepareCall(sql);
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData meta = rs.getMetaData();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    header.add(meta.getColumnName(i));
                }

            }
        } catch (Exception e) {
        }
        return header;
    }

    public static int InsertCategory(String CategoryID, String CategoryName, String Description) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.getConnection();
        if (cn != null) {
            String sql = "insert tblCategories values(?,?,?)";
            PreparedStatement pst = cn.prepareCall(sql);
            pst.setString(1, CategoryID);
            pst.setNString(2, CategoryName);
            pst.setNString(3, Description);
            result = pst.executeUpdate();
        }
        return result;
    }

    public static int DeleteCategory(String CategoryID) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.getConnection();
        if (cn != null) {
            String sql = "delete from tblCategories\n"
                    + "where categoryID = ?";
            PreparedStatement pst = cn.prepareCall(sql);
            pst.setString(1, CategoryID);
            result = pst.executeUpdate();

        }
        return result;
    }

    public static int UpdateCategory(String CategoryID, String NewCategoryName, String NewDescription) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.getConnection();
        if (cn != null) {
            String sql = "update tblCategories\n"
                    + "set categoryName = ?, description = ?\n"
                    + "where categoryID = ?";
            PreparedStatement pst = cn.prepareCall(sql);
            pst.setNString(1, NewCategoryName);
            pst.setNString(2, NewDescription);
            pst.setString(3, CategoryID);
            result = pst.executeUpdate();
        }
        return result;

    }
}
