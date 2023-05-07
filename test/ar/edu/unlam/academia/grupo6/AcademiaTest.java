package ar.edu.unlam.academia.grupo6;

import static org.junit.Assert.*;

import org.junit.Test;

//PREPARACION 	
//ACCION
//VALIDACION

public class AcademiaTest {

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
		
		
		
		//ACCION
				
		
		
		//VALIDACION
		
	}
	
	
}
