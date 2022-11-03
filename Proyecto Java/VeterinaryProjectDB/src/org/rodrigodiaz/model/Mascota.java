package org.rodrigodiaz.model;

/**
 *
 * @author rodro
 */
public class Mascota {
    private int idMascota;
    private String nombreMascotaMascota;
    private String razaMascota;
    private String colorMascota;
    private boolean estadoActivo;

    public Mascota(int idMascota, String nombreMascotaMascota, String razaMascota, String colorMascota, boolean estadoActivo) {
        this.idMascota = idMascota;
        this.nombreMascotaMascota = nombreMascotaMascota;
        this.razaMascota = razaMascota;
        this.colorMascota = colorMascota;
        this.estadoActivo = estadoActivo;
    }

    public Mascota() {
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascotaMascota() {
        return nombreMascotaMascota;
    }

    public void setNombreMascotaMascota(String nombreMascotaMascota) {
        this.nombreMascotaMascota = nombreMascotaMascota;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public String getColorMascota() {
        return colorMascota;
    }

    public void setColorMascota(String colorMascota) {
        this.colorMascota = colorMascota;
    }
    
    public boolean getEstado(){
        return estadoActivo;
    }
    
    public void setEstado(boolean estadoActivo){
        this.estadoActivo = estadoActivo;
    }
    
}
