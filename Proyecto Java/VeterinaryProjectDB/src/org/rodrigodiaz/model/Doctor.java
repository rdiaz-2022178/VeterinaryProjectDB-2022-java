package org.rodrigodiaz.model;


public class Doctor {
   private int idDoctor;
   private String nombreDoctor;
   private String apellidoDoctor;
   private String telefonoDoctor;
   private String direccionDoctor;
   private int idDepartamento;
   private String especialidadDoctor;
   private boolean estadoActivo;

    public Doctor(int idDoctor, String nombreDoctor, String apellidoDoctor, String telefonoDoctor, String direccionDoctor, int idDepartamento, String especialidadDoctor, boolean estadoActivo) {
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.telefonoDoctor = telefonoDoctor;
        this.direccionDoctor = direccionDoctor;
        this.idDepartamento = idDepartamento;
        this.especialidadDoctor = especialidadDoctor;
        this.estadoActivo = estadoActivo;
    }

    public Doctor() {
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }

    public void setApellidoDoctor(String apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }

    public String getTelefonoDoctor() {
        return telefonoDoctor;
    }

    public void setTelefonoDoctor(String telefonoDoctor) {
        this.telefonoDoctor = telefonoDoctor;
    }

    public String getDireccionDoctor() {
        return direccionDoctor;
    }

    public void setDireccionDoctor(String direccionDoctor) {
        this.direccionDoctor = direccionDoctor;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
}
