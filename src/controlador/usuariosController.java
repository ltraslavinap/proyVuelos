/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.usuariosModel;
import org.json.simple.JSONObject;
import vista.frmIngreso;
import vista.frmMenuUsuario;
import vista.frmRegistroUsuario;

/**
 *
 * @author Laura Traslaviña
 */
public class usuariosController implements ActionListener{

    public boolean eliminarUsuario(String refer){

        usuariosModel usuario = new usuariosModel();
        usuario.setRefer(Integer.parseInt(refer));
        return usuario.deleteUsuario();
    }
    
    public boolean crearUsuario(JSONObject obj){
                
        usuariosModel usuario = new usuariosModel();
        usuario.setNombre((String) obj.get("nombre"));
        usuario.setApellido((String) obj.get("apellido"));
        usuario.setCedula(Integer.parseInt((String) obj.get("cedula")));
        usuario.setTelefono((String) obj.get("telefono"));
        usuario.setCorreo((String) obj.get("correo"));
        usuario.setClave((String) obj.get("clave"));
        usuario.setPerfil("0".charAt(0));
        return usuario.createUsuario();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}