/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
import Calculadora.frmCalculadora;
/**
 *
 * @author mfer_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          frmCalculadora frm = new frmCalculadora();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
        frm.setTitle("Calculadora");
    }
    
}
