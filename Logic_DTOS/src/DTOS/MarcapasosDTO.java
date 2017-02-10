package DTOS;

import java.util.Date;

/**
 * Clase que representa un marcapasos
 * Created by ln.bello10 on 10/02/2017.
 */
public class MarcapasosDTO {

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador del marcapasos
     */
    private int id;

    /**
     * ritmo cardiaco que tiene el marcapasos
     */
    private int ritmoCardiaco;


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public MarcapasosDTO() {
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param ritmoCardiaco
     */

    public MarcapasosDTO(int id, int ritmoCardiaco) {
        this.id = id;
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }
}
