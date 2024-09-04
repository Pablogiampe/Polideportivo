package interfaces;

import java.util.List;
import java.util.Optional;
import models.Pago; // Supongo que tienes una clase modelo Pago

public interface PagoRepository {

    // Crear un nuevo pago
    void crearPago(Pago pago);

    // Obtener un pago por su ID
    Optional<Pago> obtenerPagoPorId(int idPago);

    // Obtener todos los pagos
    List<Pago> obtenerTodosLosPagos();

    // Obtener pagos por método de pago (Tarjeta, Efectivo, Transferencia)
    List<Pago> obtenerPagosPorMetodo(String metodoPago);

    // Obtener pagos por reserva
    List<Pago> obtenerPagosPorReserva(int idReserva);

    // Actualizar un pago existente
    void actualizarPago(Pago pago);

    // Eliminar un pago por su ID
    void eliminarPago(int idPago);
}
