package ar.edu.unlam.academia.grupo6;

import java.time.LocalDate;
import java.util.HashSet;

//ATRIBUTO 
//CONSTRUCTOR
//METODO

public class Academia {
	//ATRIBUTO 
	private String nombreDeLaAcademia;
	private HashSet<Curso>cursos;
	private HashSet<Instructor>instructores;
	private HashSet<Alumno>alumnos;
// esta clase contendria al instructor asignado y a los alumnos que se hayan ingresado al curso 
	//private List<Clase>clases;
	
	


	//CONSTRUCTOR
	public Academia(String nombreDeLaAcademia) {
		this.nombreDeLaAcademia = nombreDeLaAcademia;
		cursos = new HashSet<>();
		instructores = new HashSet<>();
		alumnos =new HashSet<>();
		
	}
	//METODO




	public String getNombreDeLaAcademia() {
		return nombreDeLaAcademia;
	}




	public void setNombreDeLaAcademia(String nombreDeLaAcademia) {
		this.nombreDeLaAcademia = nombreDeLaAcademia;
	}




	public HashSet<Curso> getCursos() {
		return cursos;
	}




	public void setCursos(HashSet<Curso> cursos) {
		this.cursos = cursos;
	}




	public Boolean IngrasarCursoEnLaAcademia(Curso nombreDelCurso) {
		return cursos.add(nombreDelCurso);
	}


	

	public Boolean registrarInstructorEnAcademia(Instructor nuevoInstructor) {
		boolean seRegistro= instructores.add(nuevoInstructor);
	//	System.out.println(instructores.size());
		return seRegistro;
	}




	public Boolean ingresarAlumnoALaAcademia(Alumno nuevoAlumno) {
		boolean seRegistro= alumnos.add(nuevoAlumno);

			return seRegistro;
	}




	


	public Alumno buscarAlumnoPorLegajo(String legajo) {
		
		for(Alumno alumno:alumnos) {
			if(alumno.getLegajo().equals(legajo)) {
				return alumno;
			}
		}
		return null;
	}




	public Alumno modificarEstadoDelAlumno(String legajo) {
		for(Alumno alumno:alumnos) {
			if(alumno.getLegajo().equals(legajo)) {
				if(alumno.getEstado() == "activo") {
					alumno.setEstado("inactivo");
					return alumno;
				}
				else
				{
					alumno.setEstado("activo");
					return alumno;
				}
			}
		}
		return null;
	}




	public Curso buscarCursoPorCodigo(Integer codigoCurso) {
		for(Curso curso:cursos) {
			if(curso.getCodigoCurso().equals(codigoCurso)) {
				return curso;
			}
		}
		return null;
	}




	public Instructor aumentarElSueldoDeUnInstructor(Double aumentoDelSueldo, String legajo) {
			for(Instructor instructor:instructores){
				if(instructor.getLegajo().equals(legajo)) {
					instructor.setSueldo(instructor.getSueldo()*aumentoDelSueldo);
					return instructor;
				}
			}
				
	
		return null;
	}




	/*public Boolean AgregoAlumnoAlCurso(Curso manejoInical, Alumno nuevoAlumno) {
		manejoInical.agregaUnALumno(nuevoAlumno);
			
				
		return null;
	}
	*/

	public Boolean AgregoAlumnoAlCurso(Integer codigoCurso, String Legajo) {
		Boolean sePuedoInscribir=false;
		
		Curso curso = buscarCursoPorCodigo(codigoCurso);
		Alumno alumno = buscarAlumnoPorLegajo(Legajo);
		curso.agregaUnALumno(alumno);
		if(curso.mostrarALumno().equals(alumno)) {
			alumno.agregarUnCurso(Legajo);
			return sePuedoInscribir=true;
		}
		
			
		
		return null;
	}
	
	
	
	public Boolean AgregoInstructorAlCurso(Integer codigoCurso, String Legajo) {
		
		Boolean sePuedoAgregar=false;
		Curso curso = buscarCursoPorCodigo(codigoCurso);
		Instructor instructor= buscarInstructorPorLegajo(Legajo);
		curso.agregarUnInstructor(instructor);
	    if(curso.mostrarInstructor().equals(instructor)) {
			return sePuedoAgregar=true;
		}
		
		return null;
	}






	private Instructor buscarInstructorPorLegajo(String legajo) {
		for(Instructor instructor:instructores) {
			if(instructor.getLegajo().equals(legajo)) {
				return instructor;
			}
		}
		return null;
	}




	public Integer obtenerCantidadDeAlumnosActivos() {
		Integer contador=0;

		for(Alumno alumno:alumnos) {
			if(alumno.getEstado()=="activo") {
			contador+=1;
			}
			
		}
		return contador;
	}





	public Integer contarCantidadDeInstructoresDeLaManiana() {
		Integer contador =0;
		
		for(Instructor instructor:instructores) {
			if(instructor.getTurno()=="mañana") {
				contador ++;
				
			}
		}
		
		return contador;
	}
	
	public Instructor buscarInstructorPorDniyNombre(Long dni, String nombre) {
		for(Instructor instructor:instructores) {
			if(instructor.getNombre().equals(nombre) && instructor.getDni().equals(dni)) {
				return instructor;
			}
		}
		return null;

	}





	public Curso CambiarElValorDeLaCuotaDelCurso(Integer codigoCurso, Double nuevoValorCuota) {
		for(Curso curso:cursos) {
			if(curso.getCodigoCurso().equals(codigoCurso)) {
				curso.setValorCuota(nuevoValorCuota);
				return curso;
			}
		}
		return null;
	}






	public Boolean CambioLaFechaDeInscripcionDelAlumno(String legajo, LocalDate nuevaFechaDeInscripcion) {
		Boolean sePuedoAgregar=false;
		for(Alumno alumno:alumnos) {
			if(alumno.getLegajo().equals(legajo)) {
				
					alumno.setFechaDelInscripcion(nuevaFechaDeInscripcion);
					sePuedoAgregar=true;
				
				}
				
			}
		
		return sePuedoAgregar;
}
	

public Integer modificarVigenciaDelCurso(Integer codigoCurso, Integer nuevaVigencia) {
	for(Curso curso :cursos) {
		if(curso.getCodigoCurso().equals(codigoCurso)) {
			curso.setVigenciaCurso(nuevaVigencia);
			return curso.getVigenciaCurso();
			 
		}
	}
		return null;
	}




public Integer saberCantidadDeCursosInscriptos(String legajoUno) {
	
	for(Alumno alumno:alumnos) {
		if(alumno.getCantidadDeCursosInscripto() != null) {
			return alumno.getCantidadDeCursosInscripto();
		}
	}
	
	return null;
}




public Integer mostrarLaCantidadDeClasesDelCursoDeUnAlumnoActualizado(Integer codigoCurso, String legajo,Integer cantidadDeClasesExtra) {
	Integer respuesta=0;
	             for(Curso curso: cursos) {
	    	        if(curso.getCodigoCurso().equals(codigoCurso)&&curso.mostrarALumno().getLegajo().equals(legajo)) {	                 
				        respuesta=curso.getDuracionCurso();
		//no se q hacer aca
		             }
		
	              }
	   
	return respuesta;
}

public Integer mostrarLaCantidadDeClasesDelCursoActualizado( Integer codigoCurso) {
Integer respuesta=0;
	for(Curso curso: cursos) {
		if(curso.getCodigoCurso().equals(codigoCurso)) {
		respuesta=curso.getDuracionCurso();
				
		}
		
	}
	return respuesta;
}




public Integer agregarUnaClaseExtraAUnCursoDeUnAlumnoAUnaAcademia( Integer codigoCurso,
		String legajo) {
	Integer respuesta=0;
	for(Curso curso: cursos) {
		if(curso.getCodigoCurso().equals(codigoCurso)&&curso.mostrarALumno().getLegajo().equals(legajo)) {
			respuesta=curso.queSePuedaAgregarUnaClaseExtraAlCurso(curso.getClaseExtra());
	
			

		
		}
	
	}
	return respuesta;
}
	
}



















	




