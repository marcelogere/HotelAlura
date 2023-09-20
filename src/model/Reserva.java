package model;

import java.sql.Date;

public class Reserva {
	
	private Integer id;
	private java.util.Date fechaE;
	private java.util.Date fechaS;
	private String valor;
	private Object formaPago;
	
	
	public Reserva(java.util.Date fechaE, java.util.Date fechaS, String valor, Object formaPago) {		
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
	}
		
	public Reserva(Integer id, Date fechaE, Date fechaS, String valor, String formaPago) {
		this.id = id;
		this.fechaE = fechaE;
		this.fechaS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public java.util.Date getfechaE() {
		return fechaE;
	}

	public java.util.Date getfechaS() {
		return fechaS;
	}

	public String getvalor() {
		return valor;
	}

	public Object getformaPago() {
		return formaPago;
	}

	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("La reserva generada fue: %d, %s, %s, %s, %s", this.id, this.fechaE, this.fechaS, this.valor, this.formaPago);
//	}
//	
	
	
}