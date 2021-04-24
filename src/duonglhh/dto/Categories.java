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
public class Categories {
    String CategoryID;
    String CategoryName;
    String description;

    public Categories() {
    }

    public Categories(String CategoryID, String CategoryName, String description) {
        this.CategoryID = CategoryID;
        this.CategoryName = CategoryName;
        this.description = description;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Categories{" + "CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + ", description=" + description + '}';
    }
    
    
}
