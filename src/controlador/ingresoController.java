/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import vista.frmMenuAdministrador;
import vista.frmMenuUsuario;
import modelo.usuariosModel;

/**
 *
 * @author Laura Traslaviña
 */
public class ingresoController {
    
    public boolean ingresar(JSONObject obj) throws SQLException {
        usuariosModel usuario = new usuariosModel();
        usuario.setCorreo((String) obj.get("correo"));
        usuario.setClave((String) obj.get("clave"));        
        ResultSet rs = usuario.readUsuario();
        if(rs.next()) {
            char perfil = rs.getString("PERFIL").charAt(0);
            if(perfil == '0') {  //Es un usuario cliente (pasajero)
                this.menu_usuario(rs);                
            } else {
                this.menu_administrador(rs);
            }
        } else {
            return false;
        }
        return true;
    }    
    
    
    private void menu_usuario(ResultSet rs) throws SQLException {

        frmMenuUsuario frmU = new frmMenuUsuario();
        frmU.setTitle("Menú de usuario");
        frmU.setLocationRelativeTo(null);
        frmU.labelNombre.setText(rs.getString("NOMBRE") + " " + rs.getString("APELLIDO"));
        frmU.refer = rs.getString("REFER");
        frmU.setVisible(true);
    }
    
    
    private void menu_administrador(ResultSet rs) throws SQLException {

        frmMenuAdministrador frmA = new frmMenuAdministrador();
        frmA.setLocationRelativeTo(null);
        frmA.setVisible(true);
    }

}
    