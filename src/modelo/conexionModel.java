/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Laura Traslaviña
 */
public class conexionModel {
    Connection conex = null;
    private String bd = "AEROLINEA";
    private String usuario = "root";
    private String clave = "020405";
    private String url = "jdbc:mysql://localhost:3306/";
    private String msg = "";
        
    public conexionModel(){
     
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conex = (Connection) DriverManager.getConnection(this.url + this.bd, this.usuario, this.clave);
        } catch (ClassNotFoundException ex) {
            this.msg = "Driver no encontrado";
        } catch (SQLException ex) {
            this.msg = "Error al intentar conectar BD: "+ bd + "\n" + ex;
        }
    }
}
