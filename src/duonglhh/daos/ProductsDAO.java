/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duonglhh.daos;

import duonglhh.dto.Products;
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
public class ProductsDAO {

    public static Vector<Products> getProducts() {
        Vector<Products> list = new Vector();
        Connection cn = null;
        try {
            cn = MyConnection.getConnection();
            if (cn != null) {
                String sql = "select productID,productName,categoryid,unit,quantity,price\n"
                        + "from tblProducts";
                PreparedStatement pst = cn.prepareCall(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String productID = rs.getString("productID");
                    String productName = rs.getNString("productName");
                    String categoryid = rs.getString("categoryid");
                    String unit = rs.getString("unit");
                    int quantity = rs.getInt("quantity");
                    float price = rs.getFloat("price");
                    list.add(new Products(productID, productName, unit, price, quantity, categoryid));

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

    public static Vector<String> getColumn() {
        Vector<String> header = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.getConnection();
            if (cn != null) {
                String sql = "select productID,productName,categoryid,unit,quantity,price\n"
                        + "from tblProducts";
                PreparedStatement pst = cn.prepareCall(sql);
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData meta = rs.getMetaData();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    header.add(meta.getColumnName(i));
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
                e.printStackTrace();;
            }
        }
        return header;

    }

    public static int InsertProduct(String ProductID, String ProductName, String unit, float price, int quantity, String catetgoryid) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.getConnection();
        if (cn != null) {
            String sql = "insert tblProducts values(?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareCall(sql);
            pst.setString(1, ProductID);
            pst.setNString(2, ProductName);
            pst.setString(3, unit);
            pst.setFloat(4, price);
            pst.setInt(5, quantity);
            pst.setString(6, catetgoryid);
            result = pst.executeUpdate();
        }
        return result;
    }

    public static int DeleteProduct(String ProductID) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.getConnection();
        if (cn != null) {
            String sql = "delete from tblProducts\n"
                    + "where productID = ?";
            PreparedStatement pst = cn.prepareCall(sql);
            pst.setString(1, ProductID);
            result = pst.executeUpdate();
        }
        return result;
    }

    public static int UpdateProduct(String ProductID, String NewProductName, String Newunit, float Newprice, int Newquantity, String Newcatetgoryid) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.getConnection();
        if (cn != null) {
            String sql = "update tblProducts\n"
                    + "set productName = ?, unit = ?, price = ?, quantity = ?, categoryid = ?\n"
                    + "where productID = ?";
            PreparedStatement pst = cn.prepareCall(sql);
            pst.setNString(1, NewProductName);
            pst.setString(2, Newunit);
            pst.setFloat(3, Newprice);
            pst.setInt(4, Newquantity);
            pst.setString(5, Newcatetgoryid);
            pst.setString(6, ProductID);
            result = pst.executeUpdate();
        }
        return result;

    }
}
