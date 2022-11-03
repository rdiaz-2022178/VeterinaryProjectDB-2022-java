package org.rodrigodiaz.model;

/**
 *
 * @author rodro
 */
public class DetalleCM {
    private int idDetalleCM;
    private int idCliente;
    private int idMascota;
    private boolean estadoActivo;

    public DetalleCM(int idDetalleCM, int idCliente, int idMascota, boolean estadoActivo) {
        this.idDetalleCM = idDetalleCM;
        this.idCliente = idCliente;
        this.idMascota = idMascota;
        this.estadoActivo = estadoActivo;
    }

    public DetalleCM() {
    }

    public int getIdDetalleCM() {
        return idDetalleCM;
    }

    public void setIdDetalleCM(int idDetalleCM) {
        this.idDetalleCM = idDetalleCM;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
    
}
