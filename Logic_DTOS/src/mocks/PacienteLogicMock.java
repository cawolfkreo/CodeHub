package DTOS;

import java.util.Date;

public class PacienteLogicMock {

    // objeto para presentar logs de las operaciones
    private final static Logger logger = Logger.getLogger(PacienteLogicMock.class.getName());

    // listado de ciudades
    private static ArrayList<PacienteDTO> pacientes;

    /**
     * Constructor. Crea los datos de ejemplo.
     */
    public PacienteLogicMock() {

        if (pacientes == null) {
            pacientes = new ArrayList<>();
            pacientes.add(new PacienteDTO(1,"Carlos Lopez","O+"));
            pacientes.add(new PacienteDTO(2,"Daniela Perez","AB+"));
            pacientes.add(new PacienteDTO(3,"John Doe","B+"));
        }

        // indica que se muestren todos los mensajes
        logger.setLevel(Level.INFO);

        // muestra información
        logger.info("Inicializa la lista de pacientes");
        logger.info("pacientes" + pacientes );
    }

    /**
     * Obtiene el listado de personas.
     * @return lista de pacientes
     * @throws Exception cuando no existe la lista en memoria
     */
    public List<PacienteDTO> getPacientes() throws Exception {
        if (pacientes == null) {
            logger.severe("Error interno: lista de pacientes no existe.");
            throw new Exception("Error interno: lista de ciudades no existe.");
        }

        logger.info("retornando todas las pacientes");
        return pacientes;
    }

    /**
     * Obtiene el paciente.
     * @return paciente
     * @throws Exception cuando no existe el paciente en memoria
     */
    public PacienteDTO getPaciente(int idPaciente){
        PacienteDTO rta = null;
        for (PacienteDTO paciente : pacientes) {
            // si existe un paciente con ese id
            if (Objects.equals(paciente.getId(), idPaciente)){
                rta = paciente;
            }
        }
        return rta;
    }

    /**
     * Agrega un paciente a la lista.
     * @param newPaciente paciente a adicionar
     * @throws PacienteLogicException cuando ya existe un paciente con el id suministrado
     * @return paciente agregado
     */
    public PacienteDTO createPaciente(PacienteDTO newPaciente) throws Exception {
        logger.info("recibiendo solicitud de agregar paciente " + newPaciente);

        // el nuevo paciente tiene id ?
        if ( newPaciente.getId() != null ) {
            // busca el paciente con el id suministrado
            for (PacienteDTO paciente : pacientes) {
                // si existe un paciente con ese id
                if (Objects.equals(paciente.getId(), newPaciente.getId())){
                    logger.severe("Ya existe un paciente con ese id");
                    throw new Exception("Ya existe un paciente con ese id");
                }
            }

            // el nuevo paciente no tiene id ?
        } else {

            // genera un id para el paciente
            logger.info("Generando id para el nuevo paciente");
            long newId = 1;
            for (PacienteDTO paciente : pacientes) {
                if (newId <= paciente.getId()){
                    newId =  paciente.getId() + 1;
                }
            }
            newPaciente.setId(newId);
        }

        // agrega la ciudad
        logger.info("agregando paciente " + newPaciente);
        pacientes.add(newPaciente);
        return newPaciente;
    }

    public PacienteDTO updatePaciente(PacienteDTO updatePaciente){
        PacienteDTO rta = null;
        if ( updatePaciente.getId() != null ) {
            // busca el paciente con el id suministrado
            for (PacienteDTO paciente : pacientes) {
                // si existe un paciente con ese id
                if (Objects.equals(paciente.getId(), updatePaciente.getId())){
                    paciente.setId(updatePaciente.getId());
                    paciente.setNombre(updatePaciente.getNombre());
                    paciente.setGrupoSanguineo(updatePaciente.getGrupoSanguineo());
                    rta = paciente;
                }
            }
        }
        return rta;
    }

    public void deletePaciente(int id){
        if ( id != null ) {
            // busca el paciente con el id suministrado
            for (PacienteDTO paciente : pacientes) {
                // si existe un paciente con ese id
                if (Objects.equals(paciente.getId(), id)){
                    pacientes.remove(paciente);
                }
            }
        }
    }

}