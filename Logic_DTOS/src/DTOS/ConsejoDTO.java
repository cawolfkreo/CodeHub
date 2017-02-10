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

    //--------------------------------------------------------------
    //                          Metodos
    //--------------------------------------------------------------


    /**
     * metodo para retornar la fecha del consejo
     * @return la fecha de creacion del consejo
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * metodo para modificar la fecha del consejo.
     * @param fecha la fecha nueva para el consejo. fecha!=null.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * metodo para retornar el mensaje del consejo.
     * @return el mensaje del consejo.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * metodo para modificar el mensaje del consejo.
     * @param mensaje el nuevo mensaje para el consejo. mensaje !=null && mensaje!="".
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * metodo para retornar el mensaje de dieta del consejo.
     * @return la dieta del consejo.
     */
    public String getDieta() {
        return dieta;
    }

    /**
     * metodo para modificar el mensaje de dieta del consejo.
     * @param dieta la nueva dieta para el consejo.
     */
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    /**
     * metodo para retornar el mensaje de la actividad fisica del consejo.
     * @return la actividad fisica del consejo.
     */
    public String getActividadFisica() {
        return actividadFisica;
    }

    /**
     * modifica el mensaje de actividad fisica con el que llega por parámetro.
     * @param actividadFisica la nueva actividad fisica del consejo.
     */
    public void setActividadFisica(String actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    /**
     * retorna el mensaje de los medicamentos del consejo
     * @return los medicamentos del consejo.
     */
    public String getMedicamentos() {
        return medicamentos;
    }

    /**
     * modifica el mensaje de medicamentos con el que llega por parametro.
     * @param medicamentos el nuevo mensaje de medicamentos para el consejo.
     */
    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
}
