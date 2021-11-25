/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Laura Traslaviña
 */
public class frmMenuAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuAdministrador
     */
    public frmMenuAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearVuelo = new java.awt.Button();
        btnEliminarVuelo = new java.awt.Button();
        btnModificarVuelo = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnCrearVuelo.setLabel("Crear Vuelo");
        btnCrearVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVueloActionPerformed(evt);
            }
        });

        btnEliminarVuelo.setLabel("Eliminar Vuelo");
        btnEliminarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVueloActionPerformed(evt);
            }
        });

        btnModificarVuelo.setLabel("Modificar Vuelo");
        btnModificarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVueloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCrearVuelo, btnEliminarVuelo, btnModificarVuelo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnCrearVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnModificarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnEliminarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVueloActionPerformed
        frmVuelo frmV = new frmVuelo();
        frmV.setTitle("Nuevo Vuelo");
        frmV.setLocationRelativeTo(null);
        frmV.setVisible(true);

        frmV.btnBuscar.setEnabled(false);
        frmV.btnEliminar.setEnabled(false);
        frmV.btnTiquetes.setEnabled(false);
        frmV.btnGrabar.setEnabled(true);
    }//GEN-LAST:event_btnCrearVueloActionPerformed

    private void btnModificarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVueloActionPerformed
        frmVuelo frmV = new frmVuelo();
        frmV.setTitle("Modificar Vuelo");
        frmV.setLocationRelativeTo(null);
        frmV.setVisible(true);

        frmV.modificar = true;
        frmV.txtNumeroVuelo.setEnabled(true);
        frmV.txtFecha.setEnabled(false);
        frmV.txtHora.setEnabled(false);
        frmV.cmbCiudadSalida.setEnabled(false);
        frmV.cmbCiudadLlegada.setEnabled(false);

        //No se permite modificar la cantidad de puestos del vuelo
        frmV.label6.setVisible(false);
        frmV.txtFilas.setVisible(false);
        
        frmV.btnBuscar.setEnabled(true);
        frmV.btnEliminar.setEnabled(false);
        frmV.btnTiquetes.setEnabled(false);
        frmV.btnGrabar.setEnabled(false);
    }//GEN-LAST:event_btnModificarVueloActionPerformed

    private void btnEliminarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVueloActionPerformed
        frmVuelo frmV = new frmVuelo();
        frmV.setTitle("Eliminar Vuelo");
        frmV.setLocationRelativeTo(null);
        frmV.setVisible(true);

        frmV.txtNumeroVuelo.setEnabled(true);

        frmV.txtFecha.setEnabled(false);
        frmV.txtHora.setEnabled(false);
        frmV.cmbCiudadSalida.setEnabled(false);
        frmV.cmbCiudadLlegada.setEnabled(false);

        frmV.label6.setVisible(false);
        frmV.txtFilas.setVisible(false);

        frmV.btnBuscar.setEnabled(true);
        frmV.btnEliminar.setEnabled(false);
        frmV.btnTiquetes.setEnabled(false);
        frmV.btnGrabar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarVueloActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setTitle("Menú de Administrador");
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCrearVuelo;
    private java.awt.Button btnEliminarVuelo;
    private java.awt.Button btnModificarVuelo;
    // End of variables declaration//GEN-END:variables
}