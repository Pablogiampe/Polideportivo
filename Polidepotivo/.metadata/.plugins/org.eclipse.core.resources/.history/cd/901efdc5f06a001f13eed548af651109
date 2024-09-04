package interfaces;

import java.util.List;
import java.util.Optional;
import models.Empleado; // Supongo que tienes una clase modelo Empleado

public interface EmpleadoRepository {

    // Crear un nuevo empleado
    void crearEmpleado(Empleado empleado);

    // Obtener un empleado por su ID
    Optional<Empleado> obtenerEmpleadoPorId(int idEmpleado);

    // Obtener todos los empleados
    List<Empleado> obtenerTodosLosEmpleados();

    // Obtener empleados por nombre
    List<Empleado> obtenerEmpleadosPorNombre(String nombre);

    // Actualizar un empleado existente
    void actualizarEmpleado(Empleado empleado);

    // Eliminar un empleado por su ID
    void eliminarEmpleado(int idEmpleado);


    // Cambiar la contraseña de un empleado
    void cambiarContraseña(int idEmpleado, String nuevaContraseña);
}
