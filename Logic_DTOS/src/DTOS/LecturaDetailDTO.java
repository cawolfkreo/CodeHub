package DTOS;

public class LecturaDetailDTO extends LecturaDTO
{
    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * Relacion con el paciente
     */
    private PacienteDTO paciente;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public LecturaDetailDTO() {
        super();
    }

    public LecturaDetailDTO(LecturaDTO lectura)
    {
        this.id = lectura.getId();
        this.fecha = lectura.getFecha();
        this.frecuenciaCardiaca = lectura.getFrecuenciaCardiaca();
        this.presionSanguinea = lectura.getPresionSanguinea();
        this.nivelEstres = lectura.getNivelEstres();
        this.estado = lectura.getEstado();
    }

    //--------------------------------------------------------------
    //                          METODOS
    //--------------------------------------------------------------

    public PacienteDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }
}
