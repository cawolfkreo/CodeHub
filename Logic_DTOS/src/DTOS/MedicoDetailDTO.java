package DTOS;

import java.util.Date;

/**
 * Created by ln.bello10 on 10/02/2017.
 */
public class MedicoDetailDTO extends MedicoDTO{

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * relacion 0 a muchos con medicos
     */
    private List<PacienteDTO> pacientes = new ArrayList<>();

    // private List<CitaDTO> citas = new ArrayList<>();


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public MedicoDetailDTO() {
        super();
    }

    public List<PacienteDTO> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<PacienteDTO> pacientes) {
        this.pacientes = pacientes;
    }
}
