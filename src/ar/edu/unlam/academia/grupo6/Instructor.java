package ar.edu.unlam.academia.grupo6;

import java.util.Objects;

public class Instructor extends Persona {
	private Double sueldo;
	private String turno;
	private Integer legajo;
	
	
	
	
	//CONSTRUCTORES
	
	public Instructor(Long dni, Integer legajo, String nombre, Long celular, String email, String direccion,
			Double sueldo, String turno) {
		super(dni,nombre,celular,email,direccion);
		this.sueldo=sueldo;
		this.turno=turno;
		this.legajo=legajo;
		
	}

	

	public Instructor() {
		super();
		this.sueldo=sueldo;
		this.turno=turno;
	}

	
	
	//GETERS & SETTERS 
	
	public Double getSueldo() {
		return sueldo=0.00;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}


	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}



	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
	}


// selecciono por que parametro vav a comparar (legajo)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instructor other = (Instructor) obj;
		return Objects.equals(legajo, other.legajo);
	}



	


}
