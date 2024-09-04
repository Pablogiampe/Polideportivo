package interfaces;

import java.util.List;
import java.util.Optional;
import models.Cancha; // Supongo que tienes una clase modelo Cancha

public interface CanchaRepository {

    // Crear una nueva cancha
    void crearCancha(Cancha cancha);

    // Obtener una cancha por su ID
    Optional<Cancha> obtenerCanchaPorId(int idCancha);

    // Obtener todas las canchas
    List<Cancha> obtenerTodasLasCanchas();

    // Obtener canchas por tipo (Padel, Tennis, etc.)
    List<Cancha> obtenerCanchasPorTipo(String tipo);

    // Actualizar una cancha existente
    void actualizarCancha(Cancha cancha);

    // Eliminar una cancha por su ID
    void eliminarCancha(int idCancha);

    // Cambiar el estado de una cancha (Disponible, Mantenimiento, Reservada)
    void cambiarEstadoCancha(int idCancha, String nuevoEstado);
}
