/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import modelo.tiquetesModel;

/**
 *
 * @author Laura Traslaviña
 */
public class tiquetesController {
    
    public ResultSet consultarTiquetes(String numvuelo) {
        tiquetesModel tiquete = new tiquetesModel();
        ResultSet rs = tiquete.readTiquetes(numvuelo);
        return rs;
    }
    
    public boolean comprarTiquete(String refvuelo, String refer) {
        tiquetesModel tiquete = new tiquetesModel();
        tiquete.setRefer(Integer.parseInt(refvuelo));
        tiquete.setRefe2(Integer.parseInt(refer));
        return tiquete.compraTiquete();
    }

    public boolean cancelarTiquete(String refer, String motivo) {
        tiquetesModel tiquete = new tiquetesModel();
        tiquete.setRefer(Integer.parseInt(refer));
        tiquete.setMotivo(motivo);
        return tiquete.cancelaTiquete();
    }

}
