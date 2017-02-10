package DTOS;

import java.util.Date;

/**
 */
public class PacienteDTO {

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador del paciente
     */
    private int id;

    /**
     * nombre del paciente
     */
    private String nombre;

    /**
     * grupo sanguineo del paciente
     */
    private String grupoSanguineo;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public PacienteDTO() {
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param nombre
     * @param grupoSanguineo
     */

    public PacienteDTO(int id, String nombre, String grupoSanguineo) {
        this.id = id;
        this.nombre = nombre;
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
}
