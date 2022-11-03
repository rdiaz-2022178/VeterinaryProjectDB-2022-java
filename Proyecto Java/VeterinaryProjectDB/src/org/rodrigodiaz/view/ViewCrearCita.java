/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.rodrigodiaz.view;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.rodrigodiaz.controller.ControlDeServicios;
import org.rodrigodiaz.db.Conexion;
import java.sql.PreparedStatement;
import org.rodrigodiaz.controller.ControlDeCita;
import org.rodrigodiaz.model.Cita;


/**
 *
 * @author rodro
 */
public class ViewCrearCita extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCrearCita
     */
    public ViewCrearCita() {
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

        panelCrearCita = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombreMascotaCita = new javax.swing.JLabel();
        lblFechaCita = new javax.swing.JLabel();
        lblServicioCita = new javax.swing.JLabel();
        lblHoraCita = new javax.swing.JLabel();
        lblNombreDueñoCita = new javax.swing.JLabel();
        lblEmailCita = new javax.swing.JLabel();
        lblTelefonoCita = new javax.swing.JLabel();
        lblDpiCita = new javax.swing.JLabel();
        lblNitCita = new javax.swing.JLabel();
        botonCrearCita = new javax.swing.JButton();
        txtFechaCita = new javax.swing.JTextField();
        txtHoraCita = new javax.swing.JTextField();
        txtNombreMascotaCita = new javax.swing.JTextField();
        txtNitCita = new javax.swing.JTextField();
        txtNombreDueñoCita = new javax.swing.JTextField();
        txtEmailCita = new javax.swing.JTextField();
        txtTelefonoCita = new javax.swing.JTextField();
        txtDpiCita = new javax.swing.JTextField();
        cbServicioCita = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(224, 204, 208));
        setBorder(null);
        setClosable(true);
        setTitle("Crear Cita");

        panelCrearCita.setBackground(new java.awt.Color(204, 255, 255));
        panelCrearCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CREAR CITA");
        panelCrearCita.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 120, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoCita2.png"))); // NOI18N
        panelCrearCita.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
        panelCrearCita.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 510, 10));

        lblNombreMascotaCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreMascotaCita.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreMascotaCita.setText("Nombre Mascota");
        panelCrearCita.add(lblNombreMascotaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, -1));

        lblFechaCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblFechaCita.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaCita.setText("Fecha");
        panelCrearCita.add(lblFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, -1));

        lblServicioCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblServicioCita.setForeground(new java.awt.Color(0, 0, 0));
        lblServicioCita.setText("Servicio");
        panelCrearCita.add(lblServicioCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 100, -1));

        lblHoraCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblHoraCita.setForeground(new java.awt.Color(0, 0, 0));
        lblHoraCita.setText("Hora");
        panelCrearCita.add(lblHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, -1));

        lblNombreDueñoCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreDueñoCita.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreDueñoCita.setText("Nombre Dueño");
        panelCrearCita.add(lblNombreDueñoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, -1));

        lblEmailCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEmailCita.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailCita.setText("Email");
        panelCrearCita.add(lblEmailCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));

        lblTelefonoCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTelefonoCita.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefonoCita.setText("Telefono");
        panelCrearCita.add(lblTelefonoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 100, -1));

        lblDpiCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDpiCita.setForeground(new java.awt.Color(0, 0, 0));
        lblDpiCita.setText("DPI");
        panelCrearCita.add(lblDpiCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, -1));

        lblNitCita.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNitCita.setForeground(new java.awt.Color(0, 0, 0));
        lblNitCita.setText("Nit");
        panelCrearCita.add(lblNitCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 100, -1));

        botonCrearCita.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonCrearCita.setForeground(new java.awt.Color(0, 0, 0));
        botonCrearCita.setText("Crear");
        botonCrearCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCitaActionPerformed(evt);
            }
        });
        panelCrearCita.add(botonCrearCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 90, 30));

        txtFechaCita.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFechaCita.setForeground(new java.awt.Color(204, 204, 204));
        txtFechaCita.setText("AAAA-MM-DD");
        txtFechaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaCitaMousePressed(evt);
            }
        });
        panelCrearCita.add(txtFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 130, -1));

        txtHoraCita.setForeground(new java.awt.Color(204, 204, 204));
        txtHoraCita.setText("HH:MM:SS");
        txtHoraCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHoraCitaMousePressed(evt);
            }
        });
        panelCrearCita.add(txtHoraCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, -1));
        panelCrearCita.add(txtNombreMascotaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 130, -1));
        panelCrearCita.add(txtNitCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 130, -1));
        panelCrearCita.add(txtNombreDueñoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 130, -1));
        panelCrearCita.add(txtEmailCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, -1));
        panelCrearCita.add(txtTelefonoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, -1));
        panelCrearCita.add(txtDpiCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 130, -1));

        cbServicioCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anestesiologo", "Cardiologia", "Cirugia", "Dermatologia", "Fisioterapia", "Neurologia", "Oftalmologia", "Oncologia", "Ortopedia", "Equinos" }));
        panelCrearCita.add(cbServicioCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearCita, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearCita, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCitaActionPerformed
         Cita cita = new Cita();
         ControlDeCita controlador = new ControlDeCita();
         cita.setFechaCita(txtFechaCita.getText());
         cita.setHoraCita(txtHoraCita.getText());
         cita.setNombreMascotaCita(txtNombreMascotaCita.getText());
         cita.setNombreDueñoCita(txtNombreDueñoCita.getText());
         cita.setEmailDueñoCita(txtEmailCita.getText());
         cita.setTelefonoDueñoCita(txtTelefonoCita.getText());
         if (cbServicioCita.getSelectedItem().equals("Anestesiologo")) {
            cita.setIdServicioCita(1);
        }else if(cbServicioCita.getSelectedItem().equals("Cardiologia")){
            cita.setIdServicioCita(2);
        }else if(cbServicioCita.getSelectedItem().equals("Cirugia")){
            cita.setIdServicioCita(3);
        }else if(cbServicioCita.getSelectedItem().equals("Dermatologia")){
            cita.setIdServicioCita(4);
        }else if(cbServicioCita.getSelectedItem().equals("Fisioterapia")){
            cita.setIdServicioCita(5);
        }else if(cbServicioCita.getSelectedItem().equals("Neurologia")){
            cita.setIdServicioCita(6);
        }else if(cbServicioCita.getSelectedItem().equals("Oftalmologia")){
            cita.setIdServicioCita(7);
        }else if(cbServicioCita.getSelectedItem().equals("Oncologia")){
            cita.setIdServicioCita(8);
        }else if(cbServicioCita.getSelectedItem().equals("Ortopedia")){
            cita.setIdServicioCita(9);
        }else if(cbServicioCita.getSelectedItem().equals("Equinos")){
            cita.setIdServicioCita(10);
        }
         
         cita.setDpiDueñoCita(txtDpiCita.getText());
         cita.setNitDueñoCita(txtNitCita.getText());
         cita.setCostoCita(100f);
         cita.setEstado(true);
         controlador.agregarCliente(cita); 
         
         txtFechaCita.setText("");
         txtHoraCita.setText("");
         txtNombreDueñoCita.setText("");
         txtNombreMascotaCita.setText("");
         txtEmailCita.setText("");
         txtTelefonoCita.setText("");
         txtDpiCita.setText("");
         txtNitCita.setText("");
         setVisible(false);
         
         
    }//GEN-LAST:event_botonCrearCitaActionPerformed

    private void txtFechaCitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaCitaMousePressed
        if (txtFechaCita.getText().equals("AAAA-MM-DD")) {
            txtFechaCita.setText("");
            txtFechaCita.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtFechaCitaMousePressed

    private void txtHoraCitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraCitaMousePressed
        if (txtHoraCita.getText().equals("HH:MM:SS")) {
            txtHoraCita.setText("");
            txtHoraCita.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtHoraCitaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearCita;
    private javax.swing.JComboBox<String> cbServicioCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDpiCita;
    private javax.swing.JLabel lblEmailCita;
    private javax.swing.JLabel lblFechaCita;
    private javax.swing.JLabel lblHoraCita;
    private javax.swing.JLabel lblNitCita;
    private javax.swing.JLabel lblNombreDueñoCita;
    private javax.swing.JLabel lblNombreMascotaCita;
    private javax.swing.JLabel lblServicioCita;
    private javax.swing.JLabel lblTelefonoCita;
    private javax.swing.JPanel panelCrearCita;
    private javax.swing.JTextField txtDpiCita;
    private javax.swing.JTextField txtEmailCita;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtHoraCita;
    private javax.swing.JTextField txtNitCita;
    private javax.swing.JTextField txtNombreDueñoCita;
    private javax.swing.JTextField txtNombreMascotaCita;
    private javax.swing.JTextField txtTelefonoCita;
    // End of variables declaration//GEN-END:variables


}