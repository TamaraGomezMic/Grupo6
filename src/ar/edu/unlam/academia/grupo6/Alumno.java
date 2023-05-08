package ar.edu.unlam.academia.grupo6;

import java.time.LocalDate;

public class Alumno extends Persona{
//atributo

	private LocalDate fechaDelInscripcion;
	private LocalDate fechaDelFinalizacion;
	private String estado;

	
//cinstructor
	public Alumno(String legajo, Long dni, String nombre, Long celular, String email, String direccion, 
	LocalDate fechaDelInscripcion, LocalDate fechaDelFinalizacion, String estado) {
	super(legajo,dni, nombre,celular, email, direccion);
	this.fechaDelFinalizacion=fechaDelFinalizacion;
	this.fechaDelInscripcion=fechaDelInscripcion;

	this.estado=estado;
	
		
	}
	
	
	public Alumno() {
		super();
		
		
	}

//metodos



	public LocalDate getFechaDelInscripcion() {
		return fechaDelInscripcion;
	}


	public void setFechaDelInscripcion(LocalDate fechaDelInscripcion) {
		this.fechaDelInscripcion = fechaDelInscripcion;
	}


	public LocalDate getFechaDelFinalizacion() {
		return fechaDelFinalizacion;
	}


	public void setFechaDelFinalizacion(LocalDate fechaDelFinalizacion) {
		this.fechaDelFinalizacion = fechaDelFinalizacion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
}
