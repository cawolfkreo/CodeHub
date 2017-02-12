package DTOS;

public class HistorialDTO
{
    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * Describe las enfermedades del paciente.
     */
    protected String enfermedades;

    /**

     * Describe las alergias del paciente.
     */
    protected String alergias;

    //--------------------------------------------------------------
    //                        CONSTRUCTORES
    //--------------------------------------------------------------

    public HistorialDTO() {

    }

    public HistorialDTO(String enfermedades, String alergias) {
        this.enfermedades = enfermedades;
        this.alergias = alergias;
    }

    //--------------------------------------------------------------
    //                          METODOS
    //--------------------------------------------------------------


    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}