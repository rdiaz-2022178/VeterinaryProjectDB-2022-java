package org.rodrigodiaz.model;

/**
 *
 * @author rodro
 */
public class DetalleCD {
    private int idDetalleCD;
    private int idCita;
    private int idDoctor;
    private int idServicios;
    private boolean  estadoActivo;

    public DetalleCD(int idDetalleCD, int idCita, int idDoctor, int idServicios, boolean estadoActivo) {
        this.idDetalleCD = idDetalleCD;
        this.idCita = idCita;
        this.idDoctor = idDoctor;
        this.idServicios = idServicios;
        this.estadoActivo = estadoActivo;
    }

    public DetalleCD() {
    }

    public int getIdDetalleCD() {
        return idDetalleCD;
    }

    public void setIdDetalleCD(int idDetalleCD) {
        this.idDetalleCD = idDetalleCD;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
}
