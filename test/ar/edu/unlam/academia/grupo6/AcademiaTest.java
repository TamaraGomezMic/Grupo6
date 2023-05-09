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
		
		
		//ACCION
		Curso manejoInicial = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota);
			
		//VALIDACION
		assertNotNull (manejoInicial); 
		
	}
	
	@Test
	public void queSePuedaIngresarUnCursoEnLaAcademia() {
		//PREPARACION 
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		//duracion en clases
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		String nombreDeLaAcademia = "Don Rip-Rip";
		
		//ACCION
		Curso manejoInical = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Boolean sePudo = DonRipRip.IngrasarCursoEnLaAcademia(manejoInical);
		
		//VALIDACION
		
		assertTrue (sePudo);
		assertNotNull (manejoInical); 
		
						
		
	}
	@Test
	public void queSePuedanAgregarClasesExtra() {
		//PREPARACION 
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		String nombreDeLaAcademia = "Don Rip-Rip";
		Integer cantidadDeClasesExtra=1;
		
		
		//ACCION
		Curso manejoInicial = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Boolean sePudo = DonRipRip.IngrasarCursoEnLaAcademia(manejoInicial);
		Integer agregarClaseExtra =manejoInicial.queSePuedaAgregarUnaClaseExtraAlCurso(cantidadDeClasesExtra);
	
		//VALIDACION
		
		assertTrue (sePudo);
		assertNotNull (manejoInicial); 
		assertEquals(agregarClaseExtra,cantidadDeClasesExtra);
	
	}
	@Test
	public void queSePuedanAgregarClasesExtraAUnCursoEnLaAcademia() {
		//PREPARACION 
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		String nombreDeLaAcademia = "Don Rip-Rip";
		Integer cantidadDeClasesExtra=1;
		Integer cantidadDeClasesTotalesEsperadas=11;
		
		//ACCION
		Curso manejoInicial = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Boolean sePudo = DonRipRip.IngrasarCursoEnLaAcademia(manejoInicial);
		Integer agregarClaseExtra =manejoInicial.queSePuedaAgregarUnaClaseExtraAlCurso(cantidadDeClasesExtra);
		Boolean agregarClaseExtraAlCurso=DonRipRip.agregarUnaClaseExtraAUnCursoAUnaAcademia(agregarClaseExtra,codigoCurso);
		Integer cantidadDeClasesTotales=DonRipRip.mostrarLaCantidadDeHorasDelCursoActualizado(agregarClaseExtra,codigoCurso);
		//VALIDACION
		System.out.println(cantidadDeClasesTotales);
		assertTrue (sePudo);
		assertNotNull (manejoInicial); 
		assertEquals(agregarClaseExtra,cantidadDeClasesExtra);
		assertTrue(agregarClaseExtraAlCurso);
		assertEquals(cantidadDeClasesTotalesEsperadas,cantidadDeClasesTotales);
	
	}
	
	//queSePuedaBuscarUnCursoPorCódigoYDuración
	//QueSePuedaVerificarLaVigenciaDeUnCursoParaUnAlumno
	//QueSePuedaAsignarUnInstructorYUnAlumnoAUnCurso
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		String legajo="433FF3";
	
		
				
		//ACCION		
		Instructor nuevoInstructor = new Instructor(legajo,dni,nombre,celular,email,direccion,sueldo,turno);
				
		//VALIDACION
		assertNotNull (nuevoInstructor);
	}
	
	@Test
	public void queSePuedaAnotarUnInstructorEnLaAcademia() {
				
		//PREPARACION 
		Long dni =37246801L;
		String legajo="433FF3";
		String nombre ="lucas Barrios";
		Long celular = 1123451234L;
		String email="lucasbarrios@alumno.edu.ar";
		String direccion ="calle falsa123";
		Double sueldo=2400.00;
		String turno="mañana";
		String nombreDeLaAcademia = "Don Rip-Rip";
		
		
		//ACCION
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Instructor nuevoInstructor = new Instructor(legajo,dni,nombre,celular,email,direccion,sueldo,turno);
		Boolean SePudoRegistrar = DonRipRip.registrarInstructorEnAcademia(nuevoInstructor);
				
		//VALIDACION
		assertTrue (SePudoRegistrar);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ALUMNO +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
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
		String estado="activo";
		String legajo="433FF3";
				
		//ACCION		
		Alumno nuevoAlumno =new Alumno(legajo, dni, nombre, celular, email, direccion,fechaDelInscripcion,fechaDelFinalizacion,estado);
				
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
		String estado="activo";
		String nombreDeLaAcademia = "Don Rip-Rip";
		String legajo="433FF3";
		

	
//ACCION		
		Alumno nuevoAlumno =new Alumno(legajo,dni, nombre, celular, email, direccion,fechaDelInscripcion,fechaDelFinalizacion,estado);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);	
		Boolean sePudoIngresar=DonRipRip.ingresarAlumnoALaAcademia(nuevoAlumno);
		
//VALIDACION
		assertTrue(sePudoIngresar);

	}

	//queSePuedaVerElEstadoDelAlumnoEnLaAcademia
	//queSePuedaObtenerLaCantidadDeAlumnosInscriptosEnLaAcademia


	
	
}
