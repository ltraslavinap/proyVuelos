/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import modelo.ciudadesModel;

/**
 *
 * @author Laura Traslaviña
 */
public class ciudadesController {
    
    public ResultSet listarCiudades() {

        ResultSet rs = null;
        ciudadesModel ciudades = new ciudadesModel();
        rs = ciudades.listadoCiudades();
        return rs;
    }

}
