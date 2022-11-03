package org.rodrigodiaz.model;

/**
 *
 * @author rodro
 */
public class Cliente {
    
    private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String telefonoCliente;
    private String emailCliente;
    private String dpiCliente;
    private String usuarioCliente;
    private String contraseñaCliente;
    private boolean estadoActivo;

    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String telefonoCliente, String emailCliente, String dpiCliente, String usuarioCliente, String contraseñaCliente, boolean estadoActivo) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.dpiCliente = dpiCliente;
        this.usuarioCliente = usuarioCliente;
        this.contraseñaCliente = contraseñaCliente;
        this.estadoActivo = estadoActivo;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(String dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public String getUsuarioCliente() {
        return usuarioCliente;
    }

    public void setUsuarioCliente(String usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public String getContraseñaCliente() {
        return contraseñaCliente;
    }

    public void setContraseñaCliente(String contraseñaCliente) {
        this.contraseñaCliente = contraseñaCliente;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
}
