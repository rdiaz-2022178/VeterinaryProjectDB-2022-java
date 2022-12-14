/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.rodrigodiaz.view;

import org.rodrigodiaz.controller.ControlDeMascota;
import org.rodrigodiaz.model.Mascota;

/**
 *
 * @author rodro
 */
public class ViewCrearMascota extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCrearMascota
     */
    public ViewCrearMascota() {
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
        lblColorMascota = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombreMascota = new javax.swing.JTextField();
        txtColorMascota = new javax.swing.JTextField();
        txtRazaMascota = new javax.swing.JTextField();
        botonCrearMascota = new javax.swing.JButton();
        lblEstadoMascota = new javax.swing.JLabel();
        checkEstadoMascota = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setClosable(true);
        setTitle("Crear Mascota");

        panelCrearMascota.setBackground(new java.awt.Color(204, 255, 255));
        panelCrearMascota.setForeground(new java.awt.Color(204, 204, 204));
        panelCrearMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CREAR MASCOTA");
        panelCrearMascota.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lblNombreMascota.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreMascota.setText("Nombre Mascota");
        panelCrearMascota.add(lblNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblRazaMascota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRazaMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblRazaMascota.setText("Raza Mascota");
        panelCrearMascota.add(lblRazaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lblColorMascota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblColorMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblColorMascota.setText("Color Mascota");
        panelCrearMascota.add(lblColorMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoMascota2.png"))); // NOI18N
        panelCrearMascota.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        panelCrearMascota.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 310, -1));
        panelCrearMascota.add(txtNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, -1));
        panelCrearMascota.add(txtColorMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, -1));
        panelCrearMascota.add(txtRazaMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, -1));

        botonCrearMascota.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonCrearMascota.setForeground(new java.awt.Color(0, 0, 0));
        botonCrearMascota.setText("Crear");
        botonCrearMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearMascotaActionPerformed(evt);
            }
        });
        panelCrearMascota.add(botonCrearMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 30));

        lblEstadoMascota.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEstadoMascota.setForeground(new java.awt.Color(0, 0, 0));
        lblEstadoMascota.setText("Estado");
        panelCrearMascota.add(lblEstadoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        checkEstadoMascota.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        checkEstadoMascota.setForeground(new java.awt.Color(0, 0, 0));
        checkEstadoMascota.setText("Activo");
        panelCrearMascota.add(checkEstadoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearMascotaActionPerformed
        Mascota mascota = new Mascota();
        ControlDeMascota controlador = new ControlDeMascota();
        mascota.setNombreMascotaMascota(txtNombreMascota.getText());
        mascota.setRazaMascota(txtRazaMascota.getText());
        mascota.setColorMascota(txtColorMascota.getText());
        
        if (checkEstadoMascota.isSelected()) {
            mascota.setEstado(true);
        }
        else{
            mascota.setEstado(false);
        }
        controlador.agregarMascota(mascota);
        
        txtNombreMascota.setText("");
        txtRazaMascota.setText("");
        txtColorMascota.setText("");
        setVisible(false);
     
    }//GEN-LAST:event_botonCrearMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearMascota;
    private javax.swing.JCheckBox checkEstadoMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblColorMascota;
    private javax.swing.JLabel lblEstadoMascota;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblRazaMascota;
    private javax.swing.JPanel panelCrearMascota;
    private javax.swing.JTextField txtColorMascota;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtRazaMascota;
    // End of variables declaration//GEN-END:variables
}
