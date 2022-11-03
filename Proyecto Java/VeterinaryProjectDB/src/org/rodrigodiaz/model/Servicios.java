package org.rodrigodiaz.model;

/**
 *
 * @author rodro
 */
public class Servicios {
    
    private int idServicio;
    private String servicios;
    private float costoServicio;
    
     public Servicios(int idServicio, String servicios, float costoServicio) {
        this.idServicio = idServicio;
        this.servicios = servicios;
        this.costoServicio = costoServicio;
    }
     
     public Servicios(){
         
     }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public float getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(float costoServicio) {
        this.costoServicio = costoServicio;
    }
     
}
