package interfaces;

import java.util.List;
import java.util.Optional;
import models.Reserva; // Supongo que tienes una clase modelo Reserva

public interface ReservaRepository {

    // Crear una nueva reserva
    void crearReserva(Reserva reserva);

    // Obtener una reserva por su ID
    Optional<Reserva> obtenerReservaPorId(int idReserva);

    // Obtener todas las reservas
    List<Reserva> obtenerTodasLasReservas();

    // Obtener reservas por cliente
    List<Reserva> obtenerReservasPorCliente(int idCliente);

    // Obtener reservas por cancha
    List<Reserva> obtenerReservasPorCancha(int idCancha);

    // Obtener reservas por fecha específica
    List<Reserva> obtenerReservasPorFecha(String fechaReserva);

    // Actualizar una reserva existente
    void actualizarReserva(Reserva reserva);

    // Eliminar una reserva por su ID
    void eliminarReserva(int idReserva);

    // Cambiar el estado de una reserva (Confirmada, Pendiente, Cancelada)
    void cambiarEstadoReserva(int idReserva, String nuevoEstado);
}
