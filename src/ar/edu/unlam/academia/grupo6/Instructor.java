package ar.edu.unlam.academia.grupo6;

import java.util.Objects;

public class Instructor extends Persona {

	private String turno;
	private Double sueldo;

	
	
	
	
	//CONSTRUCTORES
	
	public Instructor(String legajo, Long dni, String nombre, Long celular, String email, String direccion,
			Double sueldo, String turno) {
		super(legajo,dni,nombre,celular,email,direccion);
		this.turno=turno;
		this.sueldo=sueldo;
	
	}

	

	public Instructor() {
		super();
		
	}
	
	
	//GETERS & SETTERS 
	





	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
	}



	public Double getSueldo() {
		return sueldo;
	}



	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}




	


}
