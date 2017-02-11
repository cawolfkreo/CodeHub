package DTOS;

import java.util.Date;

/**
 * Clase que representa un paciente
 * Created by ln.bello10 on 10/02/2017.
 */

@Path("/pacientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PacienteResource {

        @Inject
        private PacienteLogic pacienteLogic;

        /**
         * Obtiene una colecci�n de instancias de PacienteDTO existentes.
         *
         * @return Colecci�n de instancias de PacienteDTO.
         */
        @GET
        public List<PacienteDTO> getPacientes() {
            return pacienteLogic.getPacientes();
        }

        /**
         * Obtiene una instancia de PacienteDTO a partir de su identificador.
         *
         * @param id Identificador de la instancia de Paciente
         * @return Instancia de PacienteDTO asociada al id provisto.
         */
        @GET
        @Path("{pacienteId: \\d+}")
        public PacienteDTO getPaciente(@PathParam("pacienteId") int id) {
            return pacienteLogic.getPaciente(id);
        }

        /**
         * Crea un registro de Paciente y retorna la instancia de este registro.
         *
         * @param  PacienteDTO
         * @return Instancia de PacienteDTO con los nuevos datos y el ID.
         */
        @POST
        public PacienteDTO createPaciente(PacienteDTO dto) {
            return pacienteLogic.createPaciente(dto);
        }

        /**
         * Actualiza los datos de un registro de Paciente
         *
         * @param id Identificador del registro de Paciente a actualizar
         * @param dto PacienteDTO
         * @return Instancia de PacienteDTO con los datos nuevos.
         */
        @PUT
        @Path("{pacienteId: \\d+}")
        public PacienteDTO updatePaciente(@PathParam("pacienteId") int id, PacienteDTO dto) {
            dto.setId(id);
            return pacienteLogic.updatePaciente(dto);
        }

        /**
         * Elimina un registro de Paciente a partir de su identificador.
         *
         * @param id Identificador de la instancia de Paciente
         */
        @DELETE
        @Path("{authorId: \\d+}")
        public void deletePaciente(@PathParam("pacienteId") int id) {
            pacienteLogic.deletePaciente(id);
        }
