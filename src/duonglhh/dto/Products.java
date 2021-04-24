/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duonglhh.dto;

/**
 *
 * @author ASUS
 */
public class Products {
    String ProductID;
    String ProductName;
    String unit;
    float price;
    int quantity;
    String catetgoryid;

    public Products() {
    }

    public Products(String ProductID, String ProductName, String unit, float price, int quantity, String catetgoryid) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
        this.catetgoryid = catetgoryid;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCatetgoryid() {
        return catetgoryid;
    }

    public void setCatetgoryid(String catetgoryid) {
        this.catetgoryid = catetgoryid;
    }

    @Override
    public String toString() {
        return "Products{" + "ProductID=" + ProductID + ", ProductName=" + ProductName + ", unit=" + unit + ", price=" + price + ", quantity=" + quantity + ", catetgoryid=" + catetgoryid + '}';
    }
    
    
}
