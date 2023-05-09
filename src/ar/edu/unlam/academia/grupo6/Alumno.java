package ar.edu.unlam.academia.grupo6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class Alumno extends Persona{
//atributo

	private LocalDate fechaDelInscripcion;
	private LocalDate fechaDelFinalizacion;
	private String estado;
	private HashSet<Curso>cursos;
	
//cinstructor
	public Alumno(String legajo, Long dni, String nombre, Long celular, String email, String direccion, 
	LocalDate fechaDelInscripcion, LocalDate fechaDelFinalizacion, String estado) {
	super(legajo,dni, nombre,celular, email, direccion);
	this.fechaDelFinalizacion=fechaDelFinalizacion;
	this.fechaDelInscripcion=fechaDelInscripcion;
	cursos = new HashSet<>();
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
		//preguntar si se pone asi
		this.estado="activo";
		this.estado = estado;
	}


}
