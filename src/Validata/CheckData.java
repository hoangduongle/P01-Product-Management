/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validata;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CheckData {

    public static boolean getStringID(String input) {
        String result = "";
        if (!input.matches("[A-Za-z0-9]+")) {
            JOptionPane.showMessageDialog(null, "ID is Duplicate!!!");
            return false;
        }
        return true;
    }

    public static boolean getString(String input, String mess) {
        String result = "";
        if (!input.matches("[A-Za-z0-9 ]+")) {
            JOptionPane.showMessageDialog(null, mess);
            return false;
        }
        return true;
    }

    public static boolean getStringChar(String input, String mess) {
        String result = "";
        if (!input.matches("[A-Za-z ]+")) {
            JOptionPane.showMessageDialog(null, mess);
            return false;
        }
        return true;
    }

    public static boolean getInt(String input, String mess) {
        String result = "";
        if (!input.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, mess);
            return false;

        }
        return true;
    }

    public static boolean getfloat(String input, String mess) {
        String result = "";
        if (!input.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, mess);
            return false;

        }
        return true;
    }
}
