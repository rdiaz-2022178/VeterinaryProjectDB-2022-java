package org.rodrigodiaz.controller;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.model.Mascota;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author rodro
 */
public class ControlDeMascota {
    private static ArrayList<Mascota> mascotas;
    private static ControlDeMascota instancia = null;
    
    public ControlDeMascota(){
        mascotas = new ArrayList<Mascota>();
        mostrarMascota();
    }
    
    public static ControlDeMascota getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeMascota();
        }
        return  instancia;
    }
    
        public int cantidadDeMascotas(){
        return mascotas.size();
    }
    
    public ArrayList<Mascota> listaDeMascotas(){
        return mascotas;
    }
    
    
    
        public void agregarMascota(Mascota mascota){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarMascota(?,?,?,?);");
            sentencia.setString(1, mascota.getNombreMascotaMascota());
            sentencia.setString(2,mascota.getRazaMascota());
            sentencia.setString(3, mascota.getColorMascota());
            sentencia.setBoolean(4, mascota.getEstado());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
        
        public void ocultarMascota(Mascota mascota){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ocultarMascota(?);");
                sentencia.setInt(1, mascota.getIdMascota());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento");
            } catch (Exception e) {
            }
        }
        
        public void actualizarMascota(Mascota mascota){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarMascota(?,?,?,?,?);");
                sentencia.setInt(1, mascota.getIdMascota());
                sentencia.setString(2, mascota.getNombreMascotaMascota());
                sentencia.setString(3, mascota.getRazaMascota());
                sentencia.setString(4, mascota.getColorMascota());
                sentencia.setBoolean(5, mascota.getEstado());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
            } catch (Exception e) {
            } 
        }
        
        
        public void mostrarMascota(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarMascota();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Mascota mascota = new Mascota();
                    mascota.setIdMascota(resultado.getInt(1));
                    mascota.setNombreMascotaMascota(resultado.getString(2));
                    mascota.setRazaMascota(resultado.getString(3));
                    mascota.setColorMascota(resultado.getString(4));
                    mascotas.add(mascota);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
        
    public Mascota buscarMascota(Mascota mascota){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarMascota(?);");
        sentencia.setInt(1, mascota.getIdMascota());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            mascota.setNombreMascotaMascota(resultado.getNString(1));
            mascota.setRazaMascota(resultado.getNString(2));
            mascota.setColorMascota(resultado.getNString(3));    
        } else            
            mascota = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return mascota;
    }
    
}
