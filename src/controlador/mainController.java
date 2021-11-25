/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import vista.frmIngreso;

/**
 *
 * @author Laura Traslaviña
 */
public class mainController {
    public static void main(String args[]) {
        frmIngreso frm = new frmIngreso();
        frm.setTitle("Ingreso al sistema");
        frm.setLocationRelativeTo(null);
        frm.labelRes.setVisible(false);
        frm.setVisible(true);
    }
}
