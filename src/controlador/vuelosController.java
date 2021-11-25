/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import modelo.vuelosModel;
import org.json.simple.JSONObject;
import vista.frmVuelo;

/**
 *
 * @author Laura Traslaviña
 */
public class vuelosController {

    public Integer crearVuelo(JSONObject obj){

        vuelosModel vuelo = new vuelosModel();
        vuelo.setNumero((String) obj.get("numero"));
        vuelo.setDia((String) obj.get("fecha"));
        vuelo.setHora((String) obj.get("hora"));
        vuelo.setRefe1(Integer.parseInt((String) obj.get("refe1")));
        vuelo.setRefe2(Integer.parseInt((String) obj.get("refe2")));
        vuelo.setFilas(Integer.parseInt((String) obj.get("filas")));
        return vuelo.createVuelo();
    }

    public ResultSet buscarVuelo(String numero){

        vuelosModel vuelo = new vuelosModel();
        vuelo.setNumero(numero);
        ResultSet rs = vuelo.readVuelo();
        return rs;
    }
    
    public Integer modificarVuelo(JSONObject obj){

        vuelosModel vuelo = new vuelosModel();
        vuelo.setNumero((String) obj.get("numero"));
        vuelo.setDia((String) obj.get("fecha"));
        vuelo.setHora((String) obj.get("hora"));
        vuelo.setRefe1(Integer.parseInt((String) obj.get("refe1")));
        vuelo.setRefe2(Integer.parseInt((String) obj.get("refe2")));
        return vuelo.updateVuelo();
    }
    
    public Integer eliminarVuelo(String numvuelo){
        vuelosModel vuelo = new vuelosModel();
        vuelo.setNumero(numvuelo);
        return vuelo.deleteVuelo();
    }

    public ResultSet consultarVuelos(Integer refe1, Integer refe2) {
        ResultSet rs = null;
        vuelosModel vuelo = new vuelosModel();
        vuelo.setRefe1(refe1);
        vuelo.setRefe2(refe2);
        return vuelo.consultaGeneral();
    }
}
