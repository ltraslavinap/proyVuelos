/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Laura Traslaviña
 */
public class tiquetesModel extends conexionModel {
    
    private Integer refer;
    private Integer refe1; //Refencia del vuelo al que pertenece el tiquete
    private Integer fila;
    private String puesto;
    private Integer refe2; //Referencia del usuario (pasajero) comprador del tiquete
    private String fecha; //Fecha de creación del tiquete o compra del mismo.
    private String motivo;
   
    public ResultSet readTiquetes(String numvuelo) {

        ResultSet rs = null;
        try {
            String sql = "{call tiquetes_s_1(?)}";       
            CallableStatement cs = conex.prepareCall(sql);
            cs.setString(1, numvuelo);
            if(cs.execute()) {
                rs = cs.getResultSet();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public boolean compraTiquete() {
        boolean rs = false;
        try {
            String sql = "{ call tiquetes_u(?,?) }";       
            CallableStatement cs = conex.prepareCall(sql);
            cs.setInt(1, this.getRefer());
            cs.setInt(2, this.getRefe2());
            cs.execute();
            rs = true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public boolean cancelaTiquete() {
        boolean rs = false;
        try {
            String sql = "{ call tiquetes_d(?,?) }";
            CallableStatement cs = conex.prepareCall(sql);
            cs.setInt(1, this.getRefer());
            cs.setString(2, this.getMotivo());
            cs.execute();
            rs = true;
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

    public Integer getRefe1() {
        return refe1;
    }

    public void setRefe1(Integer refe1) {
        this.refe1 = refe1;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Integer getRefe2() {
        return refe2;
    }

    public void setRefe2(Integer refe2) {
        this.refe2 = refe2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
