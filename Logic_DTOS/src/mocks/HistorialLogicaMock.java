package mocks;

import DTOS.HistorialDTO;
import DTOS.HistorialDetailDTO;
import DTOS.PacienteDTO;
import DTOS.PacienteLogicMock;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistorialLogicaMock
{

    // objeto para presentar logs de las operaciones
    private final static Logger logger = Logger.getLogger(HistorialLogicaMock.class.getName());

    /**
     * Mock de la persistencia de las lecturas
     */
    private static List<HistorialDetailDTO> historiales;

    public HistorialLogicaMock() {

        if (historiales == null) {
            historiales = new ArrayList<>();
        }

        // indica que se muestren todos los mensajes
        logger.setLevel(Level.INFO);

        // muestra información
        logger.info("Inicializa la lista de lecturas");
    }

    /**
     * Obtiene el listado de los historiales de todos los pacientes.
     * @return lista de historiales
     * @throws Exception cuando no existe la lista en memoria
     */
    public List<HistorialDetailDTO> getHistoriales() throws Exception {
        if (historiales == null) {
            logger.severe("Error interno.");
            throw new Exception("Error interno: Lista de lecturas no existe.");
        }

        logger.info("Retornando todas las lecturas");
        return historiales;
    }

    /**
     * Obtiene el historial de un paciente.
     * @param idPaciente el id del paciente asociado
     * @return Historial
     */
    public HistorialDetailDTO getHistorialPaciente(int idPaciente)
    {
        for(int i = 0; i< historiales.size(); i++)
        {
            if(historiales.get(i).getPaciente().getId() == idPaciente)
                return historiales.get(i);
        }
        return null;
    }

    /**
     * Agrega un historial a la lista
     * @param nHistorial historial a adicionar
     * @param idPaciente id del paciente asociado a la lectura.
     * @throws Exception cuando ya existe un paciente con el id suministrado
     * @return paciente agregado
     */
    public HistorialDetailDTO createHistorial(HistorialDTO nHistorial, int idPaciente) throws Exception {
        logger.info("recibiendo solicitud de agregar historial " + nHistorial);
        HistorialDetailDTO newHistorial = new HistorialDetailDTO(nHistorial);


        //Buscamos el paciente
        PacienteLogicMock pacienteLogic = new PacienteLogicMock();
        PacienteDTO paciente = pacienteLogic.getPaciente(idPaciente);

        if(paciente != null)
        {
            newHistorial.setPaciente(paciente);
        }
        else
        {
            throw new Exception("No existe un paciente con ese id.");
        }

        logger.info("agregando historial " + newHistorial);
        historiales.add(newHistorial);
        return newHistorial;
    }

    public HistorialDetailDTO updateHistorial(HistorialDTO nHistorial, int idPaciente){
        for (HistorialDetailDTO hist : historiales)
        {
            // si existe un paciente con ese id
            if (hist.getPaciente().getId() == idPaciente)
            {
                hist.setEnfermedades(nHistorial.getEnfermedades());
                hist.setAlergias(nHistorial.getAlergias());
                return hist;
            }
        }
        return null;
    }

    public HistorialDetailDTO deleteLectura(int idPaciente)
    {
        // busca el paciente con el id suministrado
        for (int i = 0; i < historiales.size(); i++)
        {
            // si existe un paciente con ese id
            if (historiales.get(i).getPaciente().getId() == idPaciente)
            {
                HistorialDetailDTO eliminado = historiales.get(i);
                historiales.remove(i);
                return eliminado;
            }
        }
        return null;
    }
}
