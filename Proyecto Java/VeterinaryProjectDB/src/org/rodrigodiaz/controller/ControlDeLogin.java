package org.rodrigodiaz.controller;

import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.model.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author rodro
 */
public class ControlDeLogin {
    
    private static ArrayList<Login> logins;
    private static ControlDeLogin instancia = null;
    
    public ControlDeLogin(){
        logins = new ArrayList<Login>();
        mostrarLogin();
    }
    
    public static ControlDeLogin getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeLogin();
        }
        return  instancia;
    }
    
        public int cantidadDeLogin(){
        return logins.size();
    }
    
    public ArrayList<Login> listaDeLogin(){
        return logins;
    }
    
    public void mostrarLogin(){
        try {
            PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_inicioSesion();");
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {  
                Login login = new Login();
                login.setUsuario(resultado.getString(1));
                login.setContraseña(resultado.getString(2));
                logins.add(login);
                
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
