/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hocgioinhatlop
 */
public class ValidateData {
    public static void ValidateEmpty(JTextField txt){
        if(txt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng không bỏ trống !!");
        } 
    }
}
