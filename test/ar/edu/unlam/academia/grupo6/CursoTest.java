package ar.edu.unlam.academia.grupo6;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {

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
	public void queSePuedaIngresarUnCurso() {
		//PREPARACION 
		
		
		
		//ACCION
				
		
		
		//VALIDACION
		
	}
	
	
}
