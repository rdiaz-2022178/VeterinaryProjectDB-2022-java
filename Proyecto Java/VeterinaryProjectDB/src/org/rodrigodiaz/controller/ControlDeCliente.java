package org.rodrigodiaz.controller;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.model.Cliente;

/**
 *
 * @author rodro
 */
public class ControlDeCliente {
    
    private static ArrayList<Cliente> clientes;
    private static ControlDeCliente instancia = null;
    
    /**
     * Metodo que declara el arrayList
     */
    public ControlDeCliente(){
        clientes = new ArrayList<Cliente>();
        mostrarCliente();
    }
    
    
    public static ControlDeCliente getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeCliente();
        }
        return  instancia;
    }
    
        public int cantidadDeClientes(){
        return clientes.size();
    }
    
    public ArrayList<Cliente> listaDeClientes(){
        return clientes;
    }
    
        
    
    
       public void agregarCliente(Cliente cliente){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_ingresarCliente(?,?,?,?,?,?,?,?);");
            sentencia.setString(1, cliente.getNombreCliente());
            sentencia.setString(2,cliente.getApellidoCliente());
            sentencia.setString(3, cliente.getTelefonoCliente());
            sentencia.setString(4, cliente.getEmailCliente());
            sentencia.setString(5, cliente.getDpiCliente());
            sentencia.setString(6, cliente.getUsuarioCliente());
            sentencia.setString(7, cliente.getContraseñaCliente());
            sentencia.setBoolean(8, cliente.getEstadoActivo());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
       
  
       public void ocultarCliente(Cliente cliente){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ocultarCliente(?);");
                sentencia.setInt(1, cliente.getIdCliente());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento");
           } catch (Exception e) {
           }
       }
       
       public void actualizarCliente(Cliente cliente){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCliente(?,?,?,?,?,?,?,?,?);");
                sentencia.setInt(1, cliente.getIdCliente());
                sentencia.setString(2, cliente.getNombreCliente());
                sentencia.setString(3, cliente.getApellidoCliente());
                sentencia.setString(4, cliente.getTelefonoCliente());
                sentencia.setString(5, cliente.getEmailCliente());
                sentencia.setString(6, cliente.getDpiCliente());
                sentencia.setString(7, cliente.getUsuarioCliente());
                sentencia.setString(8, cliente.getContraseñaCliente());
                sentencia.setBoolean(9, cliente.getEstadoActivo());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
           } catch (Exception e) {
           }          
       }
       
        public void mostrarCliente(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarCliente();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(resultado.getInt(1));
                    cliente.setNombreCliente(resultado.getString(2));
                    cliente.setApellidoCliente(resultado.getString(3));
                    cliente.setTelefonoCliente(resultado.getString(4));
                    cliente.setEmailCliente(resultado.getString(5));
                    cliente.setDpiCliente(resultado.getString(6));
                    cliente.setUsuarioCliente(resultado.getString(7));
                    cliente.setContraseñaCliente(resultado.getString(8));
                    clientes.add(cliente);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
        
    public Cliente buscarCliente(Cliente cliente){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarCliente(?);");
        sentencia.setInt(1, cliente.getIdCliente());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            cliente.setNombreCliente(resultado.getNString(2));
            cliente.setApellidoCliente(resultado.getNString(3));
            cliente.setTelefonoCliente(resultado.getNString(4));
            cliente.setEmailCliente(resultado.getNString(5));
            cliente.setDpiCliente(resultado.getNString(6));
            cliente.setUsuarioCliente(resultado.getNString(7));
            cliente.setContraseñaCliente(resultado.getNString(8));
        } else            
            cliente = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return cliente;
    }
    
    
}
