package ar.edu.unlam.academia.grupo6;

import static org.junit.Assert.*;

import org.junit.Test;

//PREPARACION 	
//ACCION
//VALIDACION

public class AcademiaTest {

	
	// ACADEMIA +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	@Test
	public void queSePuedaCrearUnaAcademia() {
				
		//PREPARACION 
		String nombreDeLaAcademia = "Don Rip-Rip";
				
		//ACCION
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
				
		//VALIDACION
		assertNotNull (DonRipRip);
	}
	
	@Test
	public void queSePuedaCrearUnCurso() {
		//PREPARACION 
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		Double valorClaseExtra = 1000.00;
		
		
		//ACCION
		Curso nombreDelCurso = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota, valorClaseExtra);
		
		
		//VALIDACION
		assertNotNull (nombreDelCurso); 
		
	}
	
	@Test
	public void queSePuedaIngresarUnCursoEnLaAcademia() {
		//PREPARACION 
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		Double valorClaseExtra = 1000.00;
		String nombreDeLaAcademia = "Don Rip-Rip";
		
		//ACCION
		Curso nombreDelCurso = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota, valorClaseExtra);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Boolean sePudo = DonRipRip.IngrasarCursoEnLaAcademia(nombreDelCurso);
		
		//VALIDACION
		
		assertTrue (sePudo);
		assertNotNull (nombreDelCurso); 
		
						
		
	}
	
	// INSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	
	@Test
	public void queSePuedaCrearUnaPersonaInstructor() {
				
		//PREPARACION 
		Long dni =37246801L;
		Integer codigo=1;
		String nombre ="lucas Barrios";
		Long celular = 1123451234L;
		String email="lucasbarrios@alumno.edu.ar";
		String direccion ="calle falsa123";
		Double sueldo=2400.00;
		String turno="mañana";
		
		
				
		//ACCION
		Persona nuevaPersona= new Persona (dni,codigo,nombre,celular,email,direccion);
		Instructor nuevoInstructor = new Instructor(nuevaPersona,sueldo,turno);
				
		//VALIDACION
		assertNotNull (nuevaPersona);
	}
	
	@Test
	public void queSePuedaCrearUnInstructor() {
		//PREPARACION 
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		Double valorClaseExtra = 1000.00;
		
		
		//ACCION
		Curso nombreDelCurso = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota, valorClaseExtra);
		
		
		//VALIDACION
		assertNotNull (nombreDelCurso); 
		
	}
	
	
	
}
