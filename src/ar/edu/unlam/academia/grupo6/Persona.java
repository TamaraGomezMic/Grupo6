package ar.edu.unlam.academia.grupo6;

import java.util.Objects;

public abstract class Persona {

	
	//ATRIBUTOS
	private Long dni;
	private String nombre;
	private Long celular;
	private String email;
	private String direccion;
	
	
	
	//CONSTRUCTOR
	public Persona(Long dni, String nombre, Long celular, String email, String direccion) {
		this.dni=dni;
		this.nombre=nombre;
		this.celular=celular;
		this.direccion=direccion;
		this.email=email;
	}



	public Persona() {
		// TODO Auto-generated constructor stub
	}



	public Long getDni() {
		return dni;
	}



	public void setDni(Long dni) {
		this.dni = dni;
	}


	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Long getCelular() {
		return celular;
	}



	public void setCelular(Long celular) {
		this.celular = celular;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	// selecciono por que parametro vav a comparar (dni)
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	//METODO
}
