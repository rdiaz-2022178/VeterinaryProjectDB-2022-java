package org.rodrigodiaz.controller;

import org.rodrigodiaz.db.Conexion;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.rodrigodiaz.model.DetalleCD;
import java.sql.ResultSet;


/**
 *
 * @author rodro
 */
public class ControlDeDetalleCD {
    
    private static ArrayList<DetalleCD> detalles;
    private static ControlDeDetalleCD instancia = null;
    
    public ControlDeDetalleCD(){
        detalles = new ArrayList<DetalleCD>();
        mostrarDetallesCD();
    }
    
    public static ControlDeDetalleCD getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeDetalleCD();
        }
        return  instancia;
    }
    
        public int cantidadDeDetalles(){
        return detalles.size();
    }
    
    public ArrayList<DetalleCD> listaDeDetalles(){
        return detalles;
    }    
    
    
    
     public void agregarDetalleCD(DetalleCD detalle){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarDetalleCD(?,?,?,?);");
            sentencia.setInt(1, detalle.getIdCita());
            sentencia.setInt(2, detalle.getIdDoctor());
            sentencia.setInt(3, detalle.getIdServicios());
            sentencia.setBoolean(4, detalle.getEstadoActivo());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
     
     public void ocultarDetalleCD(DetalleCD detalle){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ocultarDetalleCD(?);");
            sentencia.setInt(1, detalle.getIdDetalleCD());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
     
     public void actualizarDetalleCD(DetalleCD detalle){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarDetalleCD(?,?,?,?,?);");
            
            sentencia.setInt(1, detalle.getIdDetalleCD());
            sentencia.setInt(2, detalle.getIdCita());
            sentencia.setInt(3, detalle.getIdDoctor());
            sentencia.setInt(4, detalle.getIdServicios());
            sentencia.setBoolean(5, detalle.getEstadoActivo());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
     
        public void mostrarDetallesCD(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarDetalleCD();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    DetalleCD detalle = new DetalleCD();
                    detalle.setIdDetalleCD(resultado.getInt(1));
                    detalle.setIdCita(resultado.getInt(2));
                    detalle.setIdDoctor(resultado.getInt(3));
                    detalle.setIdServicios(resultado.getInt(4));
                    detalles.add(detalle);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
        
    public DetalleCD buscarDetalleCD(DetalleCD detalle){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarDetalleCD(?);");
        sentencia.setInt(1, detalle.getIdDetalleCD());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            detalle.setIdCita(resultado.getInt(2));
            detalle.setIdDoctor(resultado.getInt(3));
            detalle.setIdServicios(resultado.getInt(4));    
        } else            
            detalle = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return detalle;
    }
    
}
