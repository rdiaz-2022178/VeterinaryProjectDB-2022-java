package org.rodrigodiaz.controller;

import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.model.Cita;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author rodro
 */
public class ControlDeCita {
    
    private static ArrayList<Cita> citas;
    private static ControlDeCita instancia = null;
    
    
    /**
     * Metodo que declara el arrayList
     */
    public ControlDeCita(){
        citas = new ArrayList<Cita>();
        mostrarCita();
    }
    
    /***
     * Metodo que instancia el arrayList
     * @return citas.size = todas las citas
     */
    public static ControlDeCita getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeCita();
        }
        return  instancia;
    }
    
    /**
     * Metodo para mostrar la cantidad de elementos del arrayList
     * @return citas 
     */
        public int cantidadDeCitas(){
        return citas.size();
    }
    
    
        /**
         * Metodo que me regresa el objeto del arrayList
         * @return 
         */
        public ArrayList<Cita> listaDeCitas(){
        return citas;
    }
    
    
    
    
     /**
      * Metodo para agregar
      * @param cita 
      */
        public void agregarCliente(Cita cita){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarCita(?,?,?,?,?,?,?,?,?,?,?);");
            sentencia.setString(1, cita.getFechaCita());
            sentencia.setString(2, cita.getHoraCita());
            sentencia.setString(3, cita.getNombreMascotaCita());
            sentencia.setString(4, cita.getNombreDueñoCita());
            sentencia.setString(5, cita.getEmailDueñoCita());
            sentencia.setString(6, cita.getTelefonoDueñoCita());
            sentencia.setInt(7, cita.getIdServicioCita());
            sentencia.setString(8, cita.getDpiDueñoCita());
            sentencia.setString(9, cita.getNitDueñoCita());
            sentencia.setFloat(10, cita.getCostoCita());
            sentencia.setBoolean(11, cita.getEstado());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
     
     /***
      * Metodo para Ocultar
      * @param cita 
      */
        public void ocultarCita(Cita cita){
         try {
             PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ocultarCita(?);");
             sentencia.setInt(1, cita.getIdCita());
             sentencia.execute();
             JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento");
         } catch (Exception e) {
         }
     }
     
     /**
      * Metodo para actualizar
      * @param cita 
      */
        public void actualizarCita(Cita cita){
         try {
             PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCita(?,?,?,?,?,?,?,?,?,?,?,?);");
             sentencia.setInt(1, cita.getIdCita());
             sentencia.setString(2, cita.getFechaCita());
             sentencia.setString(3, cita.getHoraCita());
             sentencia.setString(4, cita.getNombreMascotaCita());
             sentencia.setString(5, cita.getNombreDueñoCita());
             sentencia.setString(6, cita.getEmailDueñoCita());
             sentencia.setString(7, cita.getTelefonoDueñoCita());
             sentencia.setInt(8, cita.getIdServicioCita());
             sentencia.setString(9, cita.getDpiDueñoCita());
             sentencia.setString(10, cita.getNitDueñoCita());
             sentencia.setFloat(11, cita.getCostoCita());
             sentencia.setBoolean(12, cita.getEstado());
             sentencia.execute();
             JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
         } catch (Exception e) {
         }
     }
     
        /**
         * Metodo para mostrar
         */
        public void mostrarCita(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarCita();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Cita cita = new Cita();
                    cita.setIdCita(resultado.getInt(1));
                    cita.setFechaCita(resultado.getString(2));
                    cita.setHoraCita(resultado.getString(3));
                    cita.setNombreMascotaCita(resultado.getString(4));
                    cita.setNombreDueñoCita(resultado.getString(5));
                    cita.setEmailDueñoCita(resultado.getString(6));
                    cita.setTelefonoDueñoCita(resultado.getString(7));
                    cita.setIdServicioCita(resultado.getInt(8));
                    cita.setDpiDueñoCita(resultado.getString(9));
                    cita.setNitDueñoCita(resultado.getString(10));
                    cita.setCostoCita(resultado.getFloat(11));
                    citas.add(cita);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
        
    /**
     * Metodo para buscar
     * @param cita
     * @return cita 
     */
        public Cita buscarCita(Cita cita){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarCita(?);");
        sentencia.setInt(1, cita.getIdCita());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            cita.setFechaCita(resultado.getString(2));
            cita.setHoraCita(resultado.getString(3));
            cita.setNombreMascotaCita(resultado.getNString(4));
            cita.setNombreDueñoCita(resultado.getNString(5));
            cita.setEmailDueñoCita(resultado.getNString(6));
            cita.setTelefonoDueñoCita(resultado.getNString(7));
            cita.setDpiDueñoCita(resultado.getNString(9));
            cita.setNitDueñoCita(resultado.getNString(10));
        } else            
            cita = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return cita;
    }
    
}
