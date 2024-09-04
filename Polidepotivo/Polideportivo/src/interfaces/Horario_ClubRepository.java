package interfaces;

import java.util.List;
import java.util.Optional;
import models.Horario_Club; // Supongo que tienes una clase modelo Horario_Club

public interface Horario_ClubRepository {

    // Crear un nuevo horario para el club
    void crearHorario(Horario_Club horario);

    // Obtener un horario por su ID
    Optional<Horario_Club> obtenerHorarioPorId(int idHorario);

    // Obtener todos los horarios
    List<Horario_Club> obtenerTodosLosHorarios();

    // Obtener horarios por cancha específica
    List<Horario_Club> obtenerHorariosPorCancha(int idCancha);

    // Obtener horarios por día de la semana
    List<Horario_Club> obtenerHorariosPorDiaSemana(String diaSemana);

    // Actualizar un horario existente
    void actualizarHorario(Horario_Club horario);

    // Eliminar un horario por su ID
    void eliminarHorario(int idHorario);
}
