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
		Integer cantidadDeClasesExtra=4;
		Integer cantidadDeClasesTotalesEsperadas=14;
		
		//ACCION
		Curso manejoInicial = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Boolean sePudo = DonRipRip.IngrasarCursoEnLaAcademia(manejoInicial);
		Integer agregarClaseExtra =manejoInicial.queSePuedaAgregarUnaClaseExtraAlCurso(cantidadDeClasesExtra);
		
		//evaluo que se pueda ingresar las clases extra al al curso de la academia 
		Boolean agregarClaseExtraAlCurso=DonRipRip.agregarUnaClaseExtraAUnCursoAUnaAcademia(agregarClaseExtra,codigoCurso);
		Integer cantidadDeClasesTotales=DonRipRip.mostrarLaCantidadDeHorasDelCursoActualizado(agregarClaseExtra,codigoCurso);
		//VALIDACION
		
		assertTrue(agregarClaseExtraAlCurso);
		assertEquals(cantidadDeClasesTotalesEsperadas,cantidadDeClasesTotales);
	
	}
	@Test
	public void queSePuedaBuscarUnCursoPorCódigo() {
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
		Curso seEncontroCurso=DonRipRip.buscarCursoPorCodigo(codigoCurso);
		//VALIDACION
		assertEquals(codigoCurso,seEncontroCurso.getCodigoCurso());
		
		
	}

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
	
	
	
	@Test
	public void queSePuedaAumentarElsueldoDelInstructorEnLaAcademia() {
				
		//PREPARACION 
		Long dni =37246801L;
		String legajo="433FF3";
		String nombre ="lucas Barrios";
		Long celular = 1123451234L;
		String email="lucasbarrios@alumno.edu.ar";
		String direccion ="calle falsa123";
		Double sueldo=24000.00;
		Double AumentoDelSueldo=1.1;
		String turno="mañana";
		String nombreDeLaAcademia = "Don Rip-Rip";
		Double sueldoEsperado = sueldo*AumentoDelSueldo;
		
		//ACCION
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Instructor nuevoInstructor = new Instructor(legajo,dni,nombre,celular,email,direccion,sueldo,turno);
		Boolean SePudoRegistrar = DonRipRip.registrarInstructorEnAcademia(nuevoInstructor);
		Instructor seAumentoElSueldo = DonRipRip.aumentarElSueldoDeUnInstructor(AumentoDelSueldo,legajo);
		//System.out.println(seAumentoElSueldo.getSueldo());		
		//VALIDACION
		assertTrue (SePudoRegistrar);
		assertEquals (sueldoEsperado, seAumentoElSueldo.getSueldo());
	}
	
	
	@Test
	public void queSePuedaAgregarUnInstructorAUnCursoEnLaAcademia() {
		
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
		
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		//duracion en clases
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		
		
		//ACCION
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		Curso manejoInicial = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota);
		Instructor nuevoInstructor = new Instructor(legajo,dni,nombre,celular,email,direccion,sueldo,turno);
		Boolean sePudo = DonRipRip.registrarInstructorEnAcademia(nuevoInstructor);
		Boolean seIngreso = DonRipRip.IngrasarCursoEnLaAcademia(manejoInicial);
		Boolean SePudoAgregar = DonRipRip.AgregoInstructorAlCurso(codigoCurso, legajo);
		System.out.println(manejoInicial.mostrarInstructor().getNombre());
		//VALIDACION
		assertTrue (SePudoAgregar);
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
	
	@Test
	public void queSePuedaBuscarUnALumnoPorLegajoEnLaAcademia() {
		
//PREPARACION 
		Long dni =32432443L;
		String nombre ="Menganito Ramirez";
		Long celular = 1124356456L;
		String email="menganoagarramedelamano@alumno.edu.ar";
		String direccion ="calle walaby 2467 ";
		String legajo="433FF3";
//un mes debe durar como minimo
		LocalDate fechaDelInscripcion= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacion= LocalDate.of(2023, 02, 03);
		String estado="activo";
		String nombreDeLaAcademia = "Don Rip-Rip";
	
	
		
		

	
//ACCION		
		Alumno nuevoAlumno =new Alumno(legajo,dni, nombre, celular, email, direccion,fechaDelInscripcion,fechaDelFinalizacion,estado);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);	
		Boolean sePudoIngresar=DonRipRip.ingresarAlumnoALaAcademia(nuevoAlumno);
		Alumno seEncontro = DonRipRip.buscarAlumnoPorLegajo(legajo);
		
//VALIDACION
		assertEquals(legajo,seEncontro.getLegajo());

	}

	@Test
	public void queSePuedaCambiarElEstadoDeUnAlumnoEnLaAcademia() {
		
//PREPARACION 
		Long dni =32432443L;
		String nombre ="Menganito Ramirez";
		Long celular = 1124356456L;
		String email="menganoagarramedelamano@alumno.edu.ar";
		String direccion ="calle walaby 2467 ";
		String legajo="433FF3";
//un mes debe durar como minimo
		LocalDate fechaDelInscripcion= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacion= LocalDate.of(2023, 02, 03);
		String estado="activo";
		String nombreDeLaAcademia = "Don Rip-Rip";
		String estadoEsperado="inactivo";
	
	
//ACCION		
		Alumno nuevoAlumno =new Alumno(legajo,dni, nombre, celular, email, direccion,fechaDelInscripcion,fechaDelFinalizacion,estado);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);	
		Boolean sePudoIngresar=DonRipRip.ingresarAlumnoALaAcademia(nuevoAlumno);
		Alumno seEncontro = DonRipRip.buscarAlumnoPorLegajo(legajo);
		Alumno seModificoEstado = DonRipRip.modificarEstadoDelAlumno(legajo);
		
//VALIDACION
		assertEquals(estadoEsperado,seModificoEstado.getEstado());

	}
	
	
	
	@Test
	public void queSePuedaVerElEstadoDelAlumnoEnLaAcademia() {
		
//PREPARACION 
		Long dni =32432443L;
		String nombre ="Menganito Ramirez";
		Long celular = 1124356456L;
		String email="menganoagarramedelamano@alumno.edu.ar";
		String direccion ="calle walaby 2467 ";
		String legajo="433FF3";
//un mes debe durar como minimo
		LocalDate fechaDelInscripcion= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacion= LocalDate.of(2023, 02, 03);
		String estado="activo";
		String nombreDeLaAcademia = "Don Rip-Rip";
	
	
	
//ACCION		
		Alumno nuevoAlumno =new Alumno(legajo,dni, nombre, celular, email, direccion,fechaDelInscripcion,fechaDelFinalizacion,estado);
		Academia DonRipRip = new Academia(nombreDeLaAcademia);	
		Boolean sePudoIngresar=DonRipRip.ingresarAlumnoALaAcademia(nuevoAlumno);
		Alumno seEncontro = DonRipRip.buscarAlumnoPorLegajo(legajo);
		String VerElEstado = seEncontro.getEstado();
		
//VALIDACION
		assertEquals(estado,seEncontro.getEstado());

	}
	

	
	//queSePuedaObtenerLaCantidadDeAlumnosInscriptosEnLaAcademia
	
	
	
	
	
	

	@Test
	public void queUnAlumnoSePuedaAnotarAUnCursoDeLaAcademia() {
		
//PREPARACION 
		Long dni =32432443L;
		String nombre ="Menganito Ramirez";
		Long celular = 1124356456L;
		String email="menganoagarramedelamano@alumno.edu.ar";
		String direccion ="calle walaby 2467 ";
		String legajo="433FF3";
		
//un mes debe durar como minimo
		LocalDate fechaDelInscripcion= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacion= LocalDate.of(2023, 02, 03);
		String estado="activo";
		
// academia 
		String nombreDeLaAcademia = "Don Rip-Rip";
		
// datos del curso 
		Integer codigoCurso = 1;
		String tipoDeCurso = "Curso de manejo inicial"; 
		//duracion en clases
		Integer duracionCurso = 10;
		Double valorCuota = 25000.00;
		

	
//ACCION		
		
		Academia DonRipRip = new Academia(nombreDeLaAcademia);	
		Curso manejoInical = new Curso(codigoCurso, tipoDeCurso, duracionCurso, valorCuota);
		Alumno nuevoAlumno =new Alumno(legajo,dni, nombre, celular, email, direccion,fechaDelInscripcion,fechaDelFinalizacion,estado);
		Boolean sePudo = DonRipRip.IngrasarCursoEnLaAcademia(manejoInical);
		
		Boolean sePudoIngresar=DonRipRip.ingresarAlumnoALaAcademia(nuevoAlumno);
		
		Boolean sePudoIngresarElAlumnoAlCurso= DonRipRip.AgregoAlumnoAlCurso(codigoCurso,legajo);
		
		
//VALIDACION
		assertTrue(sePudoIngresarElAlumnoAlCurso);

	}

	
	@Test
	public void queSePuedaObtenerLaCantidadDeAlumnosInscriptosActivosEnLaAcademia() {
		
//PREPARACION 
		//alumno 1
		Long dniDeuno =32432443L;
		String nombreDeuno ="raul Ramirez";
		Long celularDeuno = 113456556L;
		String emailDeuno="ragaremadelamano@alumno.edu.ar";
		String direccionDeuno ="calluehu 244 ";
		LocalDate fechaDelInscripcionDeuno= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacionDeuno= LocalDate.of(2023, 02, 03);
		String estadoDeuno="activo";
		String legajoUno="123FF3";
		//alumno 2
		Long dniDeDos =324324543L;
		String nombreDeDos ="Lashir";
		Long celularDeDos = 1144444456L;
		String emailDeDos="tonitini@alumno.edu.ar";
		String direccionDeDos ="machupichu 3333 ";
		LocalDate fechaDelInscripcionDeDos= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacionDeDos= LocalDate.of(2023, 02, 03);
		String estadoDeDos="activo";
		String legajoDos="365FF3";
		
		//alumno 3
		Long dniDeTres =324324643L;
		String nombreDeTres ="Menganito Ramirez";
		Long celularDeTres = 1124356456L;
		String emailDeTres="menganoagarramedelamano@alumno.edu.ar";
		String direccionDeTres ="calle walaby 2467 ";
		LocalDate fechaDelInscripcionDeTres= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacionDeTres= LocalDate.of(2023, 02, 03);
		String estadoDeTres="inactivo";
		String legajoTres="477FF3";
		//alumno 3
		Long dniDeCuatro =32432443L;
		String nombreDeCuatro ="juanita liciada";
		Long celularDeCuatro = 12333433356L;
		String emailDeCuatro="laliciadaone@alumno.edu.ar";
		String direccionDeCuatro ="calle baches 267 ";
		LocalDate fechaDelInscripcionDeCuatro= LocalDate.of(2023, 01, 03);
		LocalDate fechaDelFinalizacionDeCuatro= LocalDate.of(2023, 02, 03);
		String estadoDeCuatro="activo";
		String legajoCuatro="433FF3";
		
		String nombreDeLaAcademia = "Don Rip-Rip";

		Integer valorEsperadoDeAlumnos=3;//uno esta inactivo

	
//ACCION		
		Alumno RaulRamirez =new Alumno(legajoUno,dniDeuno, nombreDeuno, celularDeuno, emailDeuno, direccionDeuno,fechaDelInscripcionDeuno,fechaDelFinalizacionDeuno,estadoDeuno);
		Alumno Lashir =new Alumno(legajoDos, dniDeDos, nombreDeDos, celularDeDos, emailDeDos, direccionDeDos, fechaDelInscripcionDeDos, fechaDelFinalizacionDeDos, estadoDeDos);
		Alumno Menganito =new Alumno(legajoTres,dniDeTres, nombreDeTres, celularDeTres, emailDeTres,direccionDeTres, fechaDelInscripcionDeTres,fechaDelFinalizacionDeTres,estadoDeTres);
		Alumno Liciada =new Alumno(legajoCuatro,dniDeCuatro, nombreDeCuatro, celularDeCuatro, emailDeCuatro, direccionDeCuatro,fechaDelInscripcionDeCuatro,fechaDelFinalizacionDeCuatro,estadoDeCuatro);
	
		Academia DonRipRip = new Academia(nombreDeLaAcademia);
		
		Boolean sePudoIngresar1=DonRipRip.ingresarAlumnoALaAcademia(RaulRamirez);
		Boolean sePudoIngresar2=DonRipRip.ingresarAlumnoALaAcademia(Lashir);
		Boolean sePudoIngresar3=DonRipRip.ingresarAlumnoALaAcademia(Menganito);
		Boolean sePudoIngresar4=DonRipRip.ingresarAlumnoALaAcademia(Liciada);
		
		Integer sePudoObtenerCantidad=DonRipRip.obtenerCantidadDeAlumnosActivos();
		//System.out.println(sePudoObtenerCantidad);
		//System.out.println(valorEsperadoDeAlumnos);
		//VALIDACION
	
		assertEquals(valorEsperadoDeAlumnos,sePudoObtenerCantidad);
	}

	
	



	
	
}
