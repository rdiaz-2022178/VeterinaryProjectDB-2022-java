/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.rodrigodiaz.view;

import javax.swing.JOptionPane;
import org.rodrigodiaz.controller.ControlDeDetalleCM;
import org.rodrigodiaz.model.DetalleCM;

/**
 *
 * @author rodro
 */
public class ViewEliminarDetalleCM extends javax.swing.JInternalFrame {
        DetalleCM detalle = new DetalleCM();
    ControlDeDetalleCM controlador = new ControlDeDetalleCM();

    /**
     * Creates new form ViewEliminarDetalleCM
     */
    public ViewEliminarDetalleCM() {
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

        panelCrearMascota = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();
        lblRazaMascota = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdIdBuscarDetalle = new javax.swing.JTextField();
        txtIdMascotaDetalle = new javax.swing.JTextField();
        botonCancelarEliminarDetalle = new javax.swing.JButton();
        lblEstadoMascota = new javax.swing.JLabel();
        checkEstadoDetalleCM = new javax.swing.JCheckBox();
        botonEliminarDetalle = new javax.swing.JButton();
        lblNombreMascota1 = new javax.swing.JLabel();
        txtIdClienteDetalle = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botonBuscarDetalleCM = new javax.swing.JButton();

        setClosable(true);

        panelCrearMascota.setBackground(new java.awt.Color(204, 255, 255));
        panelCrearMascota.setForeground(new java.awt.Color(204, 204, 204));
        panelCrearMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ELIMINAR DETALLE CLIENTE MASCOTA");
        panelCrearMascota.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 340, -1));

        lblNombreMascota.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreMascota.setText("Id a Buscar");
        panelCrearMascota.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, -1));

        lblRazaMascota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRazaMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblRazaMascota.setText("Id Mascota");
        panelCrearMascota.add(lblRazaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoDetalle2.png"))); // NOI18N
        panelCrearMascota.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panelCrearMascota.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 310, -1));
        panelCrearMascota.add(txtIdIdBuscarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, -1));
        panelCrearMascota.add(txtIdMascotaDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 200, -1));

        botonCancelarEliminarDetalle.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonCancelarEliminarDetalle.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelarEliminarDetalle.setText("Cancelar");
        botonCancelarEliminarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarEliminarDetalleActionPerformed(evt);
            }
        });
        panelCrearMascota.add(botonCancelarEliminarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, 30));

        lblEstadoMascota.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEstadoMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoMascota.setText("Estado");
        panelCrearMascota.add(lblEstadoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        checkEstadoDetalleCM.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        checkEstadoDetalleCM.setForeground(new java.awt.Color(0, 0, 0));
        checkEstadoDetalleCM.setText("Activo");
        panelCrearMascota.add(checkEstadoDetalleCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, -1));

        botonEliminarDetalle.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonEliminarDetalle.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminarDetalle.setText("Eliminar");
        botonEliminarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarDetalleActionPerformed(evt);
            }
        });
        panelCrearMascota.add(botonEliminarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, 30));

        lblNombreMascota1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreMascota1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreMascota1.setText("Id Cliente");
        panelCrearMascota.add(lblNombreMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, -1));
        panelCrearMascota.add(txtIdClienteDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, -1));
        panelCrearMascota.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 310, -1));

        botonBuscarDetalleCM.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonBuscarDetalleCM.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscarDetalleCM.setText("BUSCAR");
        botonBuscarDetalleCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarDetalleCMActionPerformed(evt);
            }
        });
        panelCrearMascota.add(botonBuscarDetalleCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarEliminarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarEliminarDetalleActionPerformed

        txtIdIdBuscarDetalle.setText("");
        txtIdClienteDetalle.setText("");
        txtIdMascotaDetalle.setText("");
        setVisible(false);
    }//GEN-LAST:event_botonCancelarEliminarDetalleActionPerformed

    private void botonEliminarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarDetalleActionPerformed
        detalle.setIdDetalleCM(Integer.parseInt(txtIdIdBuscarDetalle.getText()));
        controlador.ocultarDetalleCM(detalle);
        
        txtIdIdBuscarDetalle.setText("");
        txtIdClienteDetalle.setText("");
        txtIdMascotaDetalle.setText("");
        setVisible(false);
    }//GEN-LAST:event_botonEliminarDetalleActionPerformed

    private void botonBuscarDetalleCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarDetalleCMActionPerformed
        DetalleCM detalle = new DetalleCM();
        detalle.setIdDetalleCM(Integer.parseInt(txtIdIdBuscarDetalle.getText()));
        detalle = controlador.buscarDetalleCM(detalle);
        if (detalle != null) {
            txtIdClienteDetalle.setText(String.valueOf(detalle.getIdCliente()));
            txtIdMascotaDetalle.setText(String.valueOf(detalle.getIdMascota()));
        }else{
            JOptionPane.showMessageDialog(null, "El dato que buscar no se encuentra en la base de datos");
        }
    }//GEN-LAST:event_botonBuscarDetalleCMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarDetalleCM;
    private javax.swing.JButton botonCancelarEliminarDetalle;
    private javax.swing.JButton botonEliminarDetalle;
    private javax.swing.JCheckBox checkEstadoDetalleCM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEstadoMascota;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblNombreMascota1;
    private javax.swing.JLabel lblRazaMascota;
    private javax.swing.JPanel panelCrearMascota;
    private javax.swing.JTextField txtIdClienteDetalle;
    private javax.swing.JTextField txtIdIdBuscarDetalle;
    private javax.swing.JTextField txtIdMascotaDetalle;
    // End of variables declaration//GEN-END:variables
}