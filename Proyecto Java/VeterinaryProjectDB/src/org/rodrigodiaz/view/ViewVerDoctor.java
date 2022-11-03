/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.rodrigodiaz.view;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.rodrigodiaz.controller.ControlDeDoctor;
import org.rodrigodiaz.model.Doctor;

/**
 *
 * @author rodro
 */
public class ViewVerDoctor extends javax.swing.JInternalFrame {
    
    private ControlDeDoctor controlador = ControlDeDoctor.getInstancia();

    /**
     * Creates new form ViewVerMedico
     */
    public ViewVerDoctor() {
        initComponents();
        mostrarDoctor();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        botonVerDoctores = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ver Medico");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDeDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Doctor", "Nombre", "Apellido", "Telefono", "Direccion", "Id Departamento", "Especialidad", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tablaDeDoctor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 650, 240));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("VER MEDICOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 170, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 510, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoMedico3.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        botonVerDoctores.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonVerDoctores.setForeground(new java.awt.Color(0, 0, 0));
        botonVerDoctores.setText("ACEPTAR");
        botonVerDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDoctoresActionPerformed(evt);
            }
        });
        jPanel1.add(botonVerDoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDoctoresActionPerformed

        setVisible(false);

    }//GEN-LAST:event_botonVerDoctoresActionPerformed

    
    private void mostrarDoctor(){
        int cantidadDeElementos = controlador.cantidadDeDoctor();
        String [] encabezado = {"Id", "Nombre", "Apellido", "Telefono", "Direccion", "Id Departamento", "Especialidad"};
        DefaultTableModel cabecera = new DefaultTableModel(encabezado, cantidadDeElementos);
        tablaDeDoctor.setModel(cabecera);
        TableModel tablaDeDoctorVista = tablaDeDoctor.getModel();
        for (int i = 0; i < cantidadDeElementos; i++) {
            Doctor doctor = controlador.listaDeDoctor().get(i);
            tablaDeDoctor.setValueAt(doctor.getIdDoctor(), i, 0);
            tablaDeDoctor.setValueAt(doctor.getNombreDoctor(), i, 1);
            tablaDeDoctor.setValueAt(doctor.getApellidoDoctor(), i, 2);
            tablaDeDoctor.setValueAt(doctor.getTelefonoDoctor(), i, 3);
            tablaDeDoctor.setValueAt(doctor.getDireccionDoctor(), i, 4);
            tablaDeDoctor.setValueAt(doctor.getIdDepartamento(), i, 5);
            tablaDeDoctor.setValueAt(doctor.getEspecialidadDoctor(), i, 6);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVerDoctores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaDeDoctor;
    // End of variables declaration//GEN-END:variables
}