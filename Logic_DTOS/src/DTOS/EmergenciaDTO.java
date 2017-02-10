package DTOS;

import java.util.Date;

/**
 * Clase que representa la llegada de una emergencia básica
 * Created by c.zambrano10 on 10/02/2017.
 */
public class EmergenciaDTO {

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * Fecha de creacion de la emergencia.
     */
    private Date fecha;

    /**
     * estado de la emergencia.
     */
    private String estado;

    /**
     * la latitud de la ubicacion del paciente en el momento de la emergencia.
     */
    private int ubicacion_latitud;

    /**
     * la longitud de la ubicacion del paciente en el momento de la emergencia.
     */
    private int ubicacion_longitud;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public EmergenciaDTO() {
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param fecha
     * @param estado
     * @param ubicacion_latitud
     * @param ubicacion_longitud
     */
    public EmergenciaDTO(Date fecha, String estado, int ubicacion_latitud, int ubicacion_longitud) {
        this.fecha = fecha;
        this.estado = estado;
        this.ubicacion_latitud = ubicacion_latitud;
        this.ubicacion_longitud = ubicacion_longitud;
    }

    /**
     * da la fecha de la emergencia
     * @return la fecha de la emergencia.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * modifica la fecha de la emergencia.
     * @param fecha la nueva fecha para la emergencia. fecha != null && fecha >= 1/1/1850.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * da el mensaje de estado de la emergencia.
     * @return el mensaje de estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * modifica el mensaje de estado de la emergencia.
     * @param estado el nuevo mensaje de estado. estado != null && estado != "".
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * da la latitud de la ubicacion de la emergencia.
     * @return latitud de la ubicacion de la emergencia.
     */
    public int getUbicacion_latitud() {
        return ubicacion_latitud;
    }

    /**
     * modifica la latitud de la ubicacion de la emergencia.
     * @param ubicacion_latitud la nueva ubicacion de la emergencia. ubicacion_latitud != null.
     */
    public void setUbicacion_latitud(int ubicacion_latitud) {
        this.ubicacion_latitud = ubicacion_latitud;
    }

    /**
     * da la longitud de la ubicacion de la emergencia.
     * @return longitud de la ubicacion de la emergencia.
     */
    public int getUbicacion_longitud() {
        return ubicacion_longitud;
    }

    /**
     * modifica la longitud de la ubicacion de la emergencia.
     * @param ubicacion_longitud la nueva ubicacion de la emergencia. ubicacion_longitud != null.
     */
    public void setUbicacion_longitud(int ubicacion_longitud) {
        this.ubicacion_longitud = ubicacion_longitud;
    }
}
