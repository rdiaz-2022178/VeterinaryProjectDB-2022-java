package org.rodrigodiaz.controller;

import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.model.Doctor;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author rodro
 */
public class ControlDeDoctor {
    
    private static ArrayList<Doctor> doctors;
    private static ControlDeDoctor instancia = null;
    
    public ControlDeDoctor(){
        doctors = new ArrayList<Doctor>();
        mostrarDoctor();
    }
    
    public static ControlDeDoctor getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeDoctor();
        }
        return  instancia;
    }
    
        public int cantidadDeDoctor(){
        return doctors.size();
    }
    
    public ArrayList<Doctor> listaDeDoctor(){
        return doctors;
    }
    
    
    public void agregarDoctor(Doctor doctor){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarMedico(?,?,?,?,?,?,?);");
            sentencia.setString(1, doctor.getNombreDoctor());
            sentencia.setString(2, doctor.getApellidoDoctor());
            sentencia.setString(3, doctor.getTelefonoDoctor());
            sentencia.setString(4, doctor.getDireccionDoctor());
            sentencia.setInt(5, doctor.getIdDepartamento());
            sentencia.setString(6, doctor.getEspecialidadDoctor());
            sentencia.setBoolean(7, doctor.getEstadoActivo());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
    public void ocultarDoctor(Doctor doctor){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ocultarDoctor(?);");
            sentencia.setInt(1, doctor.getIdDoctor());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento");
           } catch (Exception e) {
           }
    }
    
    public void actualizarDoctor(Doctor doctor){
        try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarDoctor(?,?,?,?,?,?,?,?);");
                sentencia.setInt(1, doctor.getIdDoctor());
                sentencia.setString(2, doctor.getNombreDoctor());
                sentencia.setString(3, doctor.getApellidoDoctor());
                sentencia.setString(4, doctor.getTelefonoDoctor());
                sentencia.setString(5, doctor.getDireccionDoctor());
                sentencia.setInt(6, doctor.getIdDepartamento());
                sentencia.setString(7, doctor.getEspecialidadDoctor());
                sentencia.setBoolean(8, doctor.getEstadoActivo());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
            } catch (Exception e) {
            } 
    }
    
        public void mostrarDoctor(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarDoctor();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Doctor doctor = new Doctor();
                    doctor.setIdDoctor(resultado.getInt(1));
                    doctor.setNombreDoctor(resultado.getString(2));
                    doctor.setApellidoDoctor(resultado.getString(3));
                    doctor.setTelefonoDoctor(resultado.getString(4));
                    doctor.setDireccionDoctor(resultado.getString(5));
                    doctor.setIdDepartamento(resultado.getInt(6));
                    doctor.setEspecialidadDoctor(resultado.getString(7));
                    doctors.add(doctor);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
        
    public Doctor buscarCliente(Doctor doctor){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarDoctor(?);");
        sentencia.setInt(1, doctor.getIdDoctor());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            doctor.setNombreDoctor(resultado.getNString(2));
            doctor.setApellidoDoctor(resultado.getNString(3));
            doctor.setTelefonoDoctor(resultado.getNString(4));
            doctor.setDireccionDoctor(resultado.getNString(5));
            doctor.setEspecialidadDoctor(resultado.getNString(7));
        } else            
            doctor = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return doctor;
    }
    
    
    
}
