/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JTextField;

/**
 *
 * @author Laura Traslaviña
 */
//public class usuariosModel extends conexionModel {
public class usuariosModel extends conexionModel{
    private Integer refer;
    private String nombre;
    private String apellido;
    private Integer cedula;
    private String telefono;
    private String correo;
    private String clave;
    private Character perfil;
    
    public boolean createUsuario() {
        boolean rs = false;
        try {
            String sql = "{ call usuarios_i(?,?,?,?,?,?,?) }";       
            CallableStatement cs = conex.prepareCall(sql);
            cs.setString(1, this.getNombre());
            cs.setString(2, this.getApellido());
            cs.setInt(3, this.getCedula());
            cs.setString(4, this.getTelefono());
            cs.setString(5, this.getCorreo());
            cs.setString(6, this.getClave());
            cs.setString(7, String.valueOf(this.getPerfil()));
            if(cs.execute()) {
                rs = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }    

    public ResultSet readUsuario() {
        ResultSet rs = null;
        try {
            String sql = "{call usuarios_s(?,?)}";
            CallableStatement cs = conex.prepareCall(sql);
            cs.setString(1, this.getCorreo());
            cs.setString(2, this.getClave());
            if(cs.execute()) {
                rs = cs.getResultSet();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    
    public boolean deleteUsuario() {
        boolean rs = false;
        try {
            String sql = "{call usuarios_d(?)}";
            CallableStatement cs = conex.prepareCall(sql);
            cs.setInt(1, this.getRefer());
            if(cs.execute()) {
                rs = true;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Character getPerfil() {
        return perfil;
    }

    public void setPerfil(Character perfil) {
        this.perfil = perfil;
    }    

}
