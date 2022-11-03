package org.rodrigodiaz.controller;

import org.rodrigodiaz.db.Conexion;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import org.rodrigodiaz.model.DetalleCM;

/**
 *
 * @author rodro
 */
public class ControlDeDetalleCM {
    
    private static ArrayList<DetalleCM> detalles;
    private static ControlDeDetalleCM instancia = null;
    
    public ControlDeDetalleCM(){
        detalles = new ArrayList<DetalleCM>();
        mostrarDetallesCM();
    }
    
    public static ControlDeDetalleCM getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeDetalleCM();
        }
        return  instancia;
    }
    
        public int cantidadDeDetalles(){
        return detalles.size();
    }
    
    public ArrayList<DetalleCM> listaDeDetalles(){
        return detalles;
    }   
    
     public void agregarDetalleCM(DetalleCM detalle){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarDetalleCM(?,?,?);");
            sentencia.setInt(1, detalle.getIdCliente());
            sentencia.setInt(2, detalle.getIdMascota());
            sentencia.setBoolean(3, detalle.getEstadoActivo());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
     
    public void ocultarDetalleCM(DetalleCM detalle){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ocultarDetalleCM(?);");
            sentencia.setInt(1, detalle.getIdDetalleCM());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
     public void actualizarDetalleCM(DetalleCM detalle){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarDetalleCM(?,?,?,?);");
            
            sentencia.setInt(1, detalle.getIdDetalleCM());
            sentencia.setInt(2, detalle.getIdCliente());
            sentencia.setInt(3, detalle.getIdMascota());
            sentencia.setBoolean(4, detalle.getEstadoActivo());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
     
        public void mostrarDetallesCM(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarDetalleCM();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    DetalleCM detalle = new DetalleCM();
                    detalle.setIdDetalleCM(resultado.getInt(1));
                    detalle.setIdCliente(resultado.getInt(2));
                    detalle.setIdMascota(resultado.getInt(3));
                    detalles.add(detalle);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
        
    public DetalleCM buscarDetalleCM(DetalleCM detalle){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarDetalleCM(?);");
        sentencia.setInt(1, detalle.getIdDetalleCM());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            detalle.setIdCliente(resultado.getInt(2));
            detalle.setIdMascota(resultado.getInt(3));
        } else            
            detalle = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return detalle;
    }
    
}
