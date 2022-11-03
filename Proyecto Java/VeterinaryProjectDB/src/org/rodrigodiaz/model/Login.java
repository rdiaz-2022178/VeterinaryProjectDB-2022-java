package org.rodrigodiaz.model;

/**
 *
 * @author rodro
 */
public class Login {
    private String contraseña;
    private String usuario;

    public Login(String contraseña, String usuario) {
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public Login() {
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
