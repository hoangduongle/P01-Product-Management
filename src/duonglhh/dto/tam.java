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
public class tam {
    String CateID;
    String CateName;

    public tam() {
    }

    public tam(String CateID, String CateName) {
        this.CateID = CateID;
        this.CateName = CateName;
    }

    public String getCateID() {
        return CateID;
    }

    public String getCateName() {
        return CateName;
    }
    
    
}
