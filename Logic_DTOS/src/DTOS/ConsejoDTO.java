package DTOS;

import java.util.Date;

/**
 * Clase que representa a un consejo básico.
 * Created by c.zambrano10 on 10/02/2017.
 */
public class ConsejoDTO {
    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * Fecha de creacion de un consejo.*
     */
    private Date fecha;

    /**
     * mensaje del consejo.
     */
    private String mensaje;

    /**
     * dieta recomendada en el consejo.
     */
    private String dieta;

    /**
     * Actividad recomendada en el consejo.
     */
    private String actividadFisica;

    /**
     * Medicamentos recomendados en el consejo.
     */
    private String medicamentos;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * constructor vacio
     */
    public ConsejoDTO (){

    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param fecha
     * @param mensaje
     * @param dieta
     * @param actividadFisica
     * @param medicamentos
     */
    public ConsejoDTO(Date fecha, String mensaje, String dieta, String actividadFisica, String medicamentos) {
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.dieta = dieta;
        this.actividadFisica = actividadFisica;
        this.medicamentos = medicamentos;
    }



}
