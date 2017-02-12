package mocks;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import DTOS.LecturaDTO;
import DTOS.LecturaDetailDTO;
import DTOS.PacienteDTO;
import DTOS.PacienteLogicMock;

public class LecturaLogicaMock
{
    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    // objeto para presentar logs de las operaciones
    private final static Logger logger = Logger.getLogger(LecturaLogicaMock.class.getName());

    /**
     * Mock de la persistencia de las lecturas
     */
    private static List<LecturaDetailDTO> lecturas;

    public LecturaLogicaMock() {

        if (lecturas == null) {
            lecturas = new ArrayList<>();
        }

        // indica que se muestren todos los mensajes
        logger.setLevel(Level.INFO);

        // muestra información
        logger.info("Inicializa la lista de lecturas");
    }

    /**
     * Obtiene el listado de lecturas de todos los pacientes.
     * @return lista de lecturas
     * @throws Exception cuando no existe la lista en memoria
     */
    public List<LecturaDetailDTO> getLecturas() throws Exception {
        if (lecturas == null) {
            logger.severe("Error interno.");
            throw new Exception("Error interno: Lista de lecturas no existe.");
        }

        logger.info("Retornando todas las lecturas");
        return lecturas;
    }

    /**
     * Obtiene el listado de lecturas de un paciente.
     * @return lista de lecturas
     */
    public List<LecturaDetailDTO> getLecturasPaciente(int idPaciente)
    {
        ArrayList<LecturaDetailDTO> lecturasPaciente = new ArrayList<LecturaDetailDTO>();

        for(int i = 0; i< lecturas.size(); i++)
        {
            if(lecturas.get(i).getPaciente().getId() == idPaciente)
                lecturasPaciente.add(lecturas.get(i));
        }

        logger.info("Retornando todas las lecturas");
        return lecturasPaciente;
    }

    /**
     * Agrega una lectura a la lista.
     * @param nLectura lectura a adicionar
     * @param idPaciente id del paciente asociado a la lectura.
     * @throws Exception cuando ya existe un paciente con el id suministrado
     * @return paciente agregado
     */
    public LecturaDetailDTO createLectura(LecturaDTO nLectura, int idPaciente) throws Exception {
        logger.info("recibiendo solicitud de agregar lectura " + nLectura);
        LecturaDetailDTO newLectura = new LecturaDetailDTO(nLectura);

        // genera un id para la lectura
        logger.info("Generando id para la nueva lectura");
        long newId = 1;
        for (LecturaDetailDTO lect : lecturas)
        {
            if (newId <= lect.getId()){
                    newId =  lect.getId() + 1;
            }
        }
        newLectura.setId(newId);

        //Buscamos el paciente
        PacienteLogicMock pacienteLogic = new PacienteLogicMock();
        PacienteDTO paciente = pacienteLogic.getPaciente(idPaciente);

        //Lo agregamos al historial medico

        if(paciente != null)
        {
            newLectura.setPaciente(paciente);
        }
        else
        {
            throw new Exception("No existe un paciente con ese id.");
        }

        logger.info("agregando lectura " + newLectura);
        lecturas.add(newLectura);
        return newLectura;
    }

    public LecturaDetailDTO updateLectura(LecturaDTO nLectura){
        for (LecturaDetailDTO lect : lecturas)
        {
            // si existe un paciente con ese id
            if (lect.getId() == nLectura.getId())
            {
                lect.setFecha(nLectura.getFecha());
                lect.setFrecuenciaCardiaca(nLectura.getFrecuenciaCardiaca());
                lect.setPresionSanguinea(nLectura.getPresionSanguinea());
                lect.setEstado(nLectura.getEstado());
                return lect;
            }
        }
        return null;
    }

    public LecturaDetailDTO deleteLectura(int id)
    {
        // busca el paciente con el id suministrado
        for (int i = 0; i < lecturas.size(); i++)
        {
            // si existe un paciente con ese id
            if (lecturas.get(i).getId() == id)
            {
                LecturaDetailDTO eliminado = lecturas.get(i);
                lecturas.remove(i);
                return eliminado;
            }
        }
        return null;
    }
}
