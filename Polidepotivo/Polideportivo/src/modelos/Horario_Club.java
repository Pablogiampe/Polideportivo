package modelos;

import java.time.*;

public class Horario_Club {
	private String diaSemana;
	private LocalTime horaApertura;
	private LocalTime horaCierre;
	public Horario_Club(String diaSemana, LocalTime horaApertura, LocalTime horaCierre) {
		super();
		this.diaSemana = diaSemana;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public LocalTime getHoraApertura() {
		return horaApertura;
	}
	public void setHoraApertura(LocalTime horaApertura) {
		this.horaApertura = horaApertura;
	}
	public LocalTime getHoraCierre() {
		return horaCierre;
	}
	public void setHoraCierre(LocalTime horaCierre) {
		this.horaCierre = horaCierre;
	}
	
}
