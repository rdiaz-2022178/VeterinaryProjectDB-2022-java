/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.rodrigodiaz.view;

/**
 *
 * @author rodro
 */
public class VentanaAdminVeterinary extends javax.swing.JFrame {
    
        private ViewCrearCita instanciaViewCrearCita = null;
        private ViewVerCita instanciaViewVerCita = null;
        private ViewActualizarCita instanciaViewActualizarCita = null;
        private ViewEliminarCita instanciaViewEliminarCita = null;
        
        private ViewCrearDoctor instanciaViewCrearMedico = null;
        private ViewVerDoctor instanciaViewVerMedico = null;
        private ViewActualizarDoctor instanciaViewActualizarMedico = null;
        private ViewEliminarDoctor instanciaViewEliminarMedico = null;
        
        private ViewCrearMascota instanciaViewCrearMascota = null;
        private ViewVerMascota instanciaViewVerMascota = null;
        private ViewActualizarMascota instanciaViewActualizarMascota = null;
        private ViewEliminarMascota instanciaViewEliminarMascota = null;
        
        private ViewCrearCliente instanciaViewCrearUsuario = null;
        private ViewVerCliente instanciaViewVerUsuario = null;
        private ViewActualizarCliente instanciaViewActualizarUsuario = null;
        private ViewEliminarCliente instanciaViewEliminarUsuario = null;
        
        private VentanaDetalles ventanaDetalles = new VentanaDetalles();
        
        
        


    /**
     * Creates new form ViewAdminVeterinaty
     */
    public VentanaAdminVeterinary() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
        public synchronized ViewCrearCita getInstanciaViewCrearCita(){
        if(instanciaViewCrearCita == null){
            instanciaViewCrearCita = new ViewCrearCita();
            desktopViewAdmin.add(instanciaViewCrearCita);
        }
        else if(instanciaViewCrearCita.isVisible() == false)
            instanciaViewCrearCita.setVisible(true);
        instanciaViewCrearCita.show();
        return instanciaViewCrearCita;
    }
        
        public synchronized ViewVerCita getInstanciaViewVerCita(){
        if(instanciaViewVerCita == null){
            instanciaViewVerCita = new ViewVerCita();
            desktopViewAdmin.add(instanciaViewVerCita);
        }
        else if(instanciaViewVerCita.isVisible() == false)
            instanciaViewVerCita.setVisible(true);
        instanciaViewVerCita.show();
        return instanciaViewVerCita;
    }
        
        public synchronized ViewActualizarCita getInstanciaViewActualizarCita(){
        if(instanciaViewActualizarCita == null){
            instanciaViewActualizarCita = new ViewActualizarCita();
            desktopViewAdmin.add(instanciaViewActualizarCita);
        }
        else if(instanciaViewActualizarCita.isVisible() == false)
            instanciaViewActualizarCita.setVisible(true);
        instanciaViewActualizarCita.show();
        return instanciaViewActualizarCita;
    }
        
        public synchronized ViewEliminarCita getInstanciaViewEliminarCita(){
        if(instanciaViewEliminarCita == null){
            instanciaViewEliminarCita = new ViewEliminarCita();
            desktopViewAdmin.add(instanciaViewEliminarCita);
        }
        else if(instanciaViewEliminarCita.isVisible() == false)
            instanciaViewEliminarCita.setVisible(true);
        instanciaViewEliminarCita.show();
        return instanciaViewEliminarCita;
    }
        
        // -----------------------------------------------------------------------------
        
        public synchronized ViewCrearDoctor getInstanciaViewCrearMedico(){
        if(instanciaViewCrearMedico == null){
            instanciaViewCrearMedico = new ViewCrearDoctor();
            desktopViewAdmin.add(instanciaViewCrearMedico);
        }
        else if(instanciaViewCrearMedico.isVisible() == false)
            instanciaViewCrearMedico.setVisible(true);
        instanciaViewCrearMedico.show();
        return instanciaViewCrearMedico;
    }
        
        public synchronized ViewVerDoctor getInstanciaViewVerMedico(){
        if(instanciaViewVerMedico == null){
            instanciaViewVerMedico = new ViewVerDoctor();
            desktopViewAdmin.add(instanciaViewVerMedico);
        }
        else if(instanciaViewVerMedico.isVisible() == false)
            instanciaViewVerMedico.setVisible(true);
        instanciaViewVerMedico.show();
        return instanciaViewVerMedico;
    }
        
        public synchronized ViewActualizarDoctor getInstanciaViewActualizarMedico(){
        if(instanciaViewActualizarMedico == null){
            instanciaViewActualizarMedico = new ViewActualizarDoctor();
            desktopViewAdmin.add(instanciaViewActualizarMedico);
        }
        else if(instanciaViewActualizarMedico.isVisible() == false)
            instanciaViewActualizarMedico.setVisible(true);
        instanciaViewActualizarMedico.show();
        return instanciaViewActualizarMedico;
    }
        
        public synchronized ViewEliminarDoctor getInstanciaViewEliminarMedico(){
        if(instanciaViewEliminarMedico == null){
            instanciaViewEliminarMedico = new ViewEliminarDoctor();
            desktopViewAdmin.add(instanciaViewEliminarMedico);
        }
        else if(instanciaViewEliminarMedico.isVisible() == false)
            instanciaViewEliminarMedico.setVisible(true);
        instanciaViewEliminarMedico.show();
        return instanciaViewEliminarMedico;
    }
        
        // ------------------------------------------------------------------------
        public synchronized ViewCrearMascota getInstanciaViewCrearMascota(){
        if(instanciaViewCrearMascota == null){
            instanciaViewCrearMascota = new ViewCrearMascota();
            desktopViewAdmin.add(instanciaViewCrearMascota);
        }
        else if(instanciaViewCrearMascota.isVisible() == false)
            instanciaViewCrearMascota.setVisible(true);
        instanciaViewCrearMascota.show();
        return instanciaViewCrearMascota;
    }
        
        public synchronized ViewVerMascota getInstanciaViewVerMascota(){
        if(instanciaViewVerMascota == null){
            instanciaViewVerMascota = new ViewVerMascota();
            desktopViewAdmin.add(instanciaViewVerMascota);
        }
        else if(instanciaViewVerMascota.isVisible() == false)
            instanciaViewVerMascota.setVisible(true);
        instanciaViewVerMascota.show();
        return instanciaViewVerMascota;
    }
        
        public synchronized ViewActualizarMascota getInstanciaViewActualizarMascota(){
        if(instanciaViewActualizarMascota == null){
            instanciaViewActualizarMascota = new ViewActualizarMascota();
            desktopViewAdmin.add(instanciaViewActualizarMascota);
        }
        else if(instanciaViewActualizarMascota.isVisible() == false)
            instanciaViewActualizarMascota.setVisible(true);
        instanciaViewActualizarMascota.show();
        return instanciaViewActualizarMascota;
    }
        
        public synchronized ViewEliminarMascota getInstanciaViewEliminarMascota(){
        if(instanciaViewEliminarMascota == null){
            instanciaViewEliminarMascota = new ViewEliminarMascota();
            desktopViewAdmin.add(instanciaViewEliminarMascota);
        }
        else if(instanciaViewEliminarMascota.isVisible() == false)
            instanciaViewEliminarMascota.setVisible(true);
        instanciaViewEliminarMascota.show();
        return instanciaViewEliminarMascota;
    }
        
        // ---------------------------------------------------------------------------
        public synchronized ViewCrearCliente getInstanciaViewCrearUsuario(){
        if(instanciaViewCrearUsuario == null){
            instanciaViewCrearUsuario = new ViewCrearCliente();
            desktopViewAdmin.add(instanciaViewCrearUsuario);
        }
        else if(instanciaViewCrearUsuario.isVisible() == false)
            instanciaViewCrearUsuario.setVisible(true);
        instanciaViewCrearUsuario.show();
        return instanciaViewCrearUsuario;
    }
        
        public synchronized ViewVerCliente getInstanciaViewVerUsuario(){
        if(instanciaViewVerUsuario == null){
            instanciaViewVerUsuario = new ViewVerCliente();
            desktopViewAdmin.add(instanciaViewVerUsuario);
        }
        else if(instanciaViewVerUsuario.isVisible() == false)
            instanciaViewVerUsuario.setVisible(true);
        instanciaViewVerUsuario.show();
        return instanciaViewVerUsuario;
    }
        
        public synchronized ViewActualizarCliente getInstanciaViewActualizarUsuario(){
        if(instanciaViewActualizarUsuario == null){
            instanciaViewActualizarUsuario = new ViewActualizarCliente();
            desktopViewAdmin.add(instanciaViewActualizarUsuario);
        }
        else if(instanciaViewActualizarUsuario.isVisible() == false)
            instanciaViewActualizarUsuario.setVisible(true);
        instanciaViewActualizarUsuario.show();
        return instanciaViewActualizarUsuario;
    }
        
        public synchronized ViewEliminarCliente getInstanciaViewEliminarUsuario(){
        if(instanciaViewEliminarUsuario == null){
            instanciaViewEliminarUsuario = new ViewEliminarCliente();
            desktopViewAdmin.add(instanciaViewEliminarUsuario);
        }
        else if(instanciaViewEliminarUsuario.isVisible() == false)
            instanciaViewEliminarUsuario.setVisible(true);
        instanciaViewEliminarUsuario.show();
        return instanciaViewEliminarUsuario;
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrounViewAdminVeterinary = new javax.swing.JPanel();
        panelViewAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonCrearCitasAdmin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonVerCitasAdmin = new javax.swing.JButton();
        botonActualizarCitasAdmin = new javax.swing.JButton();
        botonEliminarCitasAdmin = new javax.swing.JButton();
        botonEliminarMedicosAdmin = new javax.swing.JButton();
        botonActualizarMedicosAdmin = new javax.swing.JButton();
        botonVerMedicosAdmin = new javax.swing.JButton();
        botonCrearMedicosAdmin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botonVerMascotasAdmin = new javax.swing.JButton();
        botonCrearMascotasAdmin = new javax.swing.JButton();
        botonActualizarMascotasAdmin = new javax.swing.JButton();
        botonEliminarMascotasAdmin = new javax.swing.JButton();
        botonVerUsuariosAdmin = new javax.swing.JButton();
        botonCrearUsuariosAdmin = new javax.swing.JButton();
        botonActualizarUsuariosAdmin = new javax.swing.JButton();
        botonEliminarUsuariosAdmin = new javax.swing.JButton();
        desktopViewAdmin = new javax.swing.JDesktopPane();
        botonCrearMascotaClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 900));

        backgrounViewAdminVeterinary.setBackground(new java.awt.Color(255, 255, 255));
        backgrounViewAdminVeterinary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelViewAdmin.setBackground(new java.awt.Color(78, 184, 222));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoAdmin3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel6.setBackground(new java.awt.Color(51, 51, 255));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITAS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoMedico3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoCita2.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoMascota2.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/resource/iconoCliente3.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        botonCrearCitasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearCitasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearCitasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCitasAdmin.setText("CREAR");
        botonCrearCitasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearCitasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCitasAdminActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEDICOS");

        botonVerCitasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonVerCitasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerCitasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonVerCitasAdmin.setText("VER");
        botonVerCitasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerCitasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerCitasAdminActionPerformed(evt);
            }
        });

        botonActualizarCitasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonActualizarCitasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonActualizarCitasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarCitasAdmin.setText("ACTUALIZAR");
        botonActualizarCitasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarCitasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarCitasAdminActionPerformed(evt);
            }
        });

        botonEliminarCitasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonEliminarCitasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonEliminarCitasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarCitasAdmin.setText("ELIMINAR");
        botonEliminarCitasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarCitasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCitasAdminActionPerformed(evt);
            }
        });

        botonEliminarMedicosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonEliminarMedicosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonEliminarMedicosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarMedicosAdmin.setText("ELIMINAR");
        botonEliminarMedicosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarMedicosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarMedicosAdminActionPerformed(evt);
            }
        });

        botonActualizarMedicosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonActualizarMedicosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonActualizarMedicosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarMedicosAdmin.setText("ACTUALIZAR");
        botonActualizarMedicosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarMedicosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarMedicosAdminActionPerformed(evt);
            }
        });

        botonVerMedicosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonVerMedicosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerMedicosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonVerMedicosAdmin.setText("VER");
        botonVerMedicosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerMedicosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerMedicosAdminActionPerformed(evt);
            }
        });

        botonCrearMedicosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearMedicosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearMedicosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearMedicosAdmin.setText("CREAR");
        botonCrearMedicosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearMedicosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearMedicosAdminActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MASCOTAS");

        jLabel9.setBackground(new java.awt.Color(51, 51, 255));
        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CLIENTES");

        botonVerMascotasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonVerMascotasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerMascotasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonVerMascotasAdmin.setText("VER");
        botonVerMascotasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerMascotasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerMascotasAdminActionPerformed(evt);
            }
        });

        botonCrearMascotasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearMascotasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearMascotasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearMascotasAdmin.setText("CREAR");
        botonCrearMascotasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearMascotasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearMascotasAdminActionPerformed(evt);
            }
        });

        botonActualizarMascotasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonActualizarMascotasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonActualizarMascotasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarMascotasAdmin.setText("ACTUALIZAR");
        botonActualizarMascotasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarMascotasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarMascotasAdminActionPerformed(evt);
            }
        });

        botonEliminarMascotasAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonEliminarMascotasAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonEliminarMascotasAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarMascotasAdmin.setText("ELIMINAR");
        botonEliminarMascotasAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarMascotasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarMascotasAdminActionPerformed(evt);
            }
        });

        botonVerUsuariosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonVerUsuariosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonVerUsuariosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonVerUsuariosAdmin.setText("VER");
        botonVerUsuariosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerUsuariosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerUsuariosAdminActionPerformed(evt);
            }
        });

        botonCrearUsuariosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearUsuariosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonCrearUsuariosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearUsuariosAdmin.setText("CREAR");
        botonCrearUsuariosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearUsuariosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearUsuariosAdminActionPerformed(evt);
            }
        });

        botonActualizarUsuariosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonActualizarUsuariosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonActualizarUsuariosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizarUsuariosAdmin.setText("ACTUALIZAR");
        botonActualizarUsuariosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarUsuariosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarUsuariosAdminActionPerformed(evt);
            }
        });

        botonEliminarUsuariosAdmin.setBackground(new java.awt.Color(0, 102, 102));
        botonEliminarUsuariosAdmin.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        botonEliminarUsuariosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarUsuariosAdmin.setText("ELIMINAR");
        botonEliminarUsuariosAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarUsuariosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarUsuariosAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewAdminLayout = new javax.swing.GroupLayout(panelViewAdmin);
        panelViewAdmin.setLayout(panelViewAdminLayout);
        panelViewAdminLayout.setHorizontalGroup(
            panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelViewAdminLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewAdminLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelViewAdminLayout.createSequentialGroup()
                        .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelViewAdminLayout.createSequentialGroup()
                                .addComponent(botonActualizarUsuariosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarUsuariosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelViewAdminLayout.createSequentialGroup()
                                .addComponent(botonVerUsuariosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCrearUsuariosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelViewAdminLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9))
                            .addGroup(panelViewAdminLayout.createSequentialGroup()
                                .addComponent(botonActualizarMascotasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarMascotasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelViewAdminLayout.createSequentialGroup()
                                    .addComponent(botonVerMascotasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonCrearMascotasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelViewAdminLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel7))
                                .addGroup(panelViewAdminLayout.createSequentialGroup()
                                    .addComponent(botonVerCitasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonCrearCitasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelViewAdminLayout.createSequentialGroup()
                                    .addComponent(botonActualizarCitasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonEliminarCitasAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelViewAdminLayout.createSequentialGroup()
                                    .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(botonVerMedicosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonActualizarMedicosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonEliminarMedicosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonCrearMedicosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewAdminLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel8)
                                    .addGap(14, 14, 14))))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );
        panelViewAdminLayout.setVerticalGroup(
            panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelViewAdminLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)))
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonVerCitasAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(botonCrearCitasAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarCitasAdmin)
                    .addComponent(botonEliminarCitasAdmin))
                .addGap(24, 24, 24)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerMedicosAdmin)
                    .addComponent(botonCrearMedicosAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarMedicosAdmin)
                    .addComponent(botonActualizarMedicosAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerMascotasAdmin)
                    .addComponent(botonCrearMascotasAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarMascotasAdmin)
                    .addComponent(botonEliminarMascotasAdmin))
                .addGap(18, 18, 18)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerUsuariosAdmin)
                    .addComponent(botonCrearUsuariosAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarUsuariosAdmin)
                    .addComponent(botonEliminarUsuariosAdmin))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        backgrounViewAdminVeterinary.add(panelViewAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 670));

        desktopViewAdmin.setBackground(new java.awt.Color(255, 255, 255));

        botonCrearMascotaClient.setBackground(new java.awt.Color(0, 102, 102));
        botonCrearMascotaClient.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        botonCrearMascotaClient.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearMascotaClient.setText("DETALLES");
        botonCrearMascotaClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearMascotaClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearMascotaClientActionPerformed(evt);
            }
        });

        desktopViewAdmin.setLayer(botonCrearMascotaClient, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopViewAdminLayout = new javax.swing.GroupLayout(desktopViewAdmin);
        desktopViewAdmin.setLayout(desktopViewAdminLayout);
        desktopViewAdminLayout.setHorizontalGroup(
            desktopViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopViewAdminLayout.createSequentialGroup()
                .addGap(658, 658, 658)
                .addComponent(botonCrearMascotaClient, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        desktopViewAdminLayout.setVerticalGroup(
            desktopViewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopViewAdminLayout.createSequentialGroup()
                .addGap(606, 606, 606)
                .addComponent(botonCrearMascotaClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        backgrounViewAdminVeterinary.add(desktopViewAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 820, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrounViewAdminVeterinary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrounViewAdminVeterinary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearCitasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCitasAdminActionPerformed
        getInstanciaViewCrearCita();
    }//GEN-LAST:event_botonCrearCitasAdminActionPerformed

    private void botonVerCitasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerCitasAdminActionPerformed
        getInstanciaViewVerCita();
    }//GEN-LAST:event_botonVerCitasAdminActionPerformed

    private void botonActualizarCitasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarCitasAdminActionPerformed
        getInstanciaViewActualizarCita();
    }//GEN-LAST:event_botonActualizarCitasAdminActionPerformed

    private void botonEliminarCitasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCitasAdminActionPerformed
        getInstanciaViewEliminarCita();
    }//GEN-LAST:event_botonEliminarCitasAdminActionPerformed

    private void botonCrearMedicosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearMedicosAdminActionPerformed
        getInstanciaViewCrearMedico();
    }//GEN-LAST:event_botonCrearMedicosAdminActionPerformed

    private void botonVerMedicosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerMedicosAdminActionPerformed
        getInstanciaViewVerMedico();
    }//GEN-LAST:event_botonVerMedicosAdminActionPerformed

    private void botonActualizarMedicosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarMedicosAdminActionPerformed
        getInstanciaViewActualizarMedico();
    }//GEN-LAST:event_botonActualizarMedicosAdminActionPerformed

    private void botonEliminarMedicosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarMedicosAdminActionPerformed
        getInstanciaViewEliminarMedico();
    }//GEN-LAST:event_botonEliminarMedicosAdminActionPerformed

    private void botonVerMascotasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerMascotasAdminActionPerformed
        getInstanciaViewVerMascota();
    }//GEN-LAST:event_botonVerMascotasAdminActionPerformed

    private void botonCrearMascotasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearMascotasAdminActionPerformed
        getInstanciaViewCrearMascota();
    }//GEN-LAST:event_botonCrearMascotasAdminActionPerformed

    private void botonActualizarMascotasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarMascotasAdminActionPerformed
        getInstanciaViewActualizarMascota();
    }//GEN-LAST:event_botonActualizarMascotasAdminActionPerformed

    private void botonEliminarMascotasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarMascotasAdminActionPerformed
        getInstanciaViewEliminarMascota();
    }//GEN-LAST:event_botonEliminarMascotasAdminActionPerformed

    private void botonVerUsuariosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerUsuariosAdminActionPerformed
        getInstanciaViewVerUsuario();
    }//GEN-LAST:event_botonVerUsuariosAdminActionPerformed

    private void botonCrearUsuariosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearUsuariosAdminActionPerformed
        getInstanciaViewCrearUsuario();
    }//GEN-LAST:event_botonCrearUsuariosAdminActionPerformed

    private void botonActualizarUsuariosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarUsuariosAdminActionPerformed
        getInstanciaViewActualizarUsuario();
    }//GEN-LAST:event_botonActualizarUsuariosAdminActionPerformed

    private void botonEliminarUsuariosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarUsuariosAdminActionPerformed
        getInstanciaViewEliminarUsuario();
    }//GEN-LAST:event_botonEliminarUsuariosAdminActionPerformed

    private void botonCrearMascotaClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearMascotaClientActionPerformed
        ventanaDetalles.setVisible(true);
    }//GEN-LAST:event_botonCrearMascotaClientActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgrounViewAdminVeterinary;
    private javax.swing.JButton botonActualizarCitasAdmin;
    private javax.swing.JButton botonActualizarMascotasAdmin;
    private javax.swing.JButton botonActualizarMedicosAdmin;
    private javax.swing.JButton botonActualizarUsuariosAdmin;
    private javax.swing.JButton botonCrearCitasAdmin;
    private javax.swing.JButton botonCrearMascotaClient;
    private javax.swing.JButton botonCrearMascotasAdmin;
    private javax.swing.JButton botonCrearMedicosAdmin;
    private javax.swing.JButton botonCrearUsuariosAdmin;
    private javax.swing.JButton botonEliminarCitasAdmin;
    private javax.swing.JButton botonEliminarMascotasAdmin;
    private javax.swing.JButton botonEliminarMedicosAdmin;
    private javax.swing.JButton botonEliminarUsuariosAdmin;
    private javax.swing.JButton botonVerCitasAdmin;
    private javax.swing.JButton botonVerMascotasAdmin;
    private javax.swing.JButton botonVerMedicosAdmin;
    private javax.swing.JButton botonVerUsuariosAdmin;
    private javax.swing.JDesktopPane desktopViewAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelViewAdmin;
    // End of variables declaration//GEN-END:variables
}
