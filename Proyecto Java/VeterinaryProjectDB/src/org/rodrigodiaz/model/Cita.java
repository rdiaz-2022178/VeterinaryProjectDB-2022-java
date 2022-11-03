package org.rodrigodiaz.model;

/**
 *
 * @author rodro
 */
public class Cita {
    private int idCita;
    private String fechaCita;
    private String horaCita;
    private String nombreMascotaCita;
    private String nombreDueñoCita;
    private String emailDueñoCita;
    private String telefonoDueñoCita;
    private int idServicioCita;
    private String dpiDueñoCita;
    private String nitDueñoCita;
    private float costoCita; 
    private boolean estadoActivo;

    public Cita(int idCita, String fechaCita, String horaCita, String nombreMascotaCita, String nombreDueñoCita, String emailDueñoCita, String telefonoDueñoCita, int idServicioCita, String dpiDueñoCita, String nitDueñoCita, float costoCita, boolean  estadoActivo) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.nombreMascotaCita = nombreMascotaCita;
        this.nombreDueñoCita = nombreDueñoCita;
        this.emailDueñoCita = emailDueñoCita;
        this.telefonoDueñoCita = telefonoDueñoCita;
        this.idServicioCita = idServicioCita;
        this.dpiDueñoCita = dpiDueñoCita;
        this.nitDueñoCita = nitDueñoCita;
        this.costoCita = costoCita;
        this.estadoActivo = estadoActivo;
    }

    public Cita() {
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getNombreMascotaCita() {
        return nombreMascotaCita;
    }

    public void setNombreMascotaCita(String nombreMascotaCita) {
        this.nombreMascotaCita = nombreMascotaCita;
    }

    public String getNombreDueñoCita() {
        return nombreDueñoCita;
    }

    public void setNombreDueñoCita(String nombreDueñoCita) {
        this.nombreDueñoCita = nombreDueñoCita;
    }

    public String getEmailDueñoCita() {
        return emailDueñoCita;
    }

    public void setEmailDueñoCita(String emailDueñoCita) {
        this.emailDueñoCita = emailDueñoCita;
    }

    public String getTelefonoDueñoCita() {
        return telefonoDueñoCita;
    }

    public void setTelefonoDueñoCita(String telefonoDueñoCita) {
        this.telefonoDueñoCita = telefonoDueñoCita;
    }

    public int getIdServicioCita() {
        return idServicioCita;
    }

    public void setIdServicioCita(int idServicioCita) {
        this.idServicioCita = idServicioCita;
    }

    public String getDpiDueñoCita() {
        return dpiDueñoCita;
    }

    public void setDpiDueñoCita(String dpiDueñoCita) {
        this.dpiDueñoCita = dpiDueñoCita;
    }

    public String getNitDueñoCita() {
        return nitDueñoCita;
    }

    public void setNitDueñoCita(String nitDueñoCita) {
        this.nitDueñoCita = nitDueñoCita;
    }

    public float getCostoCita() {
        return costoCita;
    }

    public void setCostoCita(float costoCita) {
        this.costoCita = costoCita;
    }
    
    public boolean getEstado(){
        return estadoActivo;
    }
    
    public void setEstado(boolean estadoActivo){
        this.estadoActivo = estadoActivo;
    }
    

     
    
}
