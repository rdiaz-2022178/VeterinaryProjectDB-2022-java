/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.rodrigodiaz.view;

import javax.swing.JOptionPane;
import org.rodrigodiaz.controller.ControlDeMascota;
import org.rodrigodiaz.model.Mascota;

/**
 *
 * @author rodro
 */
public class ViewEliminarMascota extends javax.swing.JInternalFrame {
            ControlDeMascota controlador = new ControlDeMascota();


    /**
     * Creates new form ViewEliminarMascota
     */
    public ViewEliminarMascota() {
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
        lblIdBuscarEliminar = new javax.swing.JLabel();
        lblColorMascota = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdMascotaBuscarEliminar = new javax.swing.JTextField();
        txtColorMascotaEliminar = new javax.swing.JTextField();
        txtRazaMascotaEliminar = new javax.swing.JTextField();
        botonCancelarEliminarMascota = new javax.swing.JButton();
        lblRazaMascota1 = new javax.swing.JLabel();
        txtNombreMascotaEliminar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botonEliminarMascota2 = new javax.swing.JButton();
        botonBuscarMascota = new javax.swing.JButton();

        setClosable(true);
        setTitle("Eliminar Mascota");

        panelCrearMascota.setBackground(new java.awt.Color(204, 255, 255));
        panelCrearMascota.setForeground(new java.awt.Color(204, 204, 204));
        panelCrearMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ELIMINAR MASCOTA");
        panelCrearMascota.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lblNombreMascota.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreMascota.setText("Nombre Mascota");
        panelCrearMascota.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, -1));

        lblIdBuscarEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdBuscarEliminar.setForeground(new java.awt.Color(0, 0, 0));
        lblIdBuscarEliminar.setText("Id a buscar");
        panelCrearMascota.add(lblIdBuscarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lblColorMascota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblColorMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblColorMascota.setText("Color Mascota");
        panelCrearMascota.add(lblColorMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoMascota2.png"))); // NOI18N
        panelCrearMascota.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        panelCrearMascota.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, -1));
        panelCrearMascota.add(txtIdMascotaBuscarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, -1));
        panelCrearMascota.add(txtColorMascotaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, -1));
        panelCrearMascota.add(txtRazaMascotaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, -1));

        botonCancelarEliminarMascota.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonCancelarEliminarMascota.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelarEliminarMascota.setText("CANCELAR");
        botonCancelarEliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarEliminarMascotaActionPerformed(evt);
            }
        });
        panelCrearMascota.add(botonCancelarEliminarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 30));

        lblRazaMascota1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRazaMascota1.setForeground(new java.awt.Color(0, 0, 0));
        lblRazaMascota1.setText("Raza Mascota");
        panelCrearMascota.add(lblRazaMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        panelCrearMascota.add(txtNombreMascotaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, -1));
        panelCrearMascota.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 310, -1));

        botonEliminarMascota2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonEliminarMascota2.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminarMascota2.setText("ELIMINAR");
        botonEliminarMascota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarMascota2ActionPerformed(evt);
            }
        });
        panelCrearMascota.add(botonEliminarMascota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 130, 30));

        botonBuscarMascota.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonBuscarMascota.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscarMascota.setText("BUSCAR");
        botonBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarMascotaActionPerformed(evt);
            }
        });
        panelCrearMascota.add(botonBuscarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarEliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarEliminarMascotaActionPerformed
        txtIdMascotaBuscarEliminar.setText("");
        txtNombreMascotaEliminar.setText("");
        txtRazaMascotaEliminar.setText("");
        txtColorMascotaEliminar.setText("");
        setVisible(false);

    }//GEN-LAST:event_botonCancelarEliminarMascotaActionPerformed

    private void botonEliminarMascota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarMascota2ActionPerformed
        Mascota mascota = new Mascota();
        mascota.setIdMascota(Integer.parseInt(txtIdMascotaBuscarEliminar.getText()));
        controlador.ocultarMascota(mascota);
        
        txtIdMascotaBuscarEliminar.setText("");
        txtNombreMascotaEliminar.setText("");
        txtRazaMascotaEliminar.setText("");
        txtColorMascotaEliminar.setText("");
        setVisible(false);
    }//GEN-LAST:event_botonEliminarMascota2ActionPerformed

    private void botonBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarMascotaActionPerformed
        Mascota mascota = new Mascota();
        mascota.setIdMascota(Integer.parseInt(txtIdMascotaBuscarEliminar.getText()));
        mascota = controlador.buscarMascota(mascota);
        if (mascota != null) {
            txtNombreMascotaEliminar.setText(mascota.getNombreMascotaMascota());
            txtRazaMascotaEliminar.setText(mascota.getRazaMascota());
            txtColorMascotaEliminar.setText(mascota.getColorMascota());
        }else{
            JOptionPane.showMessageDialog(null, "El dato que buscar no se encuentra en la base de datos");
        }
    }//GEN-LAST:event_botonBuscarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarMascota;
    private javax.swing.JButton botonCancelarEliminarMascota;
    private javax.swing.JButton botonEliminarMascota2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblColorMascota;
    private javax.swing.JLabel lblIdBuscarEliminar;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblRazaMascota1;
    private javax.swing.JPanel panelCrearMascota;
    private javax.swing.JTextField txtColorMascotaEliminar;
    private javax.swing.JTextField txtIdMascotaBuscarEliminar;
    private javax.swing.JTextField txtNombreMascotaEliminar;
    private javax.swing.JTextField txtRazaMascotaEliminar;
    // End of variables declaration//GEN-END:variables
}
