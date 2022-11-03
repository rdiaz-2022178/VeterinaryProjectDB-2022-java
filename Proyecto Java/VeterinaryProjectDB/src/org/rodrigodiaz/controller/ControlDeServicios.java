package org.rodrigodiaz.controller;

import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.xdevapi.Statement;
import java.util.ArrayList;
import org.rodrigodiaz.model.Servicios;
import java.sql.ResultSet;
import java.sql.Connection;
import org.rodrigodiaz.db.Conexion;
import java.sql.PreparedStatement;


/**
 *
 * @author rodro
 */
public class ControlDeServicios {

    private static ArrayList<Servicios> servicios;
    private static ControlDeServicios instancia = null;
    
    public ControlDeServicios(){
        servicios = new ArrayList<Servicios>();
        mostrarServicios();
    }
    
    public static ControlDeServicios getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeServicios();
        }
        return  instancia;
    }
    
        public int cantidadDeServicios(){
        return servicios.size();
    }
    
    public ArrayList<Servicios> listaDeServicios(){
        return servicios;
    }
    
        public void mostrarServicios(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_mostrarServicios();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Servicios servicio = new Servicios();
                    servicio.setIdServicio(resultado.getInt(1));
                    servicio.setServicios(resultado.getString(2));
                    servicio.setCostoServicio(resultado.getFloat(3));

                    servicios.add(servicio);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
    
}
