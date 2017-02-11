package DTOS;

import java.util.Date;

/**
 * Clase que representa un marcapasos
 * Created by ln.bello10 on 10/02/2017.
 */
public class PacienteDetailDTO extends PacienteDTO{

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * relacion con el marcapasos
     */
    private MarcapasosDTO marcapasos;

    /**
     * relacion con el historial
     */
    private HistorialDTO historial;

    /**
     * relacion con los medicos
     */
    private List<MedicoDTO> medicos = new ArrayList<>();

    /**
     * relacion con las citas
     */
    private List<CitaDTO> citas = new ArrayList<>();

    /**
     * relacion con los examenes
     */
    private List<ExamenDTO> examenes = new ArrayList<>();

    /**
     * relacion con los consejos
     */
    private List<ConsejoDTO> consejos = new ArrayList<>();

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public PacienteDetailDTO() {
        super();
    }

    public MarcapasosDTO getMarcapasos() {
        return marcapasos;
    }

    public void setMarcapasos(MarcapasosDTO marcapasos) {
        this.marcapasos = marcapasos;
    }

    public HistorialDTO getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialDTO historial) {
        this.historial = historial;
    }

    public List<MedicoDTO> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<MedicoDTO> medicos) {
        this.medicos = medicos;
    }

    public List<CitaDTO> getCitas() {
        return citas;
    }

    public void setCitas(List<CitaDTO> citas) {
        this.citas = citas;
    }

    public List<ExamenDTO> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<ExamenDTO> examenes) {
        this.examenes = examenes;
    }

    public List<ConsejoDTO> getConsejos() {
        return consejos;
    }

    public void setConsejos(List<ConsejoDTO> consejos) {
        this.consejos = consejos;
    }
}
