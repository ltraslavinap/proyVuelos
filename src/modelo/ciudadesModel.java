/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Laura Traslaviña
 */
public class ciudadesModel  extends conexionModel {
    private Integer refer;
    private String ciudad;

    public ResultSet listadoCiudades(){
        ResultSet rs = null;
        
        try {
            String sql = "{call ciudades_s()}";
            CallableStatement cs = conex.prepareCall(sql);
            if(cs.execute()) {
                rs = cs.getResultSet();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return rs;
    }
    
    public Integer getRefer() {
        return refer;
    }

    public void setRefer(Integer refer) {
        this.refer = refer;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }    
}
