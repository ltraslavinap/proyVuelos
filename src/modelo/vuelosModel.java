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
public class vuelosModel extends conexionModel {
    private Integer refer;
    private String numero;
    private String dia;
    private String hora;
    private Integer refe1; //referencia código ciudad de salida
    private Integer refe2;  //referencia código ciudad de llegada
    private String ciudad1; //nombre ciudad de salida
    private String ciudad2;  //nombre ciudad de llegada
    private Character estado;
    private Integer filas;
    private String tiquetes[];
   
    public Integer createVuelo() {
        Integer rs = 0;
        try {
            String sql = "{ call vuelos_i(?,?,?,?,?,?) }";       
            CallableStatement cs = conex.prepareCall(sql);
            cs.setString(1, this.getNumero());
            cs.setString(2, this.getDia());
            cs.setString(3, this.getHora());
            cs.setInt(4, this.getRefe1());
            cs.setInt(5, this.getRefe2());
            cs.setInt(6, this.getFilas());
            cs.executeUpdate();
            rs = 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(rs);
        return rs;
    }

    public ResultSet consultaGeneral() {

        ResultSet rs = null;
        try {
            String sql = "{call vuelos_s_1(?,?)}";       
            CallableStatement cs = conex.prepareCall(sql);
            cs.setInt(1, this.getRefe1());
            cs.setInt(2, this.getRefe2());
            if(cs.execute()) {
                rs = cs.getResultSet();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public ResultSet readVuelo() {

        ResultSet rs = null;
        try {
            String sql = "{call vuelos_s(?)}";       
            CallableStatement cs = conex.prepareCall(sql);
            cs.setString(1, this.getNumero());
            if(cs.execute()) {
                rs = cs.getResultSet();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public Integer updateVuelo() {

        Integer rs = 0;
        try {
            String sql = "{ call vuelos_u(?,?,?,?,?) }";       
            CallableStatement cs = conex.prepareCall(sql);
            cs.setString(1, this.getNumero());
            cs.setString(2, this.getDia());
            cs.setString(3, this.getHora());
            cs.setInt(4, this.getRefe1());
            cs.setInt(5, this.getRefe2());
            cs.execute();
            rs = cs.getUpdateCount();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(rs);
        return rs;
    }

    public Integer deleteVuelo() {

        Integer rs = 0;
        try {
            String sql = "{ call vuelos_d(?) }";
            CallableStatement cs = conex.prepareCall(sql);
            cs.setString(1, this.getNumero());
            cs.execute();
            rs = cs.getUpdateCount();
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getRefe1() {
        return refe1;
    }

    public void setRefe1(Integer refe1) {
        this.refe1 = refe1;
    }

    public Integer getRefe2() {
        return refe2;
    }

    public void setRefe2(Integer refe2) {
        this.refe2 = refe2;
    }

    public String getCiudad1() {
        return ciudad1;
    }

    public void setCiudad1(String ciudad1) {
        this.ciudad1 = ciudad1;
    }

    public String getCiudad2() {
        return ciudad2;
    }

    public void setCiudad2(String ciudad2) {
        this.ciudad2 = ciudad2;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Integer getFilas() {
        return filas;
    }

    public void setFilas(Integer filas) {
        this.filas = filas;
    }
    
    public String[] getTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(String[] tiquetes) {
        this.tiquetes = tiquetes;
    }    
}
