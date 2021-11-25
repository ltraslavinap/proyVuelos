/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ciudadesController;
import controlador.tiquetesController;
import controlador.vuelosController;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

/**
 *
 * @author Laura Traslaviña
 */
public class frmVuelo extends javax.swing.JFrame {

    JSONObject ciudades = new JSONObject();
    boolean modificar = false;

    public frmVuelo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txtNumeroVuelo = new java.awt.TextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtHora = new com.github.lgooddatepicker.components.TimePicker();
        txtFilas = new java.awt.TextField();
        btnGrabar = new java.awt.Button();
        btnBuscar = new java.awt.Button();
        btnEliminar = new java.awt.Button();
        cmbCiudadLlegada = new javax.swing.JComboBox<>();
        cmbCiudadSalida = new javax.swing.JComboBox<>();
        txtRefe2 = new java.awt.TextField();
        txtRefe1 = new java.awt.TextField();
        labelMsg = new java.awt.Label();
        btnTiquetes = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        label1.setText("Número de vuelo");

        label2.setText("Fecha");

        label3.setText("Hora");

        label4.setText("Ciudad de salida");

        label5.setText("Ciudad de llegada");

        label6.setText("Cantidad filas");

        txtNumeroVuelo.setMinimumSize(new java.awt.Dimension(60, 23));

        txtFecha.setDateFormatString("yyyy-MM-dd");
        txtFecha.setMinimumSize(new java.awt.Dimension(27, 23));
        txtFecha.setPreferredSize(new java.awt.Dimension(81, 23));

        txtHora.setMaximumSize(new java.awt.Dimension(83, 23));

        txtFilas.setMinimumSize(new java.awt.Dimension(60, 23));

        btnGrabar.setLabel("Grabar");
        btnGrabar.setMaximumSize(new java.awt.Dimension(80, 25));
        btnGrabar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnGrabar.setName(""); // NOI18N
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnBuscar.setLabel("Buscar");
        btnBuscar.setMaximumSize(new java.awt.Dimension(80, 25));
        btnBuscar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnBuscar.setName(""); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setLabel("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(80, 25));
        btnEliminar.setMinimumSize(new java.awt.Dimension(80, 25));
        btnEliminar.setName(""); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cmbCiudadLlegada.setMaximumRowCount(10);
        cmbCiudadLlegada.setPreferredSize(new java.awt.Dimension(80, 25));

        cmbCiudadSalida.setMaximumRowCount(10);
        cmbCiudadSalida.setPreferredSize(new java.awt.Dimension(80, 25));

        txtRefe2.setVisible(false);

        txtRefe1.setVisible(false);

        btnTiquetes.setLabel("Tiquetes");
        btnTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiquetesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 103, Short.MAX_VALUE))
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCiudadLlegada, 0, 144, Short.MAX_VALUE)
                            .addComponent(cmbCiudadSalida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRefe1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRefe2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBuscar, btnEliminar, btnGrabar, btnTiquetes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtRefe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtRefe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCiudadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbCiudadLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(labelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        btnGrabar.getAccessibleContext().setAccessibleName("btnGrabar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        String ciud01 = (String) this.cmbCiudadSalida.getSelectedItem();
        String ciud02 = (String) this.cmbCiudadLlegada.getSelectedItem();

        this.ciudades.keySet().forEach(keyStr -> {
            Object keyvalue = this.ciudades.get(keyStr);
            if(ciud01.equals(keyStr)) this.txtRefe1.setText((String) keyvalue);            
            if(ciud02.equals(keyStr)) this.txtRefe2.setText((String) keyvalue);
        });
        vuelosController ictrl = new vuelosController();

        JSONObject obj = new JSONObject();
        obj.put("numero",this.txtNumeroVuelo.getText());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");     
        String dateToStr = dateFormat.format(this.txtFecha.getDate());    
        obj.put("fecha", dateToStr);
        obj.put("hora",this.txtHora.getText());
        obj.put("refe1",this.txtRefe1.getText());
        obj.put("refe2",this.txtRefe2.getText());
        obj.put("filas",this.txtFilas.getText());

        Integer rs;
        
        if(this.modificar) {
            rs = ictrl.modificarVuelo(obj);
        } else {
            rs = ictrl.crearVuelo(obj);
        }

        if(rs > 0){
            if(this.modificar) {
                this.labelMsg.setText("Vuelo modificado");
            } else {
                this.labelMsg.setText("Vuelo creado");                
            }
            this.txtNumeroVuelo.setEnabled(false);
            this.txtFecha.setEnabled(false);
            this.txtHora.setEnabled(false);
            this.txtFilas.setEnabled(false);
            this.cmbCiudadSalida.setEnabled(false);
            this.cmbCiudadLlegada.setEnabled(false);

            this.btnGrabar.setEnabled(false);
            this.btnBuscar.setEnabled(false);
            this.btnEliminar.setEnabled(false);
        } else {
            if(this.modificar) {
                this.labelMsg.setText("Error no se pudo modificar el vuelo");                
            } else {
                this.labelMsg.setText("Error no se pudo crear el vuelo");
            }
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ciudadesController ctrC = new ciudadesController();
        ResultSet rs = ctrC.listarCiudades();

        try {
            //llenamos los combobox con las ciuades en las que opera la aerolínea
            while(rs.next()) {
                String ciudad = rs.getString("NOMBRE");
                String refer = rs.getString("REFER");
                this.cmbCiudadSalida.addItem(ciudad);
                this.cmbCiudadLlegada.addItem(ciudad);
                this.ciudades.put(ciudad, refer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmVuelo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_formWindowActivated

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
        vuelosController ictrl = new vuelosController();
        ResultSet rs = ictrl.buscarVuelo(this.txtNumeroVuelo.getText());

        try {
            if(rs.next()){

                //No se permiten cambios sobre el número de vuelo
                this.txtNumeroVuelo.setEnabled(false);

                //Se establece el contenido del campo fecha con los datos consultados.
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dataFormateada = dateFormat.parse(rs.getString("FECHA"));
                this.txtFecha.setDate(dataFormateada);

                this.txtHora.setText(rs.getString("HORA"));

                //Se establece la ciudad de salida del vuelo
                String ciudad = rs.getString("SALIDA");
                for (int i = 0; i < this.cmbCiudadSalida.getItemCount(); i++)  {
                    String item = this.cmbCiudadSalida.getItemAt(i);
                    if (item.equals(ciudad)) {
                        this.cmbCiudadSalida.setSelectedIndex(i);
                        break;
                    }
                }

                //Se establece la ciudad de llegada del vuelo
                ciudad = rs.getString("LLEGADA");
                for (int i = 0; i < this.cmbCiudadLlegada.getItemCount(); i++)  {
                    String item = this.cmbCiudadLlegada.getItemAt(i);
                    if (item.equals(ciudad)) {
                        this.cmbCiudadLlegada.setSelectedIndex(i);
                        break;
                    }
                }

                //Se activa solo el botón eliminar o se activan los controle que se pueden modificar
                //de acuerdo con lo seleccionado en el menú
                if(!this.modificar) {
                    this.btnGrabar.setEnabled(false);
                    this.btnBuscar.setEnabled(false);
                    this.btnEliminar.setEnabled(true);
                } else {
                    this.txtFecha.setEnabled(true);
                    this.txtHora.setEnabled(true);
                    this.cmbCiudadSalida.setEnabled(true);
                    this.cmbCiudadLlegada.setEnabled(true);

                    this.btnGrabar.setEnabled(true);
                    this.btnBuscar.setEnabled(false);
                    this.btnEliminar.setEnabled(false);
                }
                this.btnTiquetes.setEnabled(true);
            } else {
                this.txtNumeroVuelo.setEnabled(true);
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(frmVuelo.class.getName()).log(Level.SEVERE, null, ex);           
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        vuelosController ictrl = new vuelosController();
        Integer rs = ictrl.eliminarVuelo(this.txtNumeroVuelo.getText());
        
        if(rs > 0) {
            this.btnEliminar.setEnabled(false);
            this.labelMsg.setText("Vuelo eliminado");                
        } else {
            this.labelMsg.setText("Error no se pudo eliminar el vuelo");                
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnTiquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiquetesActionPerformed

        
        tiquetesController ictrl = new tiquetesController();
        ResultSet rs = ictrl.consultarTiquetes(this.txtNumeroVuelo.getText());

        frmTiquetes frmT = new frmTiquetes();                
        frmT.setLocationRelativeTo(null);
        frmT.setVisible(true);
        frmT.rs = rs;

    }//GEN-LAST:event_btnTiquetesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Button btnBuscar;
    public java.awt.Button btnEliminar;
    public java.awt.Button btnGrabar;
    public java.awt.Button btnTiquetes;
    public javax.swing.JComboBox<String> cmbCiudadLlegada;
    public javax.swing.JComboBox<String> cmbCiudadSalida;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    public java.awt.Label label1;
    public java.awt.Label label2;
    public java.awt.Label label3;
    public java.awt.Label label4;
    public java.awt.Label label5;
    public java.awt.Label label6;
    public java.awt.Label labelMsg;
    public com.toedter.calendar.JDateChooser txtFecha;
    public java.awt.TextField txtFilas;
    public com.github.lgooddatepicker.components.TimePicker txtHora;
    public java.awt.TextField txtNumeroVuelo;
    public java.awt.TextField txtRefe1;
    public java.awt.TextField txtRefe2;
    // End of variables declaration//GEN-END:variables
}
