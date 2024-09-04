package modelos;

import java.time.LocalDate;

public class Pago {
	private String metodoPago;
	private double monto;
	private LocalDate fechaPago;
	
	
	public Pago(String metodoPago, double monto, LocalDate fechaPago) {
		super();
		this.metodoPago = metodoPago;
		this.monto = monto;
		this.fechaPago = fechaPago;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	
}
