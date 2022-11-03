/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.rodrigodiaz.view;

/**
 *
 * @author rodro
 */
public class VentanaClientVeterinary extends javax.swing.JFrame {
    
    private ViewCrearCita instanciaViewCrearCita = null;
    private ViewActualizarCita instanciaViewActualizarCita = null;
    private ViewEliminarCita instanciaViewEliminarCita = null;
    
    private ViewCrearMascota instanciaViewCrearMascota = null;
    private ViewVerMascota instanciaViewVerMascota = null;
    
    private ViewVerDoctor instanciaViewVerMedico = null;
    
    private ViewVerServicios instanciaViewVerServicios = null;

    /**
     * Creates new form ViewClientVeterinary
     */
    public VentanaClientVeterinary() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
            public synchronized ViewCrearCita getInstanciaViewCrearCita(){
        if(instanciaViewCrearCita == null){
            instanciaViewCrearCita = new ViewCrearCita();
            desktopViewClient.add(instanciaViewCrearCita);
        }
        else if(instanciaViewCrearCita.isVisible() == false)
            instanciaViewCrearCita.setVisible(true);
        instanciaViewCrearCita.show();
        return instanciaViewCrearCita;
    }    
    
    public synchronized ViewActualizarCita getInstanciaViewActualizarCita(){
        if(instanciaViewActualizarCita == null){
            instanciaViewActualizarCita = new ViewActualizarCita();
            desktopViewClient.add(instanciaViewActualizarCita);
        }
        else if(instanciaViewActualizarCita.isVisible() == false)
            instanciaViewActualizarCita.setVisible(true);
        instanciaViewActualizarCita.show();
        return instanciaViewActualizarCita;
    }
        
        public synchronized ViewEliminarCita getInstanciaViewEliminarCita(){
        if(instanciaViewEliminarCita == null){
            instanciaViewEliminarCita = new ViewEliminarCita();
            desktopViewClient.add(instanciaViewEliminarCita);
        }
        else if(instanciaViewEliminarCita.isVisible() == false)
            instanciaViewEliminarCita.setVisible(true);
        instanciaViewEliminarCita.show();
        return instanciaViewEliminarCita;
    }
        
        // ------------------------------------------------------------------------
                public synchronized ViewCrearMascota getInstanciaViewCrearMascota(){
        if(instanciaViewCrearMascota == null){
            instanciaViewCrearMascota = new ViewCrearMascota();
            desktopViewClient.add(instanciaViewCrearMascota);
        }
        else if(instanciaViewCrearMascota.isVisible() == false)
            instanciaViewCrearMascota.setVisible(true);
        instanciaViewCrearMascota.show();
        return instanciaViewCrearMascota;
    }
        
        public synchronized ViewVerMascota getInstanciaViewVerMascota(){
        if(instanciaViewVerMascota == null){
            instanciaViewVerMascota = new ViewVerMascota();
            desktopViewClient.add(instanciaViewVerMascota);
        }
        else if(instanciaViewVerMascota.isVisible() == false)
            instanciaViewVerMascota.setVisible(true);
        instanciaViewVerMascota.show();
        return instanciaViewVerMascota;
    }
        
        // -------------------------------------------------------------------------------
        public synchronized ViewVerDoctor getInstanciaViewVerMedico(){
        if(instanciaViewVerMedico == null){
            instanciaViewVerMedico = new ViewVerDoctor();
            desktopViewClient.add(instanciaViewVerMedico);
        }
        else if(instanciaViewVerMedico.isVisible() == false)
            instanciaViewVerMedico.setVisible(true);
        instanciaViewVerMedico.show();
        return instanciaViewVerMedico;
    }
        
        // -----------------------------------------------------------------
        
       public synchronized ViewVerServicios getInstanciaViewVerServicios(){
        if(instanciaViewVerServicios == null){
            instanciaViewVerServicios = new ViewVerServicios();
            desktopViewClient.add(instanciaViewVerServicios);
        }
        else if(instanciaViewVerServicios.isVisible() == false)
            instanciaViewVerServicios.setVisible(true);
        instanciaViewVerServicios.show();
        return instanciaViewVerServicios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelViewClient = new javax.swing.JPanel();
        lbl_logoClient = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        botonCrearCitasClient = new javax.swing.JButton();
        botonEliminarCitasClient = new javax.swing.JButton();
        botonActualizarCitasClient = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonVerMascotasClient = new javax.swing.JButton();
        botonCrearMascotaClient = new javax.swing.JButton();
        botonVerMedicosClient = new javax.swing.JButton();
        desktopViewClient = new javax.swing.JDesktopPane();
        botonVerPrecios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelViewClient.setBackground(new java.awt.Color(78, 184, 222));

        lbl_logoClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoCliente2.png"))); // NOI18N
        lbl_logoClient.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoCita2.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoMedico3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel6.setBackground(new java.awt.Color(51, 51, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITAS");

        botonCrearCitasClient.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearCitasClient.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearCitasClient.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCitasClient.setText("CREAR");
        botonCrearCitasClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearCitasClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCitasClientActionPerformed(evt);
            }
        });

        botonEliminarCitasClient.setBackground(new java.awt.Color(0, 102, 102));
        botonEliminarCitasClient.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonEliminarCitasClient.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarCitasClient.setText("ELIMINAR");
        botonEliminarCitasClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarCitasClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCitasClientActionPerformed(evt);
            }
        });

        botonActualizarCitasClient.setBackground(new java.awt.Color(0, 102, 102));
        botonActualizarCitasClient.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonActualizarCitasClient.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarCitasClient.setText("ACTUALIZAR");
        botonActualizarCitasClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarCitasClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarCitasClientActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEDICOS");

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MASCOTAS");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoMascota2.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        botonVerMascotasClient.setBackground(new java.awt.Color(0, 102, 102));
        botonVerMascotasClient.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerMascotasClient.setForeground(new java.awt.Color(255, 255, 255));
        botonVerMascotasClient.setText("VER");
        botonVerMascotasClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerMascotasClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerMascotasClientActionPerformed(evt);
            }
        });

        botonCrearMascotaClient.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearMascotaClient.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearMascotaClient.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearMascotaClient.setText("CREAR");
        botonCrearMascotaClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearMascotaClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearMascotaClientActionPerformed(evt);
            }
        });

        botonVerMedicosClient.setBackground(new java.awt.Color(0, 102, 102));
        botonVerMedicosClient.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerMedicosClient.setForeground(new java.awt.Color(255, 255, 255));
        botonVerMedicosClient.setText("VER");
        botonVerMedicosClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerMedicosClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerMedicosClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewClientLayout = new javax.swing.GroupLayout(panelViewClient);
        panelViewClient.setLayout(panelViewClientLayout);
        panelViewClientLayout.setHorizontalGroup(
            panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewClientLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewClientLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_logoClient, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(panelViewClientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewClientLayout.createSequentialGroup()
                        .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelViewClientLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewClientLayout.createSequentialGroup()
                        .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewClientLayout.createSequentialGroup()
                                .addComponent(botonCrearCitasClient, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarCitasClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewClientLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelViewClientLayout.createSequentialGroup()
                                        .addComponent(botonVerMascotasClient, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonCrearMascotaClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panelViewClientLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(29, 29, 29)))))
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewClientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVerMedicosClient, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(panelViewClientLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(botonActualizarCitasClient, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelViewClientLayout.setVerticalGroup(
            panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewClientLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_logoClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCrearCitasClient, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(botonEliminarCitasClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(botonActualizarCitasClient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonVerMascotasClient, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(botonCrearMascotaClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVerMedicosClient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(panelViewClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        desktopViewClient.setBackground(new java.awt.Color(255, 255, 255));

        botonVerPrecios.setBackground(new java.awt.Color(0, 102, 102));
        botonVerPrecios.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerPrecios.setForeground(new java.awt.Color(255, 255, 255));
        botonVerPrecios.setText("VER SERVICIOS");
        botonVerPrecios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPreciosActionPerformed(evt);
            }
        });

        desktopViewClient.setLayer(botonVerPrecios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopViewClientLayout = new javax.swing.GroupLayout(desktopViewClient);
        desktopViewClient.setLayout(desktopViewClientLayout);
        desktopViewClientLayout.setHorizontalGroup(
            desktopViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopViewClientLayout.createSequentialGroup()
                .addGap(597, 597, 597)
                .addComponent(botonVerPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desktopViewClientLayout.setVerticalGroup(
            desktopViewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopViewClientLayout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addComponent(botonVerPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(desktopViewClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 0, 770, 585));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearCitasClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCitasClientActionPerformed
        getInstanciaViewCrearCita();
    }//GEN-LAST:event_botonCrearCitasClientActionPerformed

    private void botonEliminarCitasClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCitasClientActionPerformed
        getInstanciaViewEliminarCita();
    }//GEN-LAST:event_botonEliminarCitasClientActionPerformed

    private void botonActualizarCitasClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarCitasClientActionPerformed
        getInstanciaViewActualizarCita();
    }//GEN-LAST:event_botonActualizarCitasClientActionPerformed

    private void botonVerMascotasClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerMascotasClientActionPerformed
        getInstanciaViewVerMascota();
        

    }//GEN-LAST:event_botonVerMascotasClientActionPerformed

    private void botonCrearMascotaClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearMascotaClientActionPerformed
        getInstanciaViewCrearMascota();
    }//GEN-LAST:event_botonCrearMascotaClientActionPerformed

    private void botonVerMedicosClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerMedicosClientActionPerformed
        getInstanciaViewVerMedico();
    }//GEN-LAST:event_botonVerMedicosClientActionPerformed

    private void botonVerPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPreciosActionPerformed
        getInstanciaViewVerServicios();
    }//GEN-LAST:event_botonVerPreciosActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarCitasClient;
    private javax.swing.JButton botonCrearCitasClient;
    private javax.swing.JButton botonCrearMascotaClient;
    private javax.swing.JButton botonEliminarCitasClient;
    private javax.swing.JButton botonVerMascotasClient;
    private javax.swing.JButton botonVerMedicosClient;
    private javax.swing.JButton botonVerPrecios;
    private javax.swing.JDesktopPane desktopViewClient;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_logoClient;
    private javax.swing.JPanel panelViewClient;
    // End of variables declaration//GEN-END:variables
}