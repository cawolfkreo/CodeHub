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
}
