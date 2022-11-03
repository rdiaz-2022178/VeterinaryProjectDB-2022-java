/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.rodrigodiaz.view;

/**
 *
 * @author rodro
 */
public class VentanaDetalles extends javax.swing.JFrame {
    
    private ViewCrearDetalleCD instanciaViewCrearDetalleCD = null;
    private ViewCrearDetalleCM instanciaViewCrearDetalleCM = null;
    
    private ViewVerDetalleCD instanciaViewVerDetalleCD = null;
    private ViewVerDetalleCM instanciaViewVerDetalleCM = null;
    
    private ViewEliminarDetalleCM instanciaViewEliminarDetalleCM = null;
    private ViewEliminarDetalleCD instanciaViewEliminarDetalleCD = null;
    
    private ViewActualizarDetalleCD instanciaViewActualizarDetalleCD = null;
    private ViewActualizarDetalleCM instanciaViewActualizarDetalleCM = null;

    /**
     * Creates new form VentanaDetalles
     */
    public VentanaDetalles() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public synchronized ViewCrearDetalleCD getInstanciaViewCrearDetalleCD(){
        if(instanciaViewCrearDetalleCD == null){
            instanciaViewCrearDetalleCD = new ViewCrearDetalleCD();
            deskstopDetalle.add(instanciaViewCrearDetalleCD);
        }
        else if(instanciaViewCrearDetalleCD.isVisible() == false)
            instanciaViewCrearDetalleCD.setVisible(true);
        instanciaViewCrearDetalleCD.show();
        return instanciaViewCrearDetalleCD;
    }
    
    public synchronized ViewCrearDetalleCM getInstanciaViewCrearDetalleCM(){
        if(instanciaViewCrearDetalleCM == null){
            instanciaViewCrearDetalleCM = new ViewCrearDetalleCM();
            deskstopDetalle.add(instanciaViewCrearDetalleCM);
        }
        else if(instanciaViewCrearDetalleCM.isVisible() == false)
            instanciaViewCrearDetalleCM.setVisible(true);
        instanciaViewCrearDetalleCM.show();
        return instanciaViewCrearDetalleCM;
    }
    
    // ------------------------------------------------------------------------
    public synchronized ViewVerDetalleCD getInstanciaViewVerDetalleCD(){
        if(instanciaViewVerDetalleCD == null){
            instanciaViewVerDetalleCD = new ViewVerDetalleCD();
            deskstopDetalle.add(instanciaViewVerDetalleCD);
        }
        else if(instanciaViewVerDetalleCD.isVisible() == false)
            instanciaViewVerDetalleCD.setVisible(true);
        instanciaViewVerDetalleCD.show();
        return instanciaViewVerDetalleCD;
    }
    
    public synchronized ViewVerDetalleCM getInstanciaViewVerDetalleCM(){
        if(instanciaViewVerDetalleCM == null){
            instanciaViewVerDetalleCM = new ViewVerDetalleCM();
            deskstopDetalle.add(instanciaViewVerDetalleCM);
        }
        else if(instanciaViewVerDetalleCM.isVisible() == false)
            instanciaViewVerDetalleCM.setVisible(true);
        instanciaViewVerDetalleCM.show();
        return instanciaViewVerDetalleCM;
    }
    
    // --------------------------------------------------------------------
    public synchronized ViewEliminarDetalleCM getInstanciaViewEliminarDetalleCM(){
        if(instanciaViewEliminarDetalleCM == null){
            instanciaViewEliminarDetalleCM = new ViewEliminarDetalleCM();
            deskstopDetalle.add(instanciaViewEliminarDetalleCM);
        }
        else if(instanciaViewEliminarDetalleCM.isVisible() == false)
            instanciaViewEliminarDetalleCM.setVisible(true);
        instanciaViewEliminarDetalleCM.show();
        return instanciaViewEliminarDetalleCM;
    }
    
    public synchronized ViewEliminarDetalleCD getInstanciaViewEliminarDetalleCD(){
        if(instanciaViewEliminarDetalleCD == null){
            instanciaViewEliminarDetalleCD = new ViewEliminarDetalleCD();
            deskstopDetalle.add(instanciaViewEliminarDetalleCD);
        }
        else if(instanciaViewEliminarDetalleCD.isVisible() == false)
            instanciaViewEliminarDetalleCD.setVisible(true);
        instanciaViewEliminarDetalleCD.show();
        return instanciaViewEliminarDetalleCD;
    }
    
    // -------------------------------------------------------------------
    public synchronized ViewActualizarDetalleCD getInstanciaViewActualizarDetalleCD(){
        if(instanciaViewActualizarDetalleCD == null){
            instanciaViewActualizarDetalleCD = new ViewActualizarDetalleCD();
            deskstopDetalle.add(instanciaViewActualizarDetalleCD);
        }
        else if(instanciaViewActualizarDetalleCD.isVisible() == false)
            instanciaViewActualizarDetalleCD.setVisible(true);
        instanciaViewActualizarDetalleCD.show();
        return instanciaViewActualizarDetalleCD;
    }
    
    public synchronized ViewActualizarDetalleCM getInstanciaViewActualizarDetalleCM(){
        if(instanciaViewActualizarDetalleCM == null){
            instanciaViewActualizarDetalleCM = new ViewActualizarDetalleCM();
            deskstopDetalle.add(instanciaViewActualizarDetalleCM);
        }
        else if(instanciaViewActualizarDetalleCM.isVisible() == false)
            instanciaViewActualizarDetalleCM.setVisible(true);
        instanciaViewActualizarDetalleCM.show();
        return instanciaViewActualizarDetalleCM;
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_logoClient = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_logoClient1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonCrearCitasClient4 = new javax.swing.JButton();
        botonCrearCitasClient7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonCrearCitasClient1 = new javax.swing.JButton();
        botonCrearCitasClient2 = new javax.swing.JButton();
        botonCrearDetalleCD = new javax.swing.JButton();
        botonVerDetalleCD = new javax.swing.JButton();
        botonActualizarDetalleCD = new javax.swing.JButton();
        botonEliminarDetalleCD = new javax.swing.JButton();
        deskstopDetalle = new javax.swing.JDesktopPane();

        setTitle("Ventana Detalles");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(78, 184, 222));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logoClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoDetalleD.png"))); // NOI18N
        jPanel2.add(lbl_logoClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 10));

        jLabel6.setBackground(new java.awt.Color(51, 51, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CLIENTE-MASCOTA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 200, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoDetalleM.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoDetalleMedico.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jPanel3.setBackground(new java.awt.Color(78, 184, 222));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logoClient1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoDetalleD.png"))); // NOI18N
        jPanel3.add(lbl_logoClient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 10));

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CLIENTE-MASCOTA");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoDetalleM.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoDetalleMedico.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        botonCrearCitasClient4.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearCitasClient4.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearCitasClient4.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCitasClient4.setText("ELIMINAR");
        botonCrearCitasClient4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearCitasClient4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCitasClient4ActionPerformed(evt);
            }
        });
        jPanel3.add(botonCrearCitasClient4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 90, 30));

        botonCrearCitasClient7.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearCitasClient7.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearCitasClient7.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCitasClient7.setText("ACTUALIZAR");
        botonCrearCitasClient7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearCitasClient7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCitasClient7ActionPerformed(evt);
            }
        });
        jPanel3.add(botonCrearCitasClient7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 100, 30));

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CITA-DOCTOR");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, -1));

        botonCrearCitasClient1.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearCitasClient1.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearCitasClient1.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCitasClient1.setText("CREAR");
        botonCrearCitasClient1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearCitasClient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCitasClient1ActionPerformed(evt);
            }
        });
        jPanel3.add(botonCrearCitasClient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 100, 30));

        botonCrearCitasClient2.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearCitasClient2.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearCitasClient2.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCitasClient2.setText("VER");
        botonCrearCitasClient2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearCitasClient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCitasClient2ActionPerformed(evt);
            }
        });
        jPanel3.add(botonCrearCitasClient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 90, 30));

        botonCrearDetalleCD.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearDetalleCD.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearDetalleCD.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearDetalleCD.setText("CREAR");
        botonCrearDetalleCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearDetalleCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearDetalleCDActionPerformed(evt);
            }
        });
        jPanel3.add(botonCrearDetalleCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 100, 30));

        botonVerDetalleCD.setBackground(new java.awt.Color(0, 102, 102));
        botonVerDetalleCD.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerDetalleCD.setForeground(new java.awt.Color(255, 255, 255));
        botonVerDetalleCD.setText("VER");
        botonVerDetalleCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerDetalleCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDetalleCDActionPerformed(evt);
            }
        });
        jPanel3.add(botonVerDetalleCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 90, 30));

        botonActualizarDetalleCD.setBackground(new java.awt.Color(0, 102, 102));
        botonActualizarDetalleCD.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonActualizarDetalleCD.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarDetalleCD.setText("ACTUALIZAR");
        botonActualizarDetalleCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarDetalleCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarDetalleCDActionPerformed(evt);
            }
        });
        jPanel3.add(botonActualizarDetalleCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 100, 30));

        botonEliminarDetalleCD.setBackground(new java.awt.Color(0, 102, 102));
        botonEliminarDetalleCD.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonEliminarDetalleCD.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarDetalleCD.setText("ELIMINAR");
        botonEliminarDetalleCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarDetalleCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarDetalleCDActionPerformed(evt);
            }
        });
        jPanel3.add(botonEliminarDetalleCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 90, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 590));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 590));

        deskstopDetalle.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout deskstopDetalleLayout = new javax.swing.GroupLayout(deskstopDetalle);
        deskstopDetalle.setLayout(deskstopDetalleLayout);
        deskstopDetalleLayout.setHorizontalGroup(
            deskstopDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        deskstopDetalleLayout.setVerticalGroup(
            deskstopDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jPanel1.add(deskstopDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 680, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearCitasClient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCitasClient1ActionPerformed
        getInstanciaViewCrearDetalleCM();
    }//GEN-LAST:event_botonCrearCitasClient1ActionPerformed

    private void botonCrearCitasClient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCitasClient2ActionPerformed
        getInstanciaViewVerDetalleCM();
    }//GEN-LAST:event_botonCrearCitasClient2ActionPerformed

    private void botonCrearCitasClient4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCitasClient4ActionPerformed
        getInstanciaViewEliminarDetalleCM();
    }//GEN-LAST:event_botonCrearCitasClient4ActionPerformed

    private void botonCrearCitasClient7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCitasClient7ActionPerformed
        getInstanciaViewActualizarDetalleCM();
    }//GEN-LAST:event_botonCrearCitasClient7ActionPerformed

    private void botonCrearDetalleCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearDetalleCDActionPerformed
        getInstanciaViewCrearDetalleCD();
    }//GEN-LAST:event_botonCrearDetalleCDActionPerformed

    private void botonVerDetalleCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDetalleCDActionPerformed
        getInstanciaViewVerDetalleCD();
    }//GEN-LAST:event_botonVerDetalleCDActionPerformed

    private void botonActualizarDetalleCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarDetalleCDActionPerformed
        getInstanciaViewActualizarDetalleCD();
    }//GEN-LAST:event_botonActualizarDetalleCDActionPerformed

    private void botonEliminarDetalleCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarDetalleCDActionPerformed
        getInstanciaViewEliminarDetalleCD();
    }//GEN-LAST:event_botonEliminarDetalleCDActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarDetalleCD;
    private javax.swing.JButton botonCrearCitasClient1;
    private javax.swing.JButton botonCrearCitasClient2;
    private javax.swing.JButton botonCrearCitasClient4;
    private javax.swing.JButton botonCrearCitasClient7;
    private javax.swing.JButton botonCrearDetalleCD;
    private javax.swing.JButton botonEliminarDetalleCD;
    private javax.swing.JButton botonVerDetalleCD;
    private javax.swing.JDesktopPane deskstopDetalle;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_logoClient;
    private javax.swing.JLabel lbl_logoClient1;
    // End of variables declaration//GEN-END:variables
}
