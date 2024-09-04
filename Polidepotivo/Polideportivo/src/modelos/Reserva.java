package modelos;

import java.time.*;

public class Reserva {
	private String estadoReserva;
	private LocalTime horaInicio;
	private LocalDate fechaReserva;
	private LocalTime horaFin;
	public String getEstadoReserva() {
		return estadoReserva;
	}
	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public LocalTime getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}
	public Reserva(String estadoReserva, LocalTime horaInicio, LocalDate fechaReserva, LocalTime horaFin) {
		super();
		this.estadoReserva = estadoReserva;
		this.horaInicio = horaInicio;
		this.fechaReserva = fechaReserva;
		this.horaFin = horaFin;
	}
	
}
