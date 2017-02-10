package DTOS;

import java.util.Date;

/**
 * Clase que representa un medico
 * Created by ln.bello10 on 10/02/2017.
 */
public class MedicoDTO {

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador del medico
     */
    private int id;

    /**
     * nombre del medico
     */
    private String nombre;

    /**
     * especialidad del medico
     */
    private String especialidad;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public MedicoDTO() {
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param nombre
     * @param especialidad
     */
    public MedicoDTO(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
