package DTOS;
import java.util.Date;

public class LecturaDTO
{
    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * Numero identificador de la lectura.
     */
    protected long id;

    /**
     * Fecha en la que se tomo la lectura.
     */
    protected Date fecha;

    /**
     * Frecuencia cardiaca del paciente.
     */
    protected int frecuenciaCardiaca;

    /**
     * presión sanguinea del paciente.
     */
    protected int presionSanguinea;

    /**
     * Nivel de estres del paciente (Medido de 1 a 10).
     */
    protected int nivelEstres;

    /**
     * Estado del paciente (3 - Verded, 2 - Amarillo, 1 - Rojo).
     */
    protected int estado;

    //--------------------------------------------------------------
    //                        CONSTRUCTORES
    //--------------------------------------------------------------

    public LecturaDTO() {

    }

    public LecturaDTO(int id, Date fecha, int frecuenciaCardiaca, int presionSanguinea, int nivelEstres, int estado) {
        this.id = id;
        this.fecha = fecha;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionSanguinea = presionSanguinea;
        this.nivelEstres = nivelEstres;
        this.estado = estado;
    }

    //--------------------------------------------------------------
    //                          METODOS
    //--------------------------------------------------------------

    /**
     * Getters y Setters
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getPresionSanguinea() {
        return presionSanguinea;
    }

    public void setPresionSanguinea(int presionSanguinea) {
        this.presionSanguinea = presionSanguinea;
    }

    public int getNivelEstres() {
        return nivelEstres;
    }

    public void setNivelEstres(int nivelEstres) {
        this.nivelEstres = nivelEstres;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
