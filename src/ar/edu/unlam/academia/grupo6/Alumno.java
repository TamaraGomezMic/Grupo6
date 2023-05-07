package ar.edu.unlam.academia.grupo6;

import java.time.LocalDate;

public class Alumno extends Persona{
//atributo
	private Integer id;
	private LocalDate fechaDelInscripcion;
	private LocalDate fechaDelFinalizacion;

	
//cinstructor
	public Alumno(Long dni, String nombre, Long celular, String email, String direccion, Integer id,
	LocalDate fechaDelInscripcion, LocalDate fechaDelFinalizacion) {
	super(dni, nombre,celular, email, direccion);
	this.fechaDelFinalizacion=fechaDelFinalizacion;
	this.fechaDelInscripcion=fechaDelInscripcion;
	this.id=id;
	
		
	}
	
	
	public Alumno() {
		super();
		
		
	}

//metodos

	public Integer getId() {
		return id;
		
	}


	public void setId(Integer id) {
		this.id = id;
	}


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
}
