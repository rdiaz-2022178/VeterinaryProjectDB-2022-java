package org.rodrigodiaz.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private Connection conexion;
    private static Conexion instancia;
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //se agraga "cj" para versiones de mysql mayores a 7
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_veterinaria?useSSL=false","root", "admin rodro");
            JOptionPane.showMessageDialog(null, "Se ha establecido la conexion con la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
            JOptionPane.showMessageDialog(null, error);
            
        }
    }
    
    public synchronized static Conexion getInstancia(){
        if (instancia == null) 
            instancia = new Conexion();
        return instancia;
    }   
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
    
}
