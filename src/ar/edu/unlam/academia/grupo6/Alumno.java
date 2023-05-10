package ar.edu.unlam.academia.grupo6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class Alumno extends Persona{
//atributo

	private LocalDate fechaDelInscripcion;
	private LocalDate fechaDelFinalizacion;
	private String estado;
	private Integer asistencia;
	private Integer cantidadDeCursosInscripto;



	//constructor
	public Alumno(String legajo, Long dni, String nombre, Long celular, String email, String direccion, 
	LocalDate fechaDelInscripcion, LocalDate fechaDelFinalizacion, String estado) {
	super(legajo,dni, nombre,celular, email, direccion);
	this.fechaDelFinalizacion=fechaDelFinalizacion;
	this.fechaDelInscripcion=fechaDelInscripcion;
	this.cantidadDeCursosInscripto = 0;
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
	
public Integer getAsistencia() {
		return asistencia;
	}


	public void setAsistencia(Integer asistencia) {
		this.asistencia = asistencia;
	}


	public Integer getCantidadDeCursosInscripto() {
		return cantidadDeCursosInscripto;
	}


	public void setCantidadDeCursosInscripto(Integer cantidadDeCursosInscripto) {
		this.cantidadDeCursosInscripto = cantidadDeCursosInscripto;
	}


	public void agregarUnCurso(String legajo) {
		if(this.getLegajo().equals(legajo)) {
			this.cantidadDeCursosInscripto +=1 ;
		}
		
	}

}
