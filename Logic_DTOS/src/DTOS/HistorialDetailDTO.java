package DTOS;

import java.util.List;

/**
 * Clase para almacenar las lecturas, citas y examenes del paciente.
 */
public class HistorialDetailDTO extends HistorialDTO
{
    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * Relacion con el paciente
     */
    private PacienteDTO paciente;

    /**
     * Historial de lecturas del paciente
     */
    private List<LecturaDTO> lecturas;

    /**
     * lista de citas del paciente
     */
    private List<CitaDTO> citas;

    /**
     * Lista de examenes del paciente
     */
    private List<ExamenDTO> examen;

    /**
     * lista de emergencias de paciente
     */
    private List<EmergenciaDTO> emergencias;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public HistorialDetailDTO() {
        super();
    }

    public HistorialDetailDTO(HistorialDTO historial)
    {
        this.enfermedades = historial.getEnfermedades();
        this.alergias = historial.getAlergias();
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

    public LecturaDTO getLecturas() {
        return lecturas;
    }

    public void setLecturas(LecturaDTO lecturas) {
        this.lecturas = lecturas;
    }

    public CitaDTO getCitas() {
        return citas;
    }

    public void setCitas(CitaDTO citas) {
        this.citas = citas;
    }

    public ExamenDTO getExamen() {
        return examen;
    }

    public void setExamen(ExamenDTO examen) {
        this.examen = examen;
    }

    public EmergenciaDTO getEmergencias() {
        return emergencias;
    }

    public void setEmergencias(EmergenciaDTO emergencias) {
        this.emergencias = emergencias;
    }
}