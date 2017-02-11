package DTOS;

import java.util.Date;

/**
 * Clase que representa un marcapasos
 * Created by ln.bello10 on 10/02/2017.
 */
public class MarcapasosDetailDTO extends MarcapasosDTO{

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * relacion con el paciente
     */
    private PacienteDTO paciente;


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public MarcapasosDetailDTO() {
        super();
    }

    public PacienteDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }
}
