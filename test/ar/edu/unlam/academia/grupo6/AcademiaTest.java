package ar.edu.unlam.academia.grupo6;

import static org.junit.Assert.*;

import java.time.LocalDate;

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
	public void queSePuedaCrearUnInstructor() {
				
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
		Instructor nuevoInstructor = new Instructor(dni,codigo,nombre,celular,email,direccion,sueldo,turno);
				
		//VALIDACION
		assertNotNull (nuevoInstructor);
	}
	
	@Test
	public void queSePuedaAnotarUnInstructorEnLaAcademia() {
				
		//PREPARACION 
		Long dni =37246801L;
		Integer codigo=4;
		String nombre ="lucas Barrios";
		Long celular = 1123451234L;
		String email="lucasbarrios@alumno.edu.ar";
		String direccion ="calle falsa123";
		Double sueldo=2400.00;
		String turno="mañana";
		String nombreDeLaAcademia = "Don Rip-Rip";
		
		
		//ACCION
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Instructor nuevoInstructor = new Instructor(dni,codigo,nombre,celular,email,direccion,sueldo,turno);
		Boolean SePudoRegistrar = DonRipRip.registrarInstructorEnAcademia(nuevoInstructor);
				
		//VALIDACION
		assertTrue (SePudoRegistrar);
	}
	
	@Test
	public void queSePuedaCrearUnAlumno() {
				
		//PREPARACION 
		Long dni =32432443L;
		String nombre ="Menganito Ramirez";
		Long celular = 1124356456L;
		String email="menganoagarramedelamano@alumno.edu.ar";
		String direccion ="calle walaby 2467 ";
		Integer id= 1;
		//un mes debe durar como minimo
		LocalDate fechaDelInscripcion= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacion= LocalDate.of(2023, 02, 03);
		
				
		//ACCION		
		Alumno nuevoAlumno =new Alumno(dni, nombre, celular, email, direccion,id,fechaDelInscripcion,fechaDelFinalizacion);
				
		//VALIDACION
		assertNotNull (nuevoAlumno);
	}
	
	@Test
	public void queSePuedaIngresarUnAlumnoALaAcademia() {
		
//PREPARACION 
		Long dni =32432443L;
		String nombre ="Menganito Ramirez";
		Long celular = 1124356456L;
		String email="menganoagarramedelamano@alumno.edu.ar";
		String direccion ="calle walaby 2467 ";
		Integer id= 1;
//un mes debe durar como minimo
		LocalDate fechaDelInscripcion= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacion= LocalDate.of(2023, 02, 03);
		String nombreDeLaAcademia = "Don Rip-Rip";



		
//ACCION		
		Alumno nuevoAlumno =new Alumno(dni, nombre, celular, email, direccion,id,fechaDelInscripcion,fechaDelFinalizacion);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);	
		Boolean sePudoIngresar=DonRipRip.ingresarAlumnoALaAcademia(nuevoAlumno);
		
//VALIDACION
		assertTrue(sePudoIngresar);

	}
	
	
	


	
	
}
